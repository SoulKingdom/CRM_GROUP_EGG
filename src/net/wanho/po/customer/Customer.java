package net.wanho.po.customer;

import java.util.Date;

/**
 * 客户
 * @author Administrator
 *
 */
public class Customer {
	/**客户编码*/
	private Integer customerId;
	/**负责人*/
	private Integer prinpical;
	/**客户名称*/
	private String customerName;
	/**邮编*/
	private String postCode;
	/**所属行业*/
	private Integer fieldId;
	/**客户来源*/
	private Integer sourceId;
	/**创建时间*/
	private Date createTime;
	/**更新时间*/
	private Date updateTime;
	/**员工数*/
	private String employeeNumbers;
	/**地址*/
	private String address;
	/**标签*/
	private String tag;
	/**备注*/
	private String remarks;
	/**年营业额*/
	private String busubessVolume;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, Integer prinpical, String customerName, String postCode, Integer fieldId,
			Integer sourceId, Date createTime, Date updateTime, String employeeNumbers, String address, String tag,
			String remarks, String busubessVolume) {
		super();
		this.customerId = customerId;
		this.prinpical = prinpical;
		this.customerName = customerName;
		this.postCode = postCode;
		this.fieldId = fieldId;
		this.sourceId = sourceId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.employeeNumbers = employeeNumbers;
		this.address = address;
		this.tag = tag;
		this.remarks = remarks;
		this.busubessVolume = busubessVolume;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getPrinpical() {
		return prinpical;
	}

	public void setPrinpical(Integer prinpical) {
		this.prinpical = prinpical;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Integer getFieldId() {
		return fieldId;
	}

	public void setFieldId(Integer fieldId) {
		this.fieldId = fieldId;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getEmployeeNumbers() {
		return employeeNumbers;
	}

	public void setEmployeeNumbers(String employeeNumbers) {
		this.employeeNumbers = employeeNumbers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getBusubessVolume() {
		return busubessVolume;
	}

	public void setBusubessVolume(String busubessVolume) {
		this.busubessVolume = busubessVolume;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", prinpical=" + prinpical + ", customerName=" + customerName
				+ ", postCode=" + postCode + ", fieldId=" + fieldId + ", sourceId=" + sourceId + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", employeeNumbers=" + employeeNumbers + ", address="
				+ address + ", tag=" + tag + ", remarks=" + remarks + ", busubessVolume=" + busubessVolume + "]";
	}
	
	
	
}
