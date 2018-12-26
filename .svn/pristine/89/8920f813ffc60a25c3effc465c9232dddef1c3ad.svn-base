package net.wanho.dao.product;

import java.util.List;

import net.wanho.dao.baseDao.BaseDaoI;
import net.wanho.po.product.Product;

public interface ProductDaoI extends BaseDaoI<Product, Integer> {
	//查找为空的产品信息
	public List<Product>  selectProduceByLevel(Integer type);
	
	/**
	 * 删除信息
	 * @param id 用户id
	 * @return 删除数据数量
	 */
	public int delete(Integer... id);
}
