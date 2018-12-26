package net.wanho.vo.person;

import java.util.Date;

public class InstationMailVo {
	private Integer mailId;
    private Integer  receiverId;
	/** SENDER_ID. */
	private String senderPerson;

	/** RECEIVER_ID. */
	private String receiverPerson;

	/** THEME. */
	private String theme;

	/** STATUS. */
	private String status;

	/** REMARK. */
	private String remark;

	/** CREATE_TIME. */
	private Date createTime;

	/** UPDATE_TIME. */
	private Date updateTime;

	/** CONTENT. */
	private String content;

	

	

	public Integer getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public Integer getMailId() {
		return mailId;
	}

	public void setMailId(Integer mailId) {
		this.mailId = mailId;
	}

	public String getSenderPerson() {
		return senderPerson;
	}

	public void setSenderPerson(String senderPerson) {
		this.senderPerson = senderPerson;
	}

	public String getReceiverPerson() {
		return receiverPerson;
	}

	public void setReceiverPerson(String receiverPerson) {
		this.receiverPerson = receiverPerson;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "InstationMailVo [mailId=" + mailId + ", receiverId=" + receiverId + ", senderPerson=" + senderPerson
				+ ", receiverPerson=" + receiverPerson + ", theme=" + theme + ", status=" + status + ", remark="
				+ remark + ", createTime=" + createTime + ", updateTime=" + updateTime + ", content=" + content + "]";
	}



	
	
	
}
