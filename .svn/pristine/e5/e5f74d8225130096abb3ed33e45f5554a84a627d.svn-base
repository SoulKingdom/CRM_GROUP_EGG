package net.wanho.service.product;

import java.util.List;

import net.wanho.page.PageBean;
import net.wanho.po.product.Product;
import net.wanho.service.baseservice.BaseServicesI;

public interface ProductServiceI extends BaseServicesI<Product, Integer>{
	/**
	 * 分页获取信息
	 * @param page 分页记录
	 * @return 返回分页封装数据类
	 */
	PageBean<Product> queryAll(PageBean<Product> page);
	/**
	 * 查询商品父类信息
	 * @param type 产品状态
	 * @return 返回对应状态的产品信息
	 */
	List<Product> queryByLevel(Integer type);
	
	/**
	 * 删除信息
	 * @param id 用户id
	 * @return 删除数据数量
	 */
	public int remove(Integer... id);
	
}
