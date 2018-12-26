package net.wanho.service.customer;

import java.util.List;

import net.wanho.po.customer.LinkMan;
import net.wanho.vo.customer.LinkManVo;

public interface LinkManServiceI {
	

	List<LinkMan> selectAll();
}
