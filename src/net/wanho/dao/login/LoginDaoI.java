package net.wanho.dao.login;

import java.util.List;

import net.wanho.exception.DaoException;
import net.wanho.vo.LoginDto;

public interface LoginDaoI {
	List<LoginDto> selectbyEmpidAndPwd() throws DaoException;
}
