package net.wanho.po.system;

import java.util.Date;
/**
 * 职位po
 * @author Administrator
 *
 */
public class EmmPosition {
	/**职位编号*/
	private Integer positionId;
	/**职位名称*/
	private String positionName;
	/**职位等级*/
	private String positionLevel;
	/**创建时间*/
	private Date createTime;
	/**更新时间*/
	private Date updateTime;
	public EmmPosition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmmPosition(Integer positionId, String positionName, String positionLevel, Date createTime,
			Date updateTime) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
		this.positionLevel = positionLevel;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getPositionLevel() {
		return positionLevel;
	}
	public void setPositionLevel(String positionLevel) {
		this.positionLevel = positionLevel;
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
		return "EmmPosition [positionId=" + positionId + ", positionName=" + positionName + ", positionLevel="
				+ positionLevel + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
}
