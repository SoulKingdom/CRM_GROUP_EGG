package net.wanho.vo.product;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersVO {
	/**订单编号*/
	private Integer orderId;
	/**订单码*/
	private String orderSeq;
	/**主题*/
	private String title;
	/**客户*/
	private Integer customerId;
	/*总价*/
	private BigDecimal totalMoney;
	/**状态*/
	private String status;
	/**制单人*/
	private Integer operator;
	/**下单时间*/
	private Date orderTime;
	/**创建时间*/
	private Date createTime;
	/**订单类型*/
	private String orederType;
	/**客户姓名*/
	private String customerName;
	/**制单人姓名*/
	private String employeeName;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderSeq() {
		return orderSeq;
	}
	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public BigDecimal getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getOperator() {
		return operator;
	}
	public void setOperator(Integer operator) {
		this.operator = operator;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getOrederType() {
		return orederType;
	}
	public void setOrederType(String orederType) {
		this.orederType = orederType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "OrdersVO [orderId=" + orderId + ", orderSeq=" + orderSeq + ", title=" + title + ", customerId="
				+ customerId + ", totalMoney=" + totalMoney + ", status=" + status + ", operator=" + operator
				+ ", orderTime=" + orderTime + ", createTime=" + createTime + ", orederType=" + orederType
				+ ", customerName=" + customerName + ", employeeName=" + employeeName + "]";
	}
	public OrdersVO(Integer orderId, String orderSeq, String title, Integer customerId, BigDecimal totalMoney,
			String status, Integer operator, Date orderTime, Date createTime, String orederType, String customerName,
			String employeeName) {
		super();
		this.orderId = orderId;
		this.orderSeq = orderSeq;
		this.title = title;
		this.customerId = customerId;
		this.totalMoney = totalMoney;
		this.status = status;
		this.operator = operator;
		this.orderTime = orderTime;
		this.createTime = createTime;
		this.orederType = orederType;
		this.customerName = customerName;
		this.employeeName = employeeName;
	}
	public OrdersVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
