package net.wanho.service.person;

import java.util.List;

import net.wanho.po.person.IndividualTask;
import net.wanho.vo.person.IndividualTaskVo;

public interface IndividualTaskVoServiceI {
	List<IndividualTaskVo> queryAll();
	int modify(IndividualTask t);
	int remove(String taskId);
	List<IndividualTaskVo>  queryByStatus(String status);
	List<IndividualTaskVo> queryByIdentity(String identity, String name);
	IndividualTaskVo queryById(int taskId);
	int insert(IndividualTaskVo indicidualTask);
}
