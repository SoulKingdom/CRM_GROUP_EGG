package net.wanho.service.person;

import java.util.List;

import net.wanho.vo.person.InstationMailVo;

public interface InstationMailVoServiceI {

	List<InstationMailVo> queryAll();
	List<InstationMailVo> queryllAll();
	
	List<InstationMailVo> queryStatusAll( String status);
	
	List<InstationMailVo> queryLike( String k);
	
	int remove(String delId);
	
	InstationMailVo queryByMailId(String mailId);

	int modify(String mailId, String status);

	int insert(InstationMailVo instationMailVo);
}
