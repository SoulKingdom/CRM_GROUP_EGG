<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<script type="text/javascript">
	var xhr = new XMLHttpRequest();
	function deleteStore(id) {
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				document.getElementById("StoreBody").innerHTML = xhr.responseText;
			}
		};
		var url = "${pageContext.request.contextPath }/store.do?method=remove&storeId="
				+ id;
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
			<div class="widget-container fluid-height clearfix">
				<div class="heading clearfix">
					<i class="icon-table"></i> 仓库列表 <a
						class="weiBoxs-dialog btn btn-sm btn-primary-outline pull-right"
						href="store.do?method=toCreateUl" dialog-title="添加仓库"><i
						class="icon-plus"></i> 添加仓库</a>
				</div>
				<div class="widget-content padded clearfix">
					<table class="table table-bordered table-hover">
						<thead>
							<tr>
								<th>名称</th>
								<th>说明</th>
								<th style="width: 15%;">操作</th>
							</tr>
						</thead>
						<tbody id="StoreBody">
							<c:forEach items="${storeList }" var="store">
								<tr>
									<td><a class="weiBoxs-dialog"
										href="product-warehouse/update.html?id=1" dialog-title="修改仓库">${store.storeName }</a></td>
									<td>${store.description }</td>
									<td><a class="btn btn-primary btn-xs weiBoxs-dialog"
										href="store.do?method=toUpdateUl&storeId=${store.storeId }"
										dialog-title="修改仓库"><i class="fa f a-edit"></i> 修改</a> <a
										class="btn btn-danger btn-xs btn-delete-dialog"
										href="javaScript:deleteStore(${store.storeId }) " title="删除"
										dialog-tip="确定要删除该仓库吗？删除后不可恢复哦！"><i
											class="glyphicon glyphicon-trash"></i> 删除</a></td>
								</tr>
							</c:forEach>
							<!--  <tr>
                        <td><a class="weiBoxs-dialog" href="product-warehouse/update.html?id=2"
                               dialog-title="修改仓库">合肥二号</a></td>
                        <td>这是二号仓库</td>
                        <td>
                            <a class="btn btn-primary btn-xs weiBoxs-dialog" href="product-warehouse/update.html?id=2"
                               dialog-title="修改仓库"><i class="fa fa-edit"></i> 修改</a>
                            <a class="btn btn-danger btn-xs btn-delete-dialog" href="product-warehouse/delete.html?id=2"
                               title="删除" dialog-tip="确定要删除该仓库吗？删除后不可恢复哦！"><i class="glyphicon glyphicon-trash"></i> 删除</a>
                        </td>
                    </tr> -->
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>

</html>
