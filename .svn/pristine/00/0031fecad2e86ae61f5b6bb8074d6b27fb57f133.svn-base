<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<script type="text/javascript">
	//显示商品信息
	function displayProduct() {
		var data = {};
		data.prodId = $("#productId").val();
		$.ajax({
			type : 'get',
			url : 'sales.do?method=display',
			data : data,
			cache : false,
			sync : true,
			success : function(msg) {
				var json = JSON.parse(msg);

				if (0 == json.flag) {
					alert(json.msg);
					return;
				} else {
					$("#product_retailPrice").val(json.retailPrice);
					$("#product_standard")[0].innerHTML = json.prodStandard;
					//document.getElementById("product_retailPrice").value = xhr.responseText;
					/* window.location.href = 'sales.do?method=display'; */
				}
			},
			error : function() {
				alert("请求失败");
				return false;
			}
		});

		/* 
		var xhr = new XMLHttpRequest();
		//通过ajax获取数据

		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				document.getElementById("product_retailPrice").value = xhr.responseText;
			}
		};

		var varId = $("#productId").val();
		var url = "${pageContext.request.contextPath }/sales.do?method=display&prodId="+varId;
		xhr.open("GET", url, true);
		xhr.send(); */

	}
	//计算产品数量
	function product_calculate(num) {
		//商品数量,售价,折扣,税额
		var vproAmount = $("#product_amount_" + num).val();
		var vproduct_retailPrice = $("#product_retailPrice").val();
		var product_discount_rate_1 = $("#product_discount_rate_1").val();
		var vproduct_tax_rate_1 = $("#product_tax_rate_1").val();
		//折扣额
		var vproduct_discount_1;
		//税额
		var varProduct_rate_money;
		//税前
		var varProduct_rate_before;
		//税后
		var varProduct_rate_after;
		//判断不为空
		if (vproAmount != "" && vproduct_retailPrice != ""
				&& product_discount_rate_1 != "") {
			//折扣额
			vproduct_discount_1 = Number(vproAmount)
					* Number(vproduct_retailPrice)
					* Number(product_discount_rate_1) * Number(0.01);
			$("#product_discount_1").val(vproduct_discount_1);
		}

		if (vproAmount != "" && vproduct_retailPrice != ""
				&& vproduct_tax_rate_1 != "") {
			//税额
			varProduct_rate_money = Number(vproAmount)
					* Number(vproduct_retailPrice)
					* Number(vproduct_tax_rate_1) * Number(0.01);
			$("#product_tax_price_1").val(varProduct_rate_money);
			//税前
			$("#product_no_tax_price_1").val(
					Number(vproAmount) * Number(vproduct_retailPrice));
			//税后
			$("#product_prime_price_1").val(
					Number(vproAmount) * Number(vproduct_retailPrice)
							- Number(varProduct_rate_money));
			$("#totalMoney").val(
					Number(vproAmount) * Number(vproduct_retailPrice)
							- Number(varProduct_rate_money));
		}
		totalMoney
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
					<i class="icon-reorder"></i> 新增采购单 <a href="javascript:;"
						class="pull-right" onclick="history.go(-1);"><i
						class="icon-reply"></i></a>
				</div>
				<div class="widget-content padded clearfix">
					<form id="billForm" class="form-horizontal" action="purchase.do"
						method="get">
						<input type="hidden" name="method" value="add" />
						<div class="form-body">
							<table width="100%" border="0" cellspacing="0" cellpadding="0"
								style="margin-bottom: 10px;">
								<tr>
									<td align="right"
										style="font-weight: bold; color: red; font-size: 18px; line-height: 40px;">——
										XS201703294</td>
								</tr>
								<tr>
									<td class="form-inline"><label>客户：</label> <input
										type="hidden" name="customer_id" id="customer_id" value="">
										<select name="customerId">
											<option value="">请选择客户</option>
											<c:forEach items="${customerVoList }" var="customerVo">
												<option value="${customerVo.customerId }">${customerVo.customerName }</option>
											</c:forEach>
									</select> <!--   <input type="text" value="" name="customer_name"
                                           class="form-control weiBoxs-dialog selectCustomer" id="customer_name"
                                           dialog-title="选择客户" dialog-size="large"
                                           dialog-url="/customer/dialog-list.html"> -->
										<label style="margin-left: 10px;">主题：</label> <input
										type="text" name="title" class="form-control" id="subject"
										value=""> <label style="margin-left: 10px;">购单日期：</label>
										<input type="text" id="w0" class="form-control form_datetime"
										name="orderTime" value="2017-03-29" readonly
										style="width: 170px;">

										<div style="float: right;">
											<label style="margin-left: 10px;">制单人：</label> <select
												name="operator" id="" class="form-control">
												<option value="">===请选择制单人===</option>
												<c:forEach items="${employeeList }" var="employee">
													<option value="${employee.employeeId }">${employee.employeeName }</option>
												</c:forEach>
											</select>
											<!--  <input
												type="text" class="form-control" value="小明"
												 disabled>
												 <input type="hidden" name="operator" value="2" /> -->
											<input type="hidden" name="status" value="2" /> <input
												type="hidden" name="orederType" value="2" />
										</div></td>
								</tr>
							</table>
							<div class="row-fluid">
								<div class="span12">
									<table class="table table-bordered" id="no-input-border"
										width="95%" border="0" cellspacing="1" cellpadding="0">
										<thead>
											<tr>
												<th colspan="12" valign="center">商品信息</th>
												<th style="border: none; float: right;"><input
													type="button" class="btn btn-primary weiBoxs-dialog"
													dialog-callback="productCallBacks" dialog-title="选择产品"
													dialog-size="large" dialog-url="/product/dialog-list.html"
													value="+添加产品"></th>
											</tr>
											<tr style="background-color: #E0E8FF; text-align: center;">
												<td style="width: 2%;">&nbsp;</td>
												<td style="width: 15%;">商品</td>
												<td>规格</td>
												<td>数量</td>
												<td>售价</td>
												<td>折扣率(%)</td>
												<td>折扣额</td>
												<td>税率(%)</td>
												<td>税额</td>
												<td>税前</td>
												<td>税后</td>
												<td style="width: 10%;">仓库</td>
												<td>备注</td>
											</tr>
										</thead>
										<tbody id="view_row">
											<tr id="row_1">
												<td style="text-align: center;"><a
													href="javascript:void(0);" class="reduce_one"><i
														class="glyphicon glyphicon-minus"></i></a></td>
												<td><select name="productId" id="productId"
													onchange="javaScript:displayProduct();">
														<option value="">请选择商品</option>
														<c:forEach items="${productList}" var="product">
															<option value="${product.productId }">${product.prodName }</option>
														</c:forEach>
												</select> <!-- <input type="hidden" name="product[1][product_id]"
													id="product_id_1" class="product_id" value="0"> <input
													type="text" id="product_name_1" class="form-control"
													name="product[1][name]"> --></td>
												<td><span id="product_standard"
													style="display: inline-block; min-width: 50px;"></span></td>
												<td><input type="text" name="buyNums"
													id="product_amount_1" class="amount form-control"
													onkeyup="product_calculate(1)"
													onfocus="$(this).onlypressnum();" value=""></td>
												<td><input type="text" name="realPrices"
													id="product_retailPrice" onkeyup="product_calculate(1)"
													class="form-control" value="" readonly></td>
												<td><input type="text" name="product[1][discount_rate]"
													id="product_discount_rate_1" class="form-control"
													onkeyup="product_calculate(1)" value="5"></td>
												<td><input type="text" id="product_discount_1"
													class="product_discount form-control" readonly="readonly">
												</td>
												<td><input type="text" name="product[1][tax_rate]"
													id="product_tax_rate_1" onkeyup="product_calculate(1)"
													class="form-control" value="5"></td>
												<td><input type="text" id="product_tax_price_1"
													class="tax_price form-control" readonly="readonly">
												</td>
												<td><input type="text" id="product_no_tax_price_1"
													class="no_tax_price form-control" readonly="readonly">
												</td>
												<td><input type="text" name="realTotalPrice"
													id="product_prime_price_1" class="prime_price form-control"
													readonly="readonly"></td>
												<td>
													<div class="divSelect">
														<select name="storeId" id="product_warehouse_id_1"
															class="form-control" style="padding: 0px;">
															<c:forEach items="${storeList }" var="store">
																<option value="${store.storeId }">${store.storeName }</option>
															</c:forEach>
															<!-- <option value="1">合肥一号</option>
															<option value="2">合肥二号</option> -->
														</select>
													</div>
												</td>
												<td><input type="text" name="product[1][description]"
													class="form-control"></td>
											</tr>
										</tbody>
										<tbody id="add_products">
										</tbody>
										<tbody>
											<tr style="background-color: #FFFFF3">
												<td></td>
												<td>合计</td>
												<td></td>
												<td id="total_amount_val">0</td>
												<td></td>
												<td></td>
												<td id="total_product_discount_val">0</td>
												<td></td>
												<td id="total_tax_price_val">0</td>
												<td id="total_no_tax_price_val">0</td>
												<td id="total_prime_price_val">0</td>
												<td></td>
												<td></td>
											</tr>
											<tr style="background-color: #FFFFF1">
												<td>&nbsp;</td>
												<td>其他费用</td>
												<td colspan="2"><input type="text"
													name="discount_price" class="form-control"
													placeholder="0.00" id="discount_price" value="0"
													onkeyup="cal_discount_price()"></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td></td>
												<td>最终应付</td>
												<td colspan="2"><input type="text" name="totalMoney"
													class="form-control" placeholder="0.00" id="totalMoney"
													readonly="true" value=""></td>
											</tr>
											<tr>
												<td>地址</td>
												<td colspan="12"><input type="text"
													class="normal_input form-control" name="address" value=""
													placeholder="发货地址..."></td>
											</tr>
											<tr>
												<td>备注</td>
												<td colspan="12"><textarea style="min-height: 50px;"
														name="description" class="form-control"></textarea></td>
											</tr>
										</tbody>
										<tfoot>
											<tr>
												<td style="text-align: center;" colspan="13"><input
													id="submitForm" class="btn btn-success" type="submit"
													value="保存">&nbsp; <input type="hidden" name="type"
													value="10" /> <input class="btn btn-default" type="button"
													onclick="javascript:history.go(-1)" value="返回">&nbsp;
													<input type="hidden" name="reback"></td>
											</tr>
										</tfoot>
									</table>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>

</html>
