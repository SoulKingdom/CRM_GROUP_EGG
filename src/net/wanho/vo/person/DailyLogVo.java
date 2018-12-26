package net.wanho.vo.person;

import java.util.Date;

public class DailyLogVo {

	private Integer recordId;

	/** CREATOR. */
	private String creater;

	/** TITLE. */
	private String commentEmployee;
	private String title;

	/** CONTENT. */
	private String content;

	/** CREATE_TIME. */
	private Date createTime;

	/** RECORDLX. */
	private String recordlx;

	/** UPDATE_TIME. */
	private Date updateTime;
	
	private Integer count;

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRecordlx() {
		return recordlx;
	}

	public void setRecordlx(String recordlx) {
		this.recordlx = recordlx;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "DailyLogVo [recordId=" + recordId + ", creater=" + creater + ", title=" + title + ", content=" + content
				+ ", createTime=" + createTime + ", recordlx=" + recordlx + ", updateTime=" + updateTime + ", count="
				+ count + "]";
	}

}
