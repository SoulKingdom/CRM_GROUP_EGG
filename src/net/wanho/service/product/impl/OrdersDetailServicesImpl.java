package net.wanho.service.product.impl;

import net.wanho.dao.product.OrdersDetailDaoI;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.product.OrdersDetail;
import net.wanho.service.product.OrdersDetailServicesI;

public class OrdersDetailServicesImpl implements OrdersDetailServicesI {
	OrdersDetailDaoI ordersDetailDaoI = (OrdersDetailDaoI) ObjectFactory.getObject("OrdersDetailDaoI");
	@Override
	public int add(OrdersDetail ordersDetail) {
		return  ordersDetailDaoI.insert(ordersDetail);
	}

	@Override
	public int remove(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modify(OrdersDetail info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OrdersDetail queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
