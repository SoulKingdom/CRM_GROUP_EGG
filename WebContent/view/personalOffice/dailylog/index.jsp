<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<head>
<jsp:include page="/common.jsp"></jsp:include>
</head>

<body class="navbar-top">
	<div class="modal-shiftfix">
		<jsp:include page="/menu.jsp"></jsp:include>
		<div class="container-fluid main-content">
			<style>
.status_style {
	color: #D3D6DA;
}

.status_style strong {
	color: #001930;
}

.at {
	font-weight: bold;
	color: #000000;
}
</style>
			<div class="row">
				<div class="col-md-2 col-sm-2 no-padding-right">
					<div class="list-group">
						<a class="list-group-item active"
							href="${pageContext.request.contextPath}/dailylog.do?method=list">
							<p>全部</p>
						</a> <a class="list-group-item "
							href="${pageContext.request.contextPath}/dailylog.do?method=queryByDate&search_status=4"">
							<p>日报</p>
						</a> <a class="list-group-item "
							href="${pageContext.request.contextPath}/dailylog.do?method=queryByDate&search_status=5">
							<p>周报</p>
						</a> <a class="list-group-item "
							href="${pageContext.request.contextPath}/dailylog.do?method=queryByDate&search_status=6">
							<p>月报</p>
						</a>
					</div>
				</div>
				<div class="col-lg-10 col-md-10 col-sm-10 col-xs-10">
					<div class="panel panel-default">
						<div class="panel-body">
							<strong>视图：</strong> <i class="fa fa-list"></i> <a
								href="${pageContext.request.contextPath}/dailylog.do?method=list"
								class="at">全部</a> | <a
								href="${pageContext.request.contextPath}/dailylog.do?method=list">我的日志</a>
							&nbsp;&nbsp;&nbsp; <i class="fa fa-clock-o"></i> <a
								href="${pageContext.request.contextPath}/dailylog.do?method=queryByDate&search_status=4">今日的</a>
							| <a
								href="${pageContext.request.contextPath}/dailylog.do?method=queryByDate&search_status=5">本周的</a>
							| <a
								href="${pageContext.request.contextPath}/dailylog.do?method=queryByDate&search_status=6">本月的</a>
							| <a
								href="${pageContext.request.contextPath}/dailylog.do?method=queryByDate&search_status=7">最近更新</a>
						</div>
					</div>
					<div class="widget-container fluid-height clearfix">
						<div class="heading clearfix">
							<i class="icon-table"></i> 工作日志 <a id="add-row"
								class="btn btn-sm btn-primary-outline pull-right"
								href="dailylog.do?method=toCreateUl"><i class="icon-plus"></i>
								新增日志</a>
						</div>
						<div class="widget-content padded clearfix">
							<div class="dataTables_filter">
								<div class="row">
									<div class="col-lg-12">
										<form class="form-inline" action="dailylog.do" method="get">
											<input type="hidden" name="search_status"> <input
												type="hidden" name="daily_type"> <input
												type="hidden" name="method" value="queryBylike" />
											<div class="btn-group">
												<select id="field" class="form-control"
													onchange="changeCondition()" name="field">
													<option class="" value="">--请选择筛选条件--</option>
													<option class="text" value="subject">主题</option>
													<option class="date" value="created_at">创建时间</option>
													<option class="date" value="updated_at">修改时间</option>
												</select>

												<div class="form-group" id="conditionContent"></div>
												<div class="form-group" id="searchContent"></div>
											</div>
											<div class="btn-group">

												<button type="submit" class="btn btn-success">
													<i class="glyphicon glyphicon-search"></i> 搜索
												</button>
											</div>
										</form>
									</div>
								</div>
							</div>
							<form id="actionForm" action="/dailylog/index.html" method="post">
								<input type="hidden" name="_csrf"
									value="WmJieldtLnA4FTQRbhRtCAsMUioaVUE7BQgTHzs9RygtNiwyJStURw==">

								<div id="w0" class="grid-view">
									<div class="table-responsive">
										<table class="table table-hover">
											<thead>
												<tr>
													<th>#</th>
													<th nowrap>主题</th>
													<th nowrap>负责人</th>
													<th nowrap>创建时间</th>
													<th nowrap>更新时间</th>
													<th nowrap>评论数</th>
													<th class="action-column">操作</th>
												</tr>
											</thead>
											<tbody>
												<c:if test="${dailyLogVoListSize>0}">
													<c:forEach items="${dailyLogVoList}" var="dailyLogVo">
														<tr data-key="${dailyLogVo.recordId}">
															<td>${dailyLogVo.recordId}</td>
															<td><a href="dailylog/view.html?id=2">${dailyLogVo.title}</a></td>
															<td>${dailyLogVo.creater}</td>
															<td>${dailyLogVo.createTime}</td>
															<td>${dailyLogVo.updateTime}</td>
															<td>${dailyLogVo.count}</td>
															<td><a class="label label-success"
																href="${pageContext.request.contextPath}/dailylog.do?method=queryById&recordId=${dailyLogVo.recordId}"
																title="查看" aria-label="查看">查看</a></td>
														</tr>
													</c:forEach>
												</c:if>
												<c:if test="${dailyLogVoListSize<=0}">
													<tbody>
														<tr>
															<td>暂无数据</td>
														</tr>
													</tbody>
												</c:if>
											</tbody>
										</table>
									</div>
									<div class="datatable-footer">
										<div class="dataTables_info">
											<div class="pull-left">
												第<b>1-${dailyLogVoListSize}</b>条，共<b>${dailyLogVoListSize}</b>条数据.
											</div>
										</div>
										<div class="dataTables_paginate paging_full_numbers"></div>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>
