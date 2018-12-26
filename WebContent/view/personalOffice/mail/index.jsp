﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<jsp:include page="/common.jsp"></jsp:include>
<script type="text/javascript">
    function doCheck() {
		var selectComAy=document.getElementsByName("selection");
		for (var i = 0; i < selectComAy.length; i++) {
			selectComAy[i].checked=!selectComAy[i].checked;
		}
	}
    function doDeleMost() {
		var delSeleAy=new Array();
		var selectComAy=document.getElementsByName("selection");
		for (var i = 0; i < selectComAy.length; i++) {
			if(selectComAy[i].checked)
			{
				delSeleAy.push(selectComAy[i].value);
			}
		}
		
			if(delSeleAy.length==0)
			{
			alert("请选中删除的记录");
			}
		else if(confirm("您确认要删除嘛"))
			{
			location.href="mail.do?method=delete&mailId="+delSeleAy.join(",");
			}
   
	}
    
    function updateStatus(status) {
    	var updMailAy=new  Array();
    	var selectComAy=document.getElementsByName("selection");
		for (var i = 0; i < selectComAy.length; i++) {
			if(selectComAy[i].checked)
			{
				updMailAy.push(selectComAy[i].value);
			}
		}
		if(updMailAy.length==0)
		{
		alert("请选中要进行操作的记录");
		}
	else
		{
		location.href="mail.do?method=updateByStatus&status="+status+"&mailId="+updMailAy.join(",");
		}
    	
    	
	}
    
    </script>
</head>

<body class="navbar-top">
	<div class="modal-shiftfix">
		<jsp:include page="/menu.jsp"></jsp:include>
		<div class="container-fluid main-content">
			<div class="row">
				<div class="col-sm-2">
					<div class="list-group">
						<a class="list-group-item active"
							href="${pageContext.request.contextPath}/mail.do?method=list">
							<p>收件箱</p>
						</a> <a class="list-group-item "
							href="${pageContext.request.contextPath}/mail.do?method=querystatus&status=2">
							<p>星标邮件</p>
						</a> <a class="list-group-item "
							href="${pageContext.request.contextPath}/mail.do?method=querystatus&status=3">
							<p>重要邮件</p>
						</a> <a class="list-group-item "
							href="${pageContext.request.contextPath}/mail.do?method=listtttt">
							<p>发件箱</p>
						</a>
					</div>
				</div>
				<!-- /.col -->
				<div class="col-sm-10">
					<div class="widget-container fluid-height clearfix">
						<div class="widget-content padded clearfix">
							<form action="mail.do" method="get">
								<input type="hidden" name="method" value="queryLike" />
								<div class="input-group">
									<input class="form-control" type="text" name="k"
										placeholder="主题关键字..."> <span class="input-group-btn">
										<button class="btn btn-default" type="submit">搜索</button>
									</span>
								</div>
							</form>
							<div class="dataTables_filter clearfix">
								<label class="label-checkbox inline" style="margin-left: 8px;">
									<input type="checkbox" id="chk-all"> <span
									class="custom-checkbox"></span>
								</label> <a class="btn btn-sm btn-success"
									href="view/personalOffice/mail/write.jsp">写邮件</a> <a
									class="btn btn-sm btn-danger mail-delete"
									onclick="doDeleMost()">删除</a>

								<div class="pull-right">
									<div class="btn-group">
										<button class="btn btn-warning-outline dropdown-toggle btn-sm"
											data-toggle="dropdown">
											<i class="icon-reorder"></i>操作<span class="caret"></span>
										</button>
										<ul class="dropdown-menu">
											<li><a href="javaScript:updateStatus(1)"><i
													class="icon-envelope"></i> 标为已读</a></li>
											<li><a href="javaScript:updateStatus(0)"><i
													class="icon-envelope" style="color: #f5a532"></i> 标为未读</a></li>
											<li><a href="javaScript:updateStatus(2)"><i
													class="icon-star" style="color: #f5a532"></i> 设为星标</a></li>
											<li><a href="javaScript:updateStatus(1)"><i
													class="icon-star"></i> 取消星标</a></li>
											<li><a href="javaScript:updateStatus(3)"><i
													class="icon-bookmark" style="color: red"></i> 设为重要</a></li>
											<li><a href="javaScript:updateStatus(1)"><i
													class="icon-bookmark"></i> 取消重要</a></li>
										</ul>
									</div>
									<!-- /btn-group -->
								</div>
							</div>
							<c:if test="${instationMailVoListSize==0}">
								<div>还没有邮件！</div>
							</c:if>
							<c:if test="${instationMailVoListSize>0}">
								<div>
									<table class="table table-hover">
										<thead>
											<tr>
												<th><label class="label-checkbox"> <input
														type="checkbox" class="select-on-check-all"
														name="selection" value="1" onclick="doCheck()"><span
														class="custom-checkbox"></span></label></th>
												<th>状态</th>
												<th nowrap>发件人</th>
												<th nowrap>主题</th>
												<th nowrap>时间</th>
												<th class="action-column">操作</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${instationMailVoList}"
												var="instationMailVo">
												<tr data-key="${instationMailVo.mailId}">
													<td><label class="label-checkbox"> <input
															type="checkbox" name="selection"
															value="${instationMailVo.mailId}"><span
															class="custom-checkbox"></span></label></td>
													<td><c:if test="${instationMailVo.status=='1'}">
															<i class="icon-envelope"></i>已读</c:if> <c:if
															test="${instationMailVo.status=='0'}">
															<i class="icon-envelope" style="color: #f5a532"></i>未读</c:if> <c:if
															test="${instationMailVo.status=='2'}">
															<i class="icon-star" style="color: yellow"></i>星标</c:if> <c:if
															test="${instationMailVo.status=='3'}">
															<i class="icon-bookmark" style="color: red"></i>重要</c:if> <c:if
															test="${instationMailVo.status=='4'}">
															<i class="icon-envelope"></i>已发</c:if></td>
													<td>${instationMailVo.senderPerson}</td>
													<td>${instationMailVo.theme}</td>
													<td>${instationMailVo.updateTime}</td>
													<td><a class="label label-success"
														href="${pageContext.request.contextPath}/mail.do?method=query&mailId=${instationMailVo.mailId}"
														title="查看" aria-label="查看">查看</a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</c:if>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>

</html>
