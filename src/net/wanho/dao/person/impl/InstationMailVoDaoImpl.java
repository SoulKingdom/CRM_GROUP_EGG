package net.wanho.dao.person.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.person.InstationMailVoDaoI;
import net.wanho.util.DbUtil;
import net.wanho.util.JDBCUtil;
import net.wanho.vo.person.InstationMailVo;

public class InstationMailVoDaoImpl implements InstationMailVoDaoI {

	@Override
	public List<InstationMailVo> selectAll() {
		QueryRunner qr = new QueryRunner();

		try {
			return qr.query(JDBCUtil.getConnection(),
					"SELECT i.MAIL_ID mailId, e.EMPLOYEE_NAME senderPerson, e1.EMPLOYEE_NAME receiverPerson,i.THEME,i.STATUS,i.REMARK,i.CREATE_TIME createtime,i.UPDATE_TIME updatetime,i.CONTENT  FROM instation_mail i LEFT JOIN employee e ON i.SENDER_ID=e.EMPLOYEE_ID LEFT JOIN employee e1 ON i.RECEIVER_ID=e1.EMPLOYEE_ID WHERE i.REMARK=0",
					new BeanListHandler<InstationMailVo>(InstationMailVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete(String delId) {
		QueryRunner qr = new QueryRunner();

		try {
			return qr.update(JDBCUtil.getConnection(), "DELETE FROM instation_mail WHERE MAIL_ID=?", delId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public InstationMailVo selectByMailId(String mailId) {

		QueryRunner qr = new QueryRunner();

		try {
			return qr.query(JDBCUtil.getConnection(),
					"SELECT i.MAIL_ID mailId, e.EMPLOYEE_NAME senderPerson, e1.EMPLOYEE_NAME receiverPerson,i.THEME,i.STATUS,i.REMARK,i.CREATE_TIME,i.UPDATE_TIME,i.CONTENT  FROM instation_mail i LEFT JOIN employee e ON i.SENDER_ID=e.EMPLOYEE_ID LEFT JOIN employee e1 ON i.RECEIVER_ID=e1.EMPLOYEE_ID WHERE MAIL_ID=?",
					new BeanHandler<InstationMailVo>(InstationMailVo.class), mailId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(String mailId, String status) {
		QueryRunner qr = new QueryRunner();

		try {
			System.out.println("==mailId======status========>" + mailId + status);
			return qr.update(JDBCUtil.getConnection(), "UPDATE instation_mail SET STATUS=? WHERE MAIL_ID=?", status,
					mailId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<InstationMailVo> selectStatusAll(String ststus) {
		StringBuilder sb = new StringBuilder(
				"SELECT i.MAIL_ID mailId, e.EMPLOYEE_NAME senderPerson, e1.EMPLOYEE_NAME receiverPerson,i.THEME,i.STATUS,i.REMARK,i.CREATE_TIME createtime,i.UPDATE_TIME updatetime,i.CONTENT  FROM instation_mail i LEFT JOIN employee e ON i.SENDER_ID=e.EMPLOYEE_ID LEFT JOIN employee e1 ON i.RECEIVER_ID=e1.EMPLOYEE_ID WHERE i.status=  ");
		QueryRunner qr = new QueryRunner();
		if ("2".equals(ststus)) {
			sb.append("2");
		} else {
			sb.append("3");
		}

		try {
			return qr.query(JDBCUtil.getConnection(), sb.toString(),
					new BeanListHandler<InstationMailVo>(InstationMailVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<InstationMailVo> selectLike(String k) {
		QueryRunner qr = new QueryRunner();

		try {
			return qr.query(JDBCUtil.getConnection(),
					"SELECT i.MAIL_ID mailId, e.EMPLOYEE_NAME senderPerson, e1.EMPLOYEE_NAME receiverPerson,i.THEME,i.STATUS,i.REMARK,i.CREATE_TIME createtime,i.UPDATE_TIME updatetime,i.CONTENT  FROM instation_mail i LEFT JOIN employee e ON i.SENDER_ID=e.EMPLOYEE_ID LEFT JOIN employee e1 ON i.RECEIVER_ID=e1.EMPLOYEE_ID WHERE i.THEME LIKE '%"
							+ k + "%';  ",
					new BeanListHandler<InstationMailVo>(InstationMailVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<InstationMailVo> selectllAll() {
		QueryRunner qr = new QueryRunner();

		try {
			return qr.query(JDBCUtil.getConnection(),
					"SELECT i.MAIL_ID mailId, e.EMPLOYEE_NAME senderPerson, e1.EMPLOYEE_NAME receiverPerson,i.THEME,i.STATUS,i.REMARK,i.CREATE_TIME createtime,i.UPDATE_TIME updatetime,i.CONTENT  FROM instation_mail i LEFT JOIN employee e ON i.SENDER_ID=e.EMPLOYEE_ID LEFT JOIN employee e1 ON i.RECEIVER_ID=e1.EMPLOYEE_ID WHERE i.REMARK=1",
					new BeanListHandler<InstationMailVo>(InstationMailVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(InstationMailVo instationMailVo) {
		QueryRunner qr = new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(),
					" INSERT INTO instation_mail (RECEIVER_ID,THEME,CONTENT,REMARK,STATUS,UPDATE_TIME)VALUES (?,?,?,1,4,NOW());",
					instationMailVo.getReceiverId(), instationMailVo.getTheme(), instationMailVo.getContent());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
