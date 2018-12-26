package net.wanho.transaction.impl;

import java.sql.Connection;
import java.sql.SQLException;

import net.wanho.exception.ServiceException;
import net.wanho.transaction.TransManagerI;
import net.wanho.util.DbUtil;

/**
 * 事务管理的实现类
 *
 */
public class TransManagerImpl implements TransManagerI {

	@Override
	public void beginTrans() throws ServiceException {
		try {
			Connection con = DbUtil.getConnection();
			con.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ServiceException("开启事务失败");
		}
	}

	@Override
	public void commitTrans() throws ServiceException {
		Connection con = null;
		try {
			con = DbUtil.getConnection();
			con.commit();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ServiceException("提交事务失败");
		} finally {
			DbUtil.close(con, null, null);
		}
	}

	@Override
	public void rollbackTrans() throws ServiceException {
		Connection con = null;
		try {
			con = DbUtil.getConnection();
			con.rollback();
			con.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ServiceException("回滚事务失败");
		} finally {
			DbUtil.close(con, null, null);
		}
	}

}
