package net.wanho.dao.person;

import java.util.List;

import net.wanho.po.person.IndividualTask;
import net.wanho.vo.person.IndividualTaskVo;

public interface IndividualTaskVoDaoI {

	
	List<IndividualTaskVo> selectAll();
     
	int update(IndividualTask t);

	int delete(String taskId);

	List<IndividualTaskVo>  selectByStatus(String  status);

	List<IndividualTaskVo> selectByIdentity(String identity,String name);

	IndividualTaskVo selectById(int taskId);

	int insert(IndividualTaskVo indicidualTask);
}
