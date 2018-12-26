package net.wanho.po.product;

import java.math.BigDecimal;

/**
 * 订单详情
 * @author Administrator
 *
 */
public class OrdersDetail {
	/**详情编码*/
	private Integer detailId;
	/**订单编码*/
	private Integer orderId;
	/**仓库编码*/
	private Integer storeId;
	/**产品编码*/
	private Integer productId;
	/**购买数量*/
	private Integer buyNums;
	/**实际单价*/
	private BigDecimal realPrices;
	/**订单价格*/
	private BigDecimal realTotalPrice;
	public OrdersDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrdersDetail(Integer detailId, Integer orderId, Integer storeId, Integer productId, Integer buyNums,
			BigDecimal realPrices, BigDecimal realTotalPrice) {
		super();
		this.detailId = detailId;
		this.orderId = orderId;
		this.storeId = storeId;
		this.productId = productId;
		this.buyNums = buyNums;
		this.realPrices = realPrices;
		this.realTotalPrice = realTotalPrice;
	}
	public Integer getDetailId() {
		return detailId;
	}
	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getBuyNums() {
		return buyNums;
	}
	public void setBuyNums(Integer buyNums) {
		this.buyNums = buyNums;
	}
	public BigDecimal getRealPrices() {
		return realPrices;
	}
	public void setRealPrices(BigDecimal realPrices) {
		this.realPrices = realPrices;
	}
	public BigDecimal getRealTotalPrice() {
		return realTotalPrice;
	}
	public void setRealTotalPrice(BigDecimal realTotalPrice) {
		this.realTotalPrice = realTotalPrice;
	}
	@Override
	public String toString() {
		return "OrdersDetail [detailId=" + detailId + ", orderId=" + orderId + ", storeId=" + storeId + ", productId="
				+ productId + ", buyNums=" + buyNums + ", realPrices=" + realPrices + ", realTotalPrice="
				+ realTotalPrice + "]";
	}
	
	
}
