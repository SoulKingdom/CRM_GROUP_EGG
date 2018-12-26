package net.wanho.dao.product;

import java.util.List;

import net.wanho.dao.baseDao.BaseDaoI;
import net.wanho.po.product.ProductType;

public interface ProductTypeDaoI extends BaseDaoI<ProductType, Integer> {
	/**
	 * 查询所有商品信息
	 * @param productType 查询商品信息
	 * @return 返回商品列表
	 */
	public List<ProductType> selectAll(int productType);
}
