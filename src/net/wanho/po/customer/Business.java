package net.wanho.po.customer;

import java.math.BigDecimal;
import java.util.Date;

/*
 * 商机
 */
public class Business {
	/**商机编码*/
	private Integer businessId;
	/**客户*/
	private Integer customerId;
	/**联系人*/
	private Integer linkMainId;
	/**商机名*/
	private String businessName;
	/**商机类型*/
	private Integer businessTypeId;
	/**状态*/
	private String  status;
	/**商机来源*/
	private Integer businessSourceId;
	/**预售价格*/
	private BigDecimal persalePrice;
	/**赢单率*/
	private BigDecimal probability;
	/**下次联系时间*/
	private Date  visitTime;
	/**下次联系内容*/
	private String  visitContent;
	/**更新时间*/
	private Date updateTime;
	/**负责员工*/
	private Integer employeeId;
	
	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Business(Integer businessId, Integer customerId, Integer linkMainId, String businessName,
			Integer businessTypeId, String status, Integer businessSourceId, BigDecimal persalePrice, BigDecimal probability,
			Date visitTime, String visitContent, Date updateTime, Integer employeeId) {
		super();
		this.businessId = businessId;
		this.customerId = customerId;
		this.linkMainId = linkMainId;
		this.businessName = businessName;
		this.businessTypeId = businessTypeId;
		this.status = status;
		this.businessSourceId = businessSourceId;
		this.persalePrice = persalePrice;
		this.probability = probability;
		this.visitTime = visitTime;
		this.visitContent = visitContent;
		this.updateTime = updateTime;
		this.employeeId = employeeId;
	}

	public Integer getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getLinkMainId() {
		return linkMainId;
	}

	public void setLinkMainId(Integer linkMainId) {
		this.linkMainId = linkMainId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Integer getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(Integer businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getBusinessSourceId() {
		return businessSourceId;
	}

	public void setBusinessSourceId(Integer businessSourceId) {
		this.businessSourceId = businessSourceId;
	}

	public BigDecimal getPersalePrice() {
		return persalePrice;
	}

	public void setPersalePrice(BigDecimal persalePrice) {
		this.persalePrice = persalePrice;
	}

	public BigDecimal getProbability() {
		return probability;
	}

	public void setProbability(BigDecimal probability) {
		this.probability = probability;
	}

	public Date getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}

	public String getVisitContent() {
		return visitContent;
	}

	public void setVisitContent(String visitContent) {
		this.visitContent = visitContent;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Business [businessId=" + businessId + ", customerId=" + customerId + ", linkMainId=" + linkMainId
				+ ", businessName=" + businessName + ", businessTypeId=" + businessTypeId + ", status=" + status
				+ ", businessSourceId=" + businessSourceId + ", persalePrice=" + persalePrice + ", probability="
				+ probability + ", visitTime=" + visitTime + ", visitContent=" + visitContent + ", updateTime="
				+ updateTime + ", employeeId=" + employeeId + "]";
	}
	
	
	
}
