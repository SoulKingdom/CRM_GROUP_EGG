package net.wanho.vo.person;

import java.util.Date;

public class IndividualTaskVo {
	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	private Integer taskId;
	/** TOPIC. */
	private String topic;
    
	private String associates;
	
	
	private String principal;
	private String description;
	/** DESCRIPTION. */
	private Date endTime;

	/** PRIORITY. */
	private String priority;
	/** CREATE_TIME. */
	private Date createTime;
	
	/** STATUS. */
	private String status;
	/** OPERATOR. */
	private String operator;
	private Integer ResponsiblePerson;
	private String employeeName;
	private String linkUrl;
	private String taskType;
	
	
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTopic() {
		return topic;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getAssociates() {
		return associates;
	}
	public void setAssociates(String associates) {
		this.associates = associates;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	
	public Integer getResponsiblePerson() {
		return ResponsiblePerson;
	}
	public void setResponsiblePerson(Integer responsiblePerson) {
		ResponsiblePerson = responsiblePerson;
	}
	@Override
	public String toString() {
		return "IndividualTaskVo [taskId=" + taskId + ", topic=" + topic + ", associates=" + associates + ", principal="
				+ principal + ", description=" + description + ", endTime=" + endTime + ", priority=" + priority
				+ ", createTime=" + createTime + ", status=" + status + ", operator=" + operator
				+ ", ResponsiblePerson=" + ResponsiblePerson + ", employeeName=" + employeeName + ", linkUrl=" + linkUrl
				+ ", taskType=" + taskType + "]";
	}
}



