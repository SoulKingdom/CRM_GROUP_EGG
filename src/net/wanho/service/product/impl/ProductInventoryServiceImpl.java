package net.wanho.service.product.impl;

import java.util.List;

import net.wanho.dao.product.ProductInventoryDaoI;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.product.ProductInventory;
import net.wanho.service.product.ProductInventoryServiceI;
import net.wanho.vo.product.ProductInventoryVO;

public class ProductInventoryServiceImpl implements ProductInventoryServiceI {
	private ProductInventoryDaoI  productInventoryDaoI = (ProductInventoryDaoI) ObjectFactory.getObject("ProductInventoryDaoI");
	@Override
	public int add(ProductInventory info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modify(ProductInventory info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProductInventory queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductInventoryVO> queryAll(ProductInventoryVO cond) {
		
		return productInventoryDaoI.queryAll(cond);
	}

}
