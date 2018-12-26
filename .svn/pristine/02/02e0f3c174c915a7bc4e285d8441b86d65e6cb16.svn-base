package net.wanho.dao.system.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.system.EmployeePositionDaoI;
import net.wanho.po.system.EmmPosition;
import net.wanho.util.DbUtil;

public class EmployeePositionDaoImpl implements EmployeePositionDaoI {

	@Override
	public List<EmmPosition> selectAll() {
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT  POSITION_ID positionId,POSITION_NAME positionName,POSITION_LEVEL positionLevel,CREATE_TIME createTime,UPDATE_TIME updateTime FROM  emm_position ";
		try {
			return qr.query(DbUtil.getConnection(), sql, new BeanListHandler<EmmPosition>(EmmPosition.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
