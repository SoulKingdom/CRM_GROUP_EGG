package net.wanho.service.product.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import net.wanho.dao.product.ProductDaoI;
import net.wanho.factory.ObjectFactory;
import net.wanho.page.PageBean;
import net.wanho.po.product.Product;
import net.wanho.service.product.ProductServiceI;

public class ProductServiceImpl implements ProductServiceI {
	private static final Logger log = Logger.getLogger(ProductServiceImpl.class);
	ProductDaoI productDaoI = (ProductDaoI) ObjectFactory.getObject("ProductDaoI");

	@Override
	public int add(Product product) {
		// 设置更新和创建时间
		product.setCreateTime(new Date());
		product.setUpdateTime(new Date());
		return productDaoI.insert(product);
	}

	@Override
	public int remove(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modify(Product product) {
		product.setUpdateTime(new Date());
		return productDaoI.update(product);
	}

	@Override
	public Product queryById(Integer id) {
		return productDaoI.selectById(id);
	}

	@Override
	public PageBean<Product> queryAll(PageBean<Product> page) {
		// 判断是否有条件
		if (page.getCond() == null) {
			page.setCond(new Product());
		}
		// 设置总的记录数
		page.setTotalRecords(productDaoI.selectCondCount(page.getCond()));
		// 存放查询数据
		List<Product> productList = productDaoI.selectCond(page.getpageNo(), page.getPageSize(), page.getCond());
		page.setPageDatas(productList);
		return page;
	}

	@Override
	public List<Product> queryByLevel(Integer type) {
		return productDaoI.selectProduceByLevel(type);
	}

	@Override
	public int remove(Integer... id) {
		return productDaoI.delete(id);
	}

}
