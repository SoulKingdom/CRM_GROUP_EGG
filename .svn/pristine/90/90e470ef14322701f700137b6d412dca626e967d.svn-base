package net.wanho.service.person.impl;

import java.util.List;

import net.wanho.dao.person.InstationMailVoDaoI;
import net.wanho.dao.person.impl.InstationMailVoDaoImpl;
import net.wanho.factory.ObjectFactory;
import net.wanho.service.person.InstationMailVoServiceI;
import net.wanho.vo.person.InstationMailVo;

public class InstationMailVoServiceImpl implements InstationMailVoServiceI {

	
	//private InstationMailVoDaoI instationMailVoDao=(InstationMailVoDaoI) ObjectFactory.getObject("InstationMailVoDaoI");
	private InstationMailVoDaoI instationMailVoDao = new InstationMailVoDaoImpl();
	
	@Override
	public List<InstationMailVo> queryAll() {
		// TODO Auto-generated method stub
		return instationMailVoDao.selectAll();
	}
	@Override
	public int remove(String delId) {
		// TODO Auto-generated method stub
		return instationMailVoDao.delete(delId);
	}
	@Override
	public InstationMailVo queryByMailId(String mailId) {
		// TODO Auto-generated method stub
		return  instationMailVoDao.selectByMailId(mailId);
	}
	@Override
	public int modify(String mailId, String status) {
		// TODO Auto-generated method stub
		return instationMailVoDao.update(mailId,status);
	}
	@Override
	public List<InstationMailVo> queryStatusAll(String status) {
		// TODO Auto-generated method stub
		return instationMailVoDao.selectStatusAll(status);
	}
	@Override
	public List<InstationMailVo> queryLike(String k) {
		// TODO Auto-generated method stub
		return  instationMailVoDao.selectLike(k);
	}
	@Override
	public List<InstationMailVo> queryllAll() {
		// TODO Auto-generated method stub
		return instationMailVoDao.selectllAll();
	}
	@Override
	public int insert(InstationMailVo instationMailVo) {
		// TODO Auto-generated method stub
		return instationMailVoDao.insert(instationMailVo);
	}

}
