package net.wanho.service.product.impl;

import java.util.List;

import org.apache.log4j.Logger;

import net.wanho.dao.product.OrdersDaoI;
import net.wanho.factory.ObjectFactory;
import net.wanho.page.PageBean;
import net.wanho.po.product.Orders;
import net.wanho.service.product.SalesServiceI;
import net.wanho.vo.product.OrdersVO;

public class SalesServiceImpl implements SalesServiceI {
	private static final Logger log = Logger.getLogger(SalesServiceImpl.class);
	OrdersDaoI ordersDaoI= (OrdersDaoI) ObjectFactory.getObject("OrdersDaoI");
	
	@Override
	public int add(Orders orders) {
		return ordersDaoI.insert(orders);
	}

	@Override
	public int remove(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modify(Orders info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Orders queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageBean<OrdersVO> queryAll(PageBean<OrdersVO> page) {
		// 判断是否有条件
		if (page.getCond() == null) {
			page.setCond(new OrdersVO());
		}
		// 设置总的记录数
		page.setTotalRecords(ordersDaoI.selectCondCount(page.getCond()));
		// 存放查询数据
		List<OrdersVO> ordersList = ordersDaoI.selectCond(page.getpageNo(), page.getPageSize(), page.getCond());
		page.setPageDatas(ordersList);
		return page;
	}

	@Override
	public int remove(Integer... id) {
		return ordersDaoI.delete(id);
	}
	
	

}
