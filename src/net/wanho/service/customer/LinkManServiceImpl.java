package net.wanho.service.customer;

import java.util.List;

import net.wanho.dao.customer.LinkManDaoI;
import net.wanho.dao.customer.impl.LinkManDaoImpl;
import net.wanho.po.customer.LinkMan;

public class LinkManServiceImpl implements LinkManServiceI {
private LinkManDaoI linkManDao = new LinkManDaoImpl();
	
	@Override
	public List<LinkMan> selectAll() {
		// TODO Auto-generated method stub
		return linkManDao.selectAll();
	}

}
