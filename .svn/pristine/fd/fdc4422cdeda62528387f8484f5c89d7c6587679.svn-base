package net.wanho.dao.customer;

import java.util.List;

import net.wanho.dao.baseDao.BaseDaoI;
import net.wanho.po.customer.Customer;
import net.wanho.vo.customer.CustomerVo;
import net.wanho.vo.customer.PrincipalVo;
public interface CustomerDaoI extends BaseDaoI<Customer, Integer> {
	List<CustomerVo> selectAll();
	
	CustomerVo selectByKey(Integer id);
	
	List<PrincipalVo> selectAllPrincipal();
	
	int update(CustomerVo customerVo);
	
	List<CustomerVo> selectcondition(String text, String type) ;
	
	List<CustomerVo> selectconditionTime(String text, String textTime, String type);
}
