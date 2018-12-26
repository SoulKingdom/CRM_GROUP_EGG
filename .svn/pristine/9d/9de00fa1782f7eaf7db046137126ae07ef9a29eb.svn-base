<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${productList}" var="product">
	<tr data-key="${product.productId }">
		<td><label class="label-checkbox"> <input type="checkbox"
				name="selection[]" value="${product.productId }"><span
				class="custom-checkbox"></span></label></td>
		<td>${product.prodName }</td>
		<td>${product.prodStandard }</td>
		<td>${product.createTime }</td>
		<td>${product.updateTime }</td>
		<td><a class="label label-warning edit"
			href="product.do?method=queryOne&id=${product.productId}" title="更新"
			aria-label="更新">修改</a></td>
	</tr>
</c:forEach>