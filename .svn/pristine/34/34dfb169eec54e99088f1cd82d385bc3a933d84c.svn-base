<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach items="${storeList }" var="store">
	<tr>
		<td><a class="weiBoxs-dialog"
			href="product-warehouse/update.html?id=1" dialog-title="修改仓库">${store.storeName }</a></td>
		<td>${store.description }</td>
		<td><a class="btn btn-primary btn-xs weiBoxs-dialog"
			href="product-warehouse/update.html?id=1" dialog-title="修改仓库"><i
				class="fa f a-edit"></i> 修改</a> <a
			class="btn btn-danger btn-xs btn-delete-dialog"
			href="javaScipr:deleteStore(${store.storeId }) " title="删除"
			dialog-tip="确定要删除该仓库吗？删除后不可恢复哦！"><i
				class="glyphicon glyphicon-trash"></i> 删除</a></td>
	</tr>
</c:forEach>