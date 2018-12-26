package net.wanho.po.person;

import java.util.Date;

/**
 * 工作日志
 * @author Administrator
 *
 */
public class DailyRecord {
	/**日志编码*/
	private Integer recordId;
	/**创建人*/
	private Integer creator;
	/**日志标题*/
	private String title;
	/**日志内容*/
	private String content;
	/**创建时间*/
	private Date createTime;
	/**更新时间*/
	private Date updateTime;
	/**日志类型*/
	private String recordlx;
	
	
	
	public DailyRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DailyRecord(Integer recordId, Integer creator, String title, String content, Date createTime,
			Date updateTime, String recordlx) {
		super();
		this.recordId = recordId;
		this.creator = creator;
		this.title = title;
		this.content = content;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.recordlx = recordlx;
	}

	public String getrecordlx() {
		return recordlx;
	}
	public void setrecordlx(String recordlx) {
		this.recordlx = recordlx;
	}
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Integer getCreator() {
		return creator;
	}
	public void setCreator(Integer creator) {
		this.creator = creator;
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
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "DailyRecord [recordId=" + recordId + ", creator=" + creator + ", title=" + title + ", content="
				+ content + ", createTime=" + createTime + ", updateTime=" + updateTime + ", recordlx=" + recordlx + "]";
	}
	
	
}
