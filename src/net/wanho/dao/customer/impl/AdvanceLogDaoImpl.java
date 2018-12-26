package net.wanho.dao.customer.impl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import net.wanho.dao.customer.AdvanceLogDaoI;
import net.wanho.po.customer.AdvanceLog;
import net.wanho.util.DbUtil;

public class AdvanceLogDaoImpl implements AdvanceLogDaoI {
	@Override
	public int insert(AdvanceLog advanceLog) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "INSERT INTO advanced_log (LOG_ID,BUSINESS_ID,CREATOR,ADVANCE_CONTENT,CREATE_TIME,ADVANCE_STATUS) VALUES (?,?,?,?,?,?)"
					,advanceLog.getLogId(),advanceLog.getBusinessId(),advanceLog.getCreator(),advanceLog.getAdvanceContent(),advanceLog.getCreateTime(),advanceLog.getAdvanceStatus());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "DELETE FROM advanced_log WHERE LOG_ID =?",id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(AdvanceLog advanceLog) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "UPDATE advanced_log SET BUSINESS_ID = ?,CREATOR =?,ADVANCE_CONTENT =?,CREATE_TIME =?,ADVANCE_STATUS =? WHERE LOG_ID =?"
					,advanceLog.getBusinessId(),advanceLog.getCreator(),advanceLog.getAdvanceContent(),advanceLog.getCreateTime(),advanceLog.getAdvanceStatus(),advanceLog.getLogId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int selectCondCount(AdvanceLog advanceLog) {
		StringBuffer sb = new StringBuffer("SELECT COUNT(1) advanceLog_COUNT from advanced_log WHERE 1=1");
		List<String> advanceLogList = new ArrayList<>(0);
		/*if (advanceLog.getAdvanceContent() != null) {
			sb.append("AND ADVANCE_CONTENT advanceContent LIKE ").append("? ");
			advanceLogList.add("%" + advanceLog.getAdvanceContent() + "%");
		}
		if (advanceLog.getBusinessId() != null) {
			sb.append("AND BUSINESS_ID businessId = ").append("? ");
			advanceLogList.add(String.valueOf(advanceLog.getBusinessId()));
		}
		if (advanceLog.getCreator() != null) {
			sb.append("AND CREATOR = ").append("? ");
			advanceLogList.add(String.valueOf(advanceLog.getCreator()));
		}
		if (advanceLog.getCreateTime() != null) {
			sb.append("AND createTime LIKE ").append("? ");
			advanceLogList.add("%" + advanceLog.getCreateTime() + "%");
		}*/

		QueryRunner qr = new QueryRunner();
		try {
			Map map = qr.query(DbUtil.getConnection(), sb.toString(), new MapHandler(), advanceLogList.toArray());
			return ((BigDecimal) map.get("USER_COUNT")).intValue();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<AdvanceLog> selectCond(int pageNo, int pageSize, AdvanceLog advanceLog) {
		StringBuffer sb = new StringBuffer("SELECT LOG_ID logId,BUSINESS_ID businessId,CREATOR,ADVANCE_CONTENT,CREATE_TIME,ADVANCE_STATUS FROM advanced_log where 1=1 LIMIT ?,?");
		List<String> userList = new ArrayList<>(0);
		/*if (user.getAccount() != null) {
			sb.append("AND account LIKE ").append("? ");
			userList.add("%" + user.getAccount() + "%");
		}
		if (user.getAddress() != null) {
			sb.append("AND address LIKE ").append("? ");
			userList.add("%" + user.getAddress() + "%");
		}
		if (user.getAge() != null) {
			sb.append("AND age = ").append("? ");
			userList.add(String.valueOf(user.getAge()));
		}
		if (user.getSex() != null) {
			sb.append("AND sex = ").append("? ");
			userList.add(String.valueOf(user.getSex()));
		}
		if (user.getLikes() != null) {
			sb.append("AND likes LIKE ").append("? ");
			userList.add("%" + user.getLikes() + "%");
		}*/
		userList.add(String.valueOf(pageNo * pageSize));
		userList.add(String.valueOf((pageNo - 1) * pageSize));
		QueryRunner qr = new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), sb.toString(), new BeanListHandler<>(AdvanceLog.class),userList.toArray());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public AdvanceLog selectById(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT  LOG_ID logId,BUSINESS_ID businessId,CREATOR creator,ADVANCE_CONTENT advanceContent,CREATE_TIME createTime,ADVANCE_STATUS advanceStatus FROM advanced_log WHERE LOG_ID=?",new BeanHandler<>(AdvanceLog.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<AdvanceLog> selectAll() {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT  LOG_ID logId,BUSINESS_ID businessId,CREATOR creator,ADVANCE_CONTENT advanceContent,CREATE_TIME createTime,ADVANCE_STATUS advanceStatus FROM advanced_log ",new BeanListHandler<>(AdvanceLog.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
