package net.wanho.po.system;
/**
 * 职位菜单关系
 * @author HaoXin.Liu
 *
 */
public class PositionMenuRelations {
	/**关系编号*/
	private Integer relationId;
	/**职位编号*/
	private Integer positionId;
	/**菜单编号*/
	private Integer menuId;
	
	
	public PositionMenuRelations() {
		super();
	}
	
	public PositionMenuRelations(Integer relationId, Integer positionId, Integer menuId) {
		super();
		this.relationId = relationId;
		this.positionId = positionId;
		this.menuId = menuId;
	}

	public Integer getRelationId() {
		return relationId;
	}
	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	@Override
	public String toString() {
		return "PositionMenuRelations [relationId=" + relationId + ", positionId=" + positionId + ", menuId=" + menuId
				+ "]";
	}
	
}
