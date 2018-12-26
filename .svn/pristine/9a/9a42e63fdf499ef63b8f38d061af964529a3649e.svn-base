package net.wanho.service.product.impl;

import java.util.List;

import net.wanho.dao.product.ProductTypeDaoI;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.product.ProductType;
import net.wanho.service.product.ProductTypeServiceI;

public class ProductTypeServiceImpl implements ProductTypeServiceI {
	ProductTypeDaoI productTypeDaoI = (ProductTypeDaoI) ObjectFactory.getObject("ProductTypeDaoI");
	@Override
	public int add(ProductType info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Integer id) {
		return productTypeDaoI.delete(id);
	}

	@Override
	public int modify(ProductType info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProductType queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductType> queryAll(int type) {
		return productTypeDaoI.selectAll(type);
	}

	@Override
	public List<ProductType> queryAllThreeNode() {
		//获取所父级标签
		List<ProductType> productTypeList = productTypeDaoI.selectAll(0);
		for (ProductType productType : productTypeList) {			
			//通过父级数据 获取二级数据
			List<ProductType> productTypes = productTypeDaoI.selectAll(productType.getTypeId());
			productType.setProductTypeList(productTypes);
		}
		return productTypeList;
	}
	
}
