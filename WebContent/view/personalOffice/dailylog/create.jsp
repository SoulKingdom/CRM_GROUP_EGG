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
			<div class="widget-container fluid-height clearfix mwi1200">
				<div class="heading clearfix">
					写日志 <i class="icon-reply pull-right" onclick="history.go(-1);"></i>
				</div>
				<div class="widget-content padded">
					<form id="w0" class="form-horizontal" action="dailylog.do"
						method="get">
						<input type="hidden" name="_csrf"
							value="TUtKTFZURC0vPBwnby0HVRwlehwbbCtmEiE7KToELXU6HwQEJBI.Gg==">

						<div class="form-group field-dailylog-daily_type required">
							<label class="control-label col-sm-2" for="dailylog-daily_type">日志类型</label>

							<div class="col-sm-8">
								<input type="hidden" name="Dailylog[daily_type]" value="">

								<div id="dailylog-daily_type">
									<label class="label-radio inline"> <input type="radio"
										name="Dailylog[daily_type]" value="1" checked> <span
										class="custom-radio"></span>日报
									</label> <label class="label-radio inline"> <input type="radio"
										name="Dailylog[daily_type]" value="2"> <span
										class="custom-radio"></span>周报
									</label> <label class="label-radio inline"> <input type="radio"
										name="Dailylog[daily_type]" value="3"> <span
										class="custom-radio"></span>月报
									</label>
								</div>
							</div>
							<div class="help-block help-block-error"></div>
						</div>
						<div class="form-group field-dailylog-subject required">
							<label class="control-label col-sm-2" for="dailylog-subject">主题</label>

							<div class="col-sm-8">
								<input type="text" id="dailylog-subject" class="form-control"
									name="Dailylog[subject]" value="2017-03-29工作日志" maxlength="50"
									placeholder="主题">
							</div>
							<div class="help-block help-block-error"></div>
						</div>
						<%-- 	<div class="form-group field-dailylog-content required">
							<div class="col-sm-2"></div>
							<div class="col-sm-8">
								<select id="FIELD_ID" class="form-control" name="FIELD_ID">
									<option value="">请选择负责人</option>
									<c:forEach items="${principalVoList}" var="dailyLogVo">
										<option value="1">${dailyLogVo.employeeName}</option>
									</c:forEach>
								</select>
							</div>
						</div>
 --%>
						<div class="form-group field-dailylog-content required">
							<label class="control-label col-sm-2" for="dailylog-content">内容</label>
							<div class="col-sm-8">
								<textarea class="form-control " name="content"></textarea>
							</div>
							<div class="col-sm-8">
								<script type="text/plain"
									id="54cab28bd9f858939b1bcb5ccb41d3fd_id"
									name="Dailylog[content]"></script>
							</div>
						</div>


						<div class="form-group">
							<label class="col-sm-2 control-label"></label> <input
								type="hidden" name="method" value="add" />
							<div class="col-lg-10">
								<button type="submit" class="btn btn-success">创建</button>
								<button type="button" class="btn btn-default"
									onClick="history.go(-1);">返回</button>
								<input type="hidden" name="reback">
							</div>
							<!-- /.col -->
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>

</html>
