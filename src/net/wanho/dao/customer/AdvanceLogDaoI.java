package net.wanho.dao.customer;

import java.util.List;

import net.wanho.dao.baseDao.BaseDaoI;
import net.wanho.po.customer.AdvanceLog;

public interface AdvanceLogDaoI extends BaseDaoI<AdvanceLog, Integer> {
	List<AdvanceLog> selectAll();
}
