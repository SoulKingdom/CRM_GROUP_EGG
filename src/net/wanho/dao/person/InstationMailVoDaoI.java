package net.wanho.dao.person;

import java.util.List;

import net.wanho.vo.person.InstationMailVo;

public interface InstationMailVoDaoI {

	List<InstationMailVo> selectAll();
	List<InstationMailVo> selectllAll();
	List<InstationMailVo> selectStatusAll(String status);
	List<InstationMailVo> selectLike(String k);

	int delete(String delId);

	InstationMailVo selectByMailId(String mailId);
	
	int update(String mailId, String status);
	int insert(InstationMailVo instationMailVo);
}
