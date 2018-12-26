package net.wanho.po.system;

import java.util.Date;


/**
 * 菜单
 * @author Administrator
 *
 */
public class Menu {
	/** 菜单编码 */
	private Integer menuId;
	/** 菜单名称 */
	private  String menuName;
	/** 菜单路径 */
	private  String menuUrl;
	/** 图标 */
	private  String pictures;
	/** 状态 */
	private  String status;
	/** 创建时间 */
	private  Date createTime;
	/** 更新时间 */
	private  Date updateTime;
	/** 父级菜单编码 */
	private Integer  parentMenuId;
	
	
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Menu(Integer menuId, String menuName, String menuUrl, String pictures, String status, Date createTime,
			Date updateTime, Integer parentMenuId) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuUrl = menuUrl;
		this.pictures = pictures;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.parentMenuId = parentMenuId;
	}


	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public String getPictures() {
		return pictures;
	}
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public Integer getParentMenuId() {
		return parentMenuId;
	}
	public void setParentMenuId(Integer parentMenuId) {
		this.parentMenuId = parentMenuId;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", menuUrl=" + menuUrl + ", pictures=" + pictures
				+ ", status=" + status + ", createTime=" + createTime + ", updateTime=" + updateTime + ", parentMenuId="
				+ parentMenuId + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
