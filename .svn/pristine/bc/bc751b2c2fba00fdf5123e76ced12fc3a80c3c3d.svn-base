package net.wanho.dao.customer;

import java.util.List;

import net.wanho.dao.baseDao.BaseDaoI;
import net.wanho.po.customer.Business;
import net.wanho.vo.customer.BusinessVo;

public interface BusinessDaoI extends BaseDaoI<Business,Integer> {
	List<BusinessVo> selectAll();
	
	BusinessVo selectByKey(Integer id);
	
	List<BusinessVo> selectcondition(String text, String type) ;
	
	List<BusinessVo> selectconditionTime(String text, String textTime, String type);
}
