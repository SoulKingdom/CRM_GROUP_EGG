package net.wanho.dao.product;

import java.util.List;

import net.wanho.dao.baseDao.BaseDaoI;
import net.wanho.po.product.Orders;
import net.wanho.vo.product.OrdersVO;

public interface OrdersDaoI extends BaseDaoI<Orders, Integer> {
	/**
	 * 查询符合条件的信息
	 * 
	 * @param pageNo
	 *            当前页
	 * @param pageSize
	 *            分页跨度
	 * @param user
	 *            符合条件
	 * @return 返回符合条件的用户
	 */
	List<OrdersVO> selectCond(int pageNo, int pageSize, OrdersVO ordersVO);
	
	/**
	 * 符合条件的 查询数量
	 * @param info 条件封装类
	 * @return 返回符合条件的数量
	 */
	public int selectCondCount(OrdersVO info);
	
	/**
	 *  批量删除信息
	 * @param id 用户id
	 * @return 删除数据数量
	 */
	public int delete(Integer... id);
}
