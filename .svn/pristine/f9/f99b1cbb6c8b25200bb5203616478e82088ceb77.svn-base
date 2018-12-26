package net.wanho.dao.product.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.log4j.Logger;

import net.wanho.dao.product.ProcessDaoI;
import net.wanho.po.product.ProcessInfo;
import net.wanho.util.DbUtil;

public class ProcessDaoImpl implements ProcessDaoI {
	private static Logger log = Logger.getLogger(ProcessDaoImpl.class);

	@Override
	public int insert(ProcessInfo process) {
		QueryRunner qr = new QueryRunner();
		String sql="INSERT INTO process (process_id, type, business_id, status, opinions, operator, create_time)VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			return qr.update(DbUtil.getConnection(), sql,process.getProcessId(),process.getType(),process.getBusinessId(),process.getStatus(),process.getOpinions(),process.getOperator(),process.getCreateTime());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="DELETE FROM process WHERE PROCESS_ID = ? ;";
		try {
			return qr.update(DbUtil.getConnection(), sql, id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(ProcessInfo process) {
		QueryRunner qr = new QueryRunner();
		String sql="UPDATE process SET  TYPE = ? , BUSINESS_ID = ? , STATUS = ? , OPINIONS = ? , OPERATOR = ? , CREATE_TIME = ? WHERE PROCESS_ID = ?";
		try {
			return qr.update(DbUtil.getConnection(), sql,process.getType(),process.getBusinessId(),process.getStatus(),process.getOpinions(),process.getOperator(),process.getCreateTime(),process.getProcessId());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ProcessInfo selectById(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="SELECT 	process_id processId , type type, business_id businessId, status status, opinions opinions, operator operator, create_time createTime FROM process WHERE process_id=?";
		try {
			return qr.query(DbUtil.getConnection(),sql,new BeanHandler<ProcessInfo>(ProcessInfo.class),id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(ProcessInfo process) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProcessInfo> selectCond(int pageNo, int pageSize, ProcessInfo process) {
		// TODO Auto-generated method stub
		return null;
	}

}
