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
					<i class="icon-table"></i> 添加仓库
				</div>
				<form action="store.do" method="get">
					<input type="hidden" name="method" value="add" />
					<div class="widget-content padded clearfix">
						<div class="container">
							<div class="col-sm-8">
								<label class="control-label col-sm-2"
									for="customer-customer_name">仓库名称</label>
								<div class="col-sm-8">
									<input type="text" id="storeName" class="form-control"
										name="storeName" placeholder="仓库名称">
								</div>
							</div>
							<br /> <br /> <br />
							<div class="col-sm-8">
								<label class="control-label col-sm-2"
									for="customer-customer_name">仓库描述</label>
								<div class="col-sm-8">
									<input type="text" id="description" class="form-control"
										name="description" placeholder="仓库描述">
								</div>
							</div>
						</div>
						<br /> <br />
						<button type="submit" class="btn btn-success "
							style="margin-left: 400px;">
							<i class="glyphicon glyphicon-add"></i>添加仓库
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>

</html>
