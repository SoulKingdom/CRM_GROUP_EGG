package net.wanho.service.product;

import java.util.List;

import net.wanho.po.product.ProductType;
import net.wanho.service.baseservice.BaseServicesI;

public interface ProductTypeServiceI extends BaseServicesI<ProductType, Integer> {
	List<ProductType> queryAll(int type);
	/**
	 * 获取所有的状态和2级分类
	 * @return
	 */
	List<ProductType> queryAllThreeNode();
}
