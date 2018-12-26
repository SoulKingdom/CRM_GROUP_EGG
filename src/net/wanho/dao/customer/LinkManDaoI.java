package net.wanho.dao.customer;

import java.util.List;

import net.wanho.dao.baseDao.BaseDaoI;
import net.wanho.po.customer.LinkMan;

public interface LinkManDaoI extends BaseDaoI<LinkMan, Integer> {
	List<LinkMan> selectAll();
	
	LinkMan selectcondition(Integer mobile,String email) ;
}
