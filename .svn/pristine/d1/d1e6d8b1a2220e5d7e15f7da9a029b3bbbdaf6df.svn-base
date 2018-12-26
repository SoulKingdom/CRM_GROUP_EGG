package net.wanho.service.person.impl;

import java.util.List;

import net.wanho.dao.person.DailyLogDaoI;
import net.wanho.dao.person.impl.DailyLogDaoImpl;
import net.wanho.factory.ObjectFactory;
import net.wanho.service.person.DailyLogVoServiceI;
import net.wanho.vo.person.DailyLogVo;

public class DailyLogServiceImpl implements DailyLogVoServiceI {
   // private DailyLogDaoI dailyLogDao=(DailyLogDaoI) ObjectFactory.getObject("DailyLogDaoI");
	   private DailyLogDaoI dailyLogDao=new DailyLogDaoImpl();
    @Override
    public List<DailyLogVo> queryAll() {
		
		return dailyLogDao.selectAll();
	}
	@Override
	public List<DailyLogVo> queryByDate(String serach_status) {
		// TODO Auto-generated method stub
		return dailyLogDao.queryByDate(serach_status);
	}
	
	


	@Override
	public List<DailyLogVo> queryById(int employeeId) {
	
		return dailyLogDao.selectById(employeeId);
	}
	@Override
	public List<DailyLogVo> queryLikeAll(String k) {
		// TODO Auto-generated method stub
		return dailyLogDao.selectByLike(k);
	}}
