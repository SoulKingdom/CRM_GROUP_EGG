package net.wanho.service.product;

import java.util.List;

import net.wanho.po.product.ProductInventory;
import net.wanho.service.baseservice.BaseServicesI;
import net.wanho.vo.product.ProductInventoryVO;

public interface ProductInventoryServiceI extends BaseServicesI<ProductInventory, Integer> {
	/**
	 * 查询所有信息
	 * @return 所有库存信息
	 */
	List<ProductInventoryVO> queryAll(ProductInventoryVO cond);
}
