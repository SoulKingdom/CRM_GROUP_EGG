package net.wanho.po.customer;

import java.util.Date;

/**
 * 推进记录
 * @author Administrator
 *
 */

public class AdvanceLog {
	/** 推进编码 */
	private Integer  logId;
	/** 商机编码*/
	private Integer businessId;
	/** 创建人*/
	private Integer creator;
	/** 推进内容*/
	private String advanceContent;
	/** 推进时间*/
	private Date createTime;
	/** 推进状态*/
	private String advanceStatus;
	
	public AdvanceLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdvanceLog(Integer logId, Integer businessId, Integer creator, String advanceContent, Date createTime,
			String advanceStatus) {
		super();
		this.logId = logId;
		this.businessId = businessId;
		this.creator = creator;
		this.advanceContent = advanceContent;
		this.createTime = createTime;
		this.advanceStatus = advanceStatus;
	}

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public Integer getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public String getAdvanceContent() {
		return advanceContent;
	}

	public void setAdvanceContent(String advanceContent) {
		this.advanceContent = advanceContent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAdvanceStatus() {
		return advanceStatus;
	}

	public void setAdvanceStatus(String advanceStatus) {
		this.advanceStatus = advanceStatus;
	}

	@Override
	public String toString() {
		return "AdvanceLog [logId=" + logId + ", businessId=" + businessId + ", creator=" + creator
				+ ", advanceContent=" + advanceContent + ", createTime=" + createTime + ", advanceStatus="
				+ advanceStatus + "]";
	}
	
	
	
}
