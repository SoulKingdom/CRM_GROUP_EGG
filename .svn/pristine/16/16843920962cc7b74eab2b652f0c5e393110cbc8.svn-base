package net.wanho.service.product;

import net.wanho.page.PageBean;
import net.wanho.po.product.Orders;
import net.wanho.service.baseservice.BaseServicesI;
import net.wanho.vo.product.OrdersVO;

public interface SalesServiceI extends BaseServicesI<Orders, Integer> {
	/**
	 * 分页获取信息
	 * @param page 分页记录
	 * @return 返回分页封装数据类
	 */
	PageBean<OrdersVO> queryAll(PageBean<OrdersVO> page);
	/**
	 * 批量删除信息
	 * @param id 用户id
	 * @return 删除数据数量
	 */
	public int remove(Integer... id);
}
