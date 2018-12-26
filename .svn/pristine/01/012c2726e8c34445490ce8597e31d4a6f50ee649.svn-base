package net.wanho.po.product;

import java.util.List;

/**
 * 产品类型 封装类
 * @author Administrator
 *
 */
public class ProductType {
	/**产品类型*/
	private Integer typeId;
	/**名称*/
	private String typeName;
	/**说明*/
	private String typeDescription;
	/**上级产品类型*/
	private Integer parentTypeId;
	/**2级子类的数据*/
	private List<ProductType> productTypeList;
	
	
	public ProductType(Integer typeId, String typeName, String typeDescription, Integer parentTypeId) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.typeDescription = typeDescription;
		this.parentTypeId = parentTypeId;
	}
	
	public List<ProductType> getProductTypeList() {
		return productTypeList;
	}

	public void setProductTypeList(List<ProductType> productTypeList) {
		this.productTypeList = productTypeList;
	}

	public ProductType() {
		super();
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeDescription() {
		return typeDescription;
	}
	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}
	public Integer getParentTypeId() {
		return parentTypeId;
	}
	public void setParentTypeId(Integer parentTypeId) {
		this.parentTypeId = parentTypeId;
	}

	@Override
	public String toString() {
		return "ProductType [typeId=" + typeId + ", typeName=" + typeName + ", typeDescription=" + typeDescription
				+ ", parentTypeId=" + parentTypeId + ", productTypeList=" + productTypeList + "]";
	}
	
	
	
	
}
