<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<script type="text/javascript">
	function deleteSales() {
		var vals = [];
		$('input:checkbox:checked').each(function(index, item) {
			vals.push($(this).val());
		});
		if (confirm("订单删除之后,不可找回,确定删除么?")) {
			location.href = "${pageContext.request.contextPath}/order.do?method=remove&orderId="
					+ vals.join(",");
		}
	}

	function changeCondition() {
		// alert($("#field").val())
		//所有值清空
		$("#number").val("");
		$("#created_by").val("");
		$("#send_date").val("");
		//所有属性隐藏
		$("#number").css("display", "none");
		$("#created_by").css("display", "none");
		$("#send_date").css("display", "none");

		$("#" + $("#field").val()).css("display", "inline");
		;
	}

	/* $(document).ready(function(){
		alert("=======");
		}); */

	/* $(document).ready(function(){alert("有意思");});
	 */
	//s$().ready(function(){alert("==========")});
</script>
<head>
<jsp:include page="/common.jsp"></jsp:include>
</head>

<body class="navbar-top">
	<div class="modal-shiftfix">
		<jsp:include page="/menu.jsp"></jsp:include>
		<div class="container-fluid main-content">
			<div class="widget-container fluid-height clearfix">
				<div class="heading clearfix">
					<i class="icon-table"></i> 销售单 <span class="pull-right"> <a
						class="btn btn-sm btn-primary" href="sales.do?method=toCreateUl"><i
							class="icon-plus"></i> 添加销售单</a> <a class="btn btn-sm btn-default"
						href="sales.do?method=toReProductUl"><i class="icon-plus"></i>
							添加退货单</a>
					</span>
				</div>
				<div class="widget-content padded clearfix">
					<div class="dataTables_filter">
						<form class="form-inline" action="sales.do" method="get">
							<input type="hidden" name="method" value="search" />
							<div class="btn-group">
								<button type="button" class="btn btn-info dropdown-toggle"
									data-toggle="dropdown">
									按类型 <i class="caret"></i>
								</button>
								<ul class="dropdown-menu">
									<li><a href="sales.do" class="disabled"><i
											class="sales.do"></i> 全部</a></li>
									<li><a href="sales.do?method=list&orderType=1" class=""><i
											class="glyphicon glyphicon-save"></i> 销售单</a></li>
									<li><a href="sales.do?method=list&orderType=3" class=""><i
											class="glyphicon glyphicon-open"></i> 退货单</a></li>
								</ul>
							</div>
							<div class="btn-group">
								<a class="btn btn-danger deleteSales"
									href="javaScript:deleteSales();"><i
									class="glyphicon glyphicon-remove"></i> 删除</a>
							</div>
							<div class="btn-group">
								<select id="field" class="form-control"
									onchange="changeCondition()" name="field">
									<option class="" value="">--请选择筛选条件--</option>
									<option class="text" value="number">编号</option>
									<option class="text" value="created_by">制单人</option>
									<option class="date" value="send_date">销售日期</option>
								</select> <input type="text" name="number" id="number"
									style="display: none;" /> <input type="text" name="created_by"
									id="created_by" style="display: none;" /> <input type="text"
									name="send_date" id="send_date" style="display: none;" />
								<div class="form-group" id="conditionContent"></div>
								<div class="form-group" id="searchContent"></div>
							</div>
							<input type="hidden" name="type" value="" />

							<div class="btn-group">
								<button type="submit" class="btn btn-success">
									<i class="icon-search"></i> 搜索
								</button>
							</div>
						</form>
					</div>
					<div id="w0" class="grid-view">
						<div class="table-responsive">
							<table class="table table-hover" id="print">
								<thead>
									<tr>
										<th><label class="label-checkbox"> <input
												type="checkbox" class="select-on-check-all"
												name="selection_all" value="1"><span
												class="custom-checkbox"></span></label></th>
										<th nowrap>编号</th>
										<th nowrap>主题</th>
										<th nowrap>客户</th>
										<th nowrap>总金额</th>
										<th nowrap>出入库</th>
										<th nowrap>下单时间</th>
										<th nowrap>制单人</th>
										<th nowrap>创建时间</th>
										<th class="action-column">操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${ordersList}" var="orders">
										<tr data-key="${orders.orderId }">
											<td><label class="label-checkbox"> <input
													type="checkbox" name="selection[]"
													value="${orders.orderId }"><span
													class="custom-checkbox"></span></label></td>
											<td><img src="../picture/check.png" alt=""> <a
												href="sales/update.html?id=6">${orders.orderSeq }</a></td>
											<td><a href="sales/update.html?id=6">${orders.title }</a></td>
											<td><a href="customer/view.html?id=1" target="_blank">${orders.customerName }</a></td>
											<td>${orders.totalMoney }</td>
											<c:choose>
												<c:when test="${orders.status==3 }">
													<td>已出库</td>
												</c:when>
												<c:when test="${orders.status==2}">
													<td>等待出库</td>
												</c:when>
												<c:when test="${orders.status==1}">
													<td>已入库</td>
												</c:when>
												<c:otherwise>
													<td>等待入库</td>
												</c:otherwise>
											</c:choose>
											<td>${orders.orderTime }</td>
											<td>${orders.employeeName }</td>
											<td>${orders.createTime }</td>
											<td><a class="btn btn-info btn-xs"
												href="javaScript:printEven();">打印</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<div class="datatable-footer">
							<div class="dataTables_info">
								<div class="pull-left">
									第<b>${(page.pageNo-1)*page.pageSize+1 }-${page.pageNo*page.pageSize}</b>条，共<b>${page.pageSize }</b>条数据.
									<button onclick="javaScript:upPage();">上一页</button>
									<button onclick="javaScript:nextPage();">下一页</button>
								</div>
							</div>
							<div class="dataTables_paginate paging_full_numbers"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	//初始化属性
	$(function() {
		var pageCond = $("#${checkedType}").val();
		if (!(pageCond != null && pageCond != "")) {
			$("#field").val("${checkedType}");
			$("#${checkedType}").css("display", "inline");
			$("#${checkedType}").val("${checkedValue}");
		}
	});

	function nextPage() {
		var para = "${checkedType}";
		if (para != null && para != "") {
			var pageCond = $("#${checkedType}").val();
			if (pageCond != null && pageCond != "") {
				location.href = "sales.do?method=list&pageNo=${page.pageNo+1}&totalPage=${page.totalPages }&${checkedType}=${checkedValue}";
			}
		} else {
			location.href = "sales.do?method=list&pageNo=${page.pageNo+1}&totalPage=${page.totalPages }";
		}
	}

	function upPage() {
		var para = "${checkedType}";
		if (para != null && para != "") {
			var pageCond = $("#${checkedType}").val();
			if (pageCond != null && pageCond != "") {
				location.href = "sales.do?method=list&pageNo=${page.pageNo-1}&${checkedType}=${checkedValue}";
			}
		} else {
			location.href = "sales.do?method=list&pageNo=${page.pageNo-1}";
		}
	}
	
	function printEven(){
	 	var newWin=window.open('');//新开页面
		var print=document.getElementById("print");//提取要打印的内容
		newWin.document.write(print.outerHTML);//输入要打印的内容
		var link=newWin.document.createElement("link");//插入新样式文件
		link.href="${pageContext.request.contextPath }/css/bootstrap.css";
		link.type="text/css";
		link.rel="stylesheet";
		
		var link2=newWin.document.createElement("link");//插入新样式文件
		link2.href="${pageContext.request.contextPath }/css/google-fonts.css";
		link2.type="text/css";
		link2.rel="stylesheet";
		
		var link3=newWin.document.createElement("link");//插入新样式文件
		link3.href="${pageContext.request.contextPath }/css/font-awesome.css";
		link3.type="text/css";
		link3.rel="stylesheet";
		
		var link4=newWin.document.createElement("link");//插入新样式文件
		link4.href="${pageContext.request.contextPath }/css/isotope.css";
		link4.type="text/css";
		link4.rel="stylesheet";
		
		var link5=newWin.document.createElement("link");//插入新样式文件
		link5.href="${pageContext.request.contextPath }/css/style.css";
		link5.type="text/css";
		link5.rel="stylesheet";
		
		var link6=newWin.document.createElement("link");//插入新样式文件
		link6.href="${pageContext.request.contextPath }/css/dataTables.bootstrap-1.10.13.css";
		link6.type="text/css";
		link6.rel="stylesheet";
		
		newWin.document.head.appendChild(link);
		newWin.document.head.appendChild(link2);
		newWin.document.head.appendChild(link3);
		newWin.document.head.appendChild(link4);
		newWin.document.head.appendChild(link5);
		newWin.document.head.appendChild(link6);
		newWin.print();  
	}
</script>
</html>
