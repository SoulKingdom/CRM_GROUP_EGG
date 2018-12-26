package net.wanho.service.person;

import java.util.List;

import net.wanho.vo.person.DailyLogVo;

public interface DailyLogVoServiceI {
       List<DailyLogVo> queryAll();
       
       List<DailyLogVo> queryByDate(String serach_status);

	   List<DailyLogVo> queryById(int employeeId);

	List<DailyLogVo> queryLikeAll(String k);
}
