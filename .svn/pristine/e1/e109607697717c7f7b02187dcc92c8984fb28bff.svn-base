package net.wanho.service.person.impl;

import java.util.List;

import net.wanho.dao.person.IndividualTaskVoDaoI;
import net.wanho.dao.person.impl.IndividualTaskVoDaoImpl;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.person.IndividualTask;
import net.wanho.service.person.IndividualTaskVoServiceI;
import net.wanho.vo.person.IndividualTaskVo;

public class IndividualTaskVoServiceImpl implements IndividualTaskVoServiceI {
   // private IndividualTaskVoDaoI individualTaskVoDao=(IndividualTaskVoDaoI) ObjectFactory.getObject("IndividualTaskVoDaoI");
	private IndividualTaskVoDaoI individualTaskVoDao = new IndividualTaskVoDaoImpl();
    
    @Override
	public List<IndividualTaskVo> queryAll() {
		
		return individualTaskVoDao.selectAll();
	}
	
	
	public int modify(IndividualTask t) {
		// TODO Auto-generated method stub
		return individualTaskVoDao.update(t);
	}


	@Override
	public int remove(String taskId) {
		// TODO Auto-generated method stub
		return individualTaskVoDao.delete(taskId);
	}


	@Override
	public List<IndividualTaskVo>  queryByStatus(String status) {
		// TODO Auto-generated method stub
		return individualTaskVoDao.selectByStatus(status);
	}


	@Override
	public List<IndividualTaskVo> queryByIdentity(String identity,String name) {
		// TODO Auto-generated method stub
		return individualTaskVoDao.selectByIdentity(identity,name);
	}


	@Override
	public IndividualTaskVo queryById(int taskId) {
		// TODO Auto-generated method stub
		System.out.println("---<queryById>"+taskId);
		return individualTaskVoDao.selectById(taskId);
	}


	@Override
	public int insert(IndividualTaskVo indicidualTask) {
		// TODO Auto-generated method stub
		return individualTaskVoDao.insert(indicidualTask);
	}
}
