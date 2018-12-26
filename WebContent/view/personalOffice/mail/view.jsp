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
			<div class="row">
				<div class="col-sm-2">
					<div class="list-group">
						<a class="list-group-item " href="mail/index.html">
							<p>收件箱</p>
						</a> <a class="list-group-item " href="mail/starred.html">
							<p>星标邮件</p>
						</a> <a class="list-group-item " href="mail/important.html">
							<p>重要邮件</p>
						</a> <a class="list-group-item " href="mail/sent.html">
							<p>发件箱</p>
						</a>
					</div>
				</div>

				<div class="col-sm-10">
					<div class="widget-container fluid-height clearfix">
						<div class="widget-content padded clearfix">
							<form method="post" action="" id="writeForm">

								<div class="form-group clearfix">
									<span class="pull-left">发件人：${instationMailVo.senderPerson}</span>
									<span class="pull-right"></span>
								</div>
								<div class="form-group clearfix">
									<span class="pull-left">时间：${instationMailVo.createTime}</span>
									<span class="pull-right"></span>
								</div>
								<div class="form-group">
									<div class="input-group">
										<span class="input-group-addon">主&nbsp;&nbsp;&nbsp;&nbsp;题</span>
										<input type="text" name="Mail[subject]" class="form-control"
											placeholder="${instationMailVo.theme}">
									</div>
								</div>
								<div class="form-group">
									<h5 style="margin-top: 30px">邮件内容</h5>
									<textarea class="form-control">${instationMailVo.content}</textarea>
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
