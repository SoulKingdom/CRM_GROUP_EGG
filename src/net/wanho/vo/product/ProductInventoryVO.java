package net.wanho.vo.product;

import java.util.Date;

public class ProductInventoryVO {
	/**库存编码*/
	private Integer inventoryId;
	/**产品编码*/
	private Integer productId;
	/**仓库编码*/
	private Integer storeId;
	/**库存*/
	private Integer inventory;
	/**更新时间*/
	private Date updateTime;
	/**产品名称*/
	private String prodName;
	/**产品规格*/
	private String prodStandard;
	/**仓库名称*/
	private String storeName;
	public Integer getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdStandard() {
		return prodStandard;
	}
	public void setProdStandard(String prodStandard) {
		this.prodStandard = prodStandard;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	@Override
	public String toString() {
		return "ProductInventoryVO [inventoryId=" + inventoryId + ", productId=" + productId + ", storeId=" + storeId
				+ ", inventory=" + inventory + ", updateTime=" + updateTime + ", prodName=" + prodName
				+ ", prodStandard=" + prodStandard + ", storeName=" + storeName + "]";
	}
	
	
	
	
}
