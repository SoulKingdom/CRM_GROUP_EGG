package net.wanho.dao.person;

import java.util.List;

import net.wanho.vo.person.DailyLogVo;
import net.wanho.vo.person.IndividualTaskVo;

public interface DailyLogDaoI {
     List<DailyLogVo> selectAll();

	List<DailyLogVo> queryByDate(String serach_status);

	List<DailyLogVo> selectById(int employeeId);

	List<DailyLogVo> selectByLike(String k);
	
	int insert(DailyLogVo  dailyLogVo);
} 
