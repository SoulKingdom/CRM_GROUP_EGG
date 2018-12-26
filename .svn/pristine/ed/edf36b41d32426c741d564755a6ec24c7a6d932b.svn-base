package net.wanho.dao.person.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.person.DailyLogDaoI;
import net.wanho.util.JDBCUtil;
import net.wanho.vo.person.DailyLogVo;
import net.wanho.vo.person.IndividualTaskVo;

public class DailyLogDaoImpl implements DailyLogDaoI {

	@Override
	public List<DailyLogVo> selectAll() {
		QueryRunner qr = new QueryRunner();

		try {
			return qr.query(JDBCUtil.getConnection(),
					"SELECT  d1.RECORD_ID recordId,d1.TITLE,e.EMPLOYEE_NAME creater,d1.CREATE_TIME createtime,d1.UPDATE_TIME updatetime,t.count  FROM daily_record d1 LEFT JOIN  employee e ON d1.CREATOR=e.EMPLOYEE_ID LEFT JOIN (SELECT COUNT(1) COUNT ,RECORD_ID,COMMENT_ID FROM COMMENT  GROUP BY RECORD_ID)t ON d1.RECORD_ID=t.RECORD_ID",
					new BeanListHandler<DailyLogVo>(DailyLogVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<DailyLogVo> queryByDate(String serach_status) {
		StringBuilder sb = new StringBuilder(
				"SELECT  d1.RECORD_ID,d1.TITLE,e.EMPLOYEE_NAME creater,d1.CREATE_TIME createtime,d1.UPDATE_TIME updatetime,t.count  FROM daily_record d1 LEFT JOIN  employee e ON d1.CREATOR=e.EMPLOYEE_ID LEFT JOIN (SELECT COUNT(1) COUNT ,RECORD_ID,COMMENT_ID FROM COMMENT  GROUP BY RECORD_ID)t ON d1.RECORD_ID=t.RECORD_ID where  ");
		QueryRunner qr = new QueryRunner();
		if ("4".equals(serach_status)) {
			sb.append("TO_DAYS(d1.CREATE_TIME)=TO_DAYS(NOW()) ");
		} else if ("5".equals(serach_status)) {
			sb.append("DATEDIFF(SYSDATE(),d1.CREATE_TIME)<=7 and DATEDIFF(SYSDATE(),d1.CREATE_TIME)>1");
		} else if ("6".equals(serach_status)) {
			sb.append("DATEDIFF(SYSDATE(),d1.CREATE_TIME)>7");
		} else if ("7".equals(serach_status)) {
			sb.append("DATEDIFF(SYSDATE(),d1.CREATE_TIME)<3");
		}
		System.out.println("============queryByDate==============>" + sb.toString());
		System.out.println("===============serach_status=====================>" + serach_status);
		try {
			return qr.query(JDBCUtil.getConnection(), sb.toString(), new BeanListHandler<DailyLogVo>(DailyLogVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<DailyLogVo> selectById(int employeeId) {
		QueryRunner qr = new QueryRunner();

		try {
			return qr.query(JDBCUtil.getConnection(),
					"SELECT  d1.RECORD_ID,d1.TITLE,e.EMPLOYEE_NAME creater,d1.CREATE_TIME createtime,d1.UPDATE_TIME updatetime,t.count  FROM daily_record d1 LEFT JOIN  employee e ON d1.CREATOR=e.EMPLOYEE_ID LEFT JOIN (SELECT COUNT(1) COUNT ,RECORD_ID,COMMENT_ID FROM COMMENT  GROUP BY RECORD_ID)t ON d1.RECORD_ID=t.RECORD_ID WHERE d1.creator=?",
					new BeanListHandler<DailyLogVo>(DailyLogVo.class), employeeId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<DailyLogVo> selectByLike(String k) {
		StringBuilder sb = new StringBuilder(
				"SELECT  d1.RECORD_ID recordId,d1.TITLE,e.EMPLOYEE_NAME creater,d1.CREATE_TIME createtime,d1.UPDATE_TIME updatetime,t.count  FROM daily_record d1 LEFT JOIN  employee e ON d1.CREATOR=e.EMPLOYEE_ID LEFT JOIN (SELECT COUNT(1) COUNT ,RECORD_ID,COMMENT_ID FROM COMMENT  GROUP BY RECORD_ID)t ON d1.RECORD_ID=t.RECORD_ID");
		QueryRunner qr = new QueryRunner();
		if ("subject".equals(k)) {
			sb.append(" ORDER BY title ASC");
		}
		if ("created_at".equals(k)) {
			sb.append(" ORDER BY CREATETIME ASC");
		}
		if ("updated_at".equals(k)) {
			sb.append(" ORDER BY UPDATETIME desc");
		}
		try {
			return qr.query(JDBCUtil.getConnection(), sb.toString(), new BeanListHandler<DailyLogVo>(DailyLogVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(DailyLogVo dailyLogVo) {
		QueryRunner qr = new QueryRunner();

		try {
			return qr.update(JDBCUtil.getConnection(),
					"INSERT INTO daily_record (RECORD_ID, CREATOR, TITLE, CONTENT, CREATE_TIME, RECORDLX, UPDATE_TIME)VALUES(?,?,?,?,?,?,?)", dailyLogVo.getRecordId(),
					dailyLogVo.getCreater(), dailyLogVo.getTitle(), dailyLogVo.getContent(), dailyLogVo.getCreateTime(),
					dailyLogVo.getRecordlx(), dailyLogVo.getUpdateTime());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public static void main(String[] args) {
		DailyLogDaoI dailyLogDaoI = new DailyLogDaoImpl();
		DailyLogVo dailyLogVo = new DailyLogVo();
		dailyLogVo.setContent("dfdasfasdfasdf");
		dailyLogDaoI.insert(dailyLogVo);
	}
}
