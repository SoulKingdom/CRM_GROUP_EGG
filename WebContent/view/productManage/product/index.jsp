﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<script type="text/javascript">
var xhr = new XMLHttpRequest();
function removeCheck() {
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			document.getElementById("productBody").innerHTML = xhr.responseText;
		}
	};
	var vals = [];
	//获取选中文本框的值
	$('input:checkbox:checked').each(function(index, item) {
		vals.push($(this).val());
	});
	//location.href="product.do?method=remove&prodId="+vals.join();
	var url = "${pageContext.request.contextPath }/product.do?method=remove&prodId="+vals.join(",");
	xhr.open("GET", url, true);
	xhr.send();
}
</script>
<head>
<jsp:include page="/common.jsp"></jsp:include>
</head>

<body class="navbar-top">
	<div class="modal-shiftfix">
		<jsp:include page="/menu.jsp"></jsp:include>
		<div class="container-fluid main-content">
			<div class="row">
				<div class="col-md-9 col-sm-9">
					<div class="widget-container fluid-height clearfix">
						<div class="heading clearfix">
							<i class="icon-table"></i> 产品管理 <a
								class="btn btn-sm btn-primary-outline pull-right"
								href="product.do?method=toCreateUl"><i class="icon-plus"></i>
								添加产品</a>
						</div>
						<div class="widget-content padded clearfix">
							<div class="dataTables_filter">
								<div class="row">
									<div class="col-md-8 col-sm-8">
										<form class="form-inline" action="product.do">
											<input type="hidden" name="method" value="search" />
											<div class="btn-group">
												<button class="btn btn-danger btn-sm deleteProducts"
													onclick="javaScript:removeCheck();" type="button">
													<i class="glyphicon glyphicon-remove"></i>
													删除
												</button>
											</div>
											<input type="hidden" value="" name="category_id" />

											<div class="btn-group">
												<input type="text" class="form-control input-sm"
													id="glyphicon-search" name="prodName" value=""
													placeholder="产品名称">
											</div>
											<div class="btn-group">
												<button class="btn btn-success btn-sm" type="submit">
													<i class="icon-search"></i> 搜索
												</button>
											</div>
										</form>
									</div>
								</div>
							</div>
							<div id="w0" class="grid-view">
								<div class="table-responsive">
									<table class="table table-hover">
										<thead>
											<tr>
												<th><label class="label-checkbox"> <input
														type="checkbox" class="select-on-check-all"
														name="selection_all" value="1"><span
														class="custom-checkbox"></span></label></th>
												<th nowrap>名称</th>
												<th nowrap>规格</th>
												<th nowrap>创建时间</th>
												<th nowrap>更新时间</th>
												<th class="action-column">操作</th>
											</tr>
										</thead>
										<tbody id="productBody">
											<c:forEach items="${productList}" var="product">
												<tr data-key="${product.productId }">
													<td><label class="label-checkbox"> <input
															type="checkbox" name="selection[]"
															value="${product.productId }"><span
															class="custom-checkbox"></span></label></td>
													<td>${product.prodName }</td>
													<td>${product.prodStandard }</td>
													<td>${product.createTime }</td>
													<td>${product.updateTime }</td>
													<td><a class="label label-warning edit"
														href="product.do?method=queryOne&id=${product.productId}"
														title="更新" aria-label="更新">修改</a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
								<div class="datatable-footer">
									<div class="dataTables_info">
										<div class="pull-left">
											第<b>${(page.pageNo-1)*page.pageSize+1 }-${page.pageNo*page.pageSize}</b>条，共<b>${page.pageSize }</b>条数据.
											<button
												onclick="location.href='product.do?method=list&pageNo=${page.pageNo-1}'">上一页</button>
											<button
												onclick="location.href='product.do?method=list&pageNo=${page.pageNo+1}&totalPage=${page.totalPages }'">下一页</button>

										</div>
									</div>
									<div class="dataTables_paginate paging_full_numbers"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3 col-sm-3">
					<div class="list-group">
						<a href="product.do" class="list-group-item active">
							<p>全部</p>
						</a>
						<c:forEach items="${productTypeList }" var="productType">
							<a href="product.do?method=sort&typeId=${productType.typeId }"
								class="list-group-item ">
								<p>${productType.typeName }</p>
							</a>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
