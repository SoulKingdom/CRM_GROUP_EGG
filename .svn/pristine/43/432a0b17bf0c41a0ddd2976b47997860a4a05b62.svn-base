package net.wanho.dao.person.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.person.IndividualTaskVoDaoI;
import net.wanho.po.person.IndividualTask;
import net.wanho.util.JDBCUtil;
import net.wanho.vo.person.IndividualTaskVo;

public class IndividualTaskVoDaoImpl implements IndividualTaskVoDaoI {

	@Override
	public List<IndividualTaskVo> selectAll() {
		QueryRunner qr=new QueryRunner();
		
		try {
			return qr.query(JDBCUtil.getConnection(), "SELECT i.TASK_ID taskId,i.TOPIC, e.EMPLOYEE_NAME   associates, e1.EMPLOYEE_NAME principal,i.description,i.END_TIME endtime,i.PRIORITY,i.STATUS,i.CREATE_TIME createtime, e.EMPLOYEE_NAME operator FROM individual_task i  JOIN employee e ON i.RESPONSIBLE_PERSON=e.EMPLOYEE_ID LEFT JOIN task_user_relations t ON i.TASK_ID=t.TASK_ID LEFT JOIN employee e1 ON t.EMPLOYEE_ID=e1.EMPLOYEE_ID  ",new BeanListHandler<IndividualTaskVo>(IndividualTaskVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

	
	public int update(IndividualTask t) {
		// TODO Auto-generated method stub
		QueryRunner qr=new QueryRunner();
		System.out.println(t.getStatus()+":"+t.getTaskId());
		try {
			return qr.update(JDBCUtil.getConnection(),"UPDATE individual_task SET STATUS=? WHERE TASK_ID=?",t.getStatus(),t.getTaskId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}




	@Override
	public int delete(String taskId) {
		
		// TODO Auto-generated method stub
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(JDBCUtil.getConnection(),"DELETE FROM individual_task WHERE TASK_ID=?",taskId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}




	@Override
	public List<IndividualTaskVo>  selectByStatus(String status) {
       QueryRunner qr=new QueryRunner();
		
		try {
			return qr.query(JDBCUtil.getConnection(), "SELECT i.TASK_ID,i.TOPIC, e.EMPLOYEE_NAME   associates, e1.EMPLOYEE_NAME principal,i.description,i.END_TIME endtime,i.PRIORITY,i.STATUS,i.CREATE_TIME createtime, e.EMPLOYEE_NAME operator FROM individual_task i  JOIN employee e ON i.RESPONSIBLE_PERSON=e.EMPLOYEE_ID LEFT JOIN task_user_relations t ON i.TASK_ID=t.TASK_ID LEFT JOIN employee e1 ON t.EMPLOYEE_ID=e1.EMPLOYEE_ID WHERE  i.status=?",new BeanListHandler<IndividualTaskVo>(IndividualTaskVo.class),status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}




	@Override
	public List<IndividualTaskVo> selectByIdentity(String identity,String name) {
		StringBuilder sb=new StringBuilder("SELECT i.TASK_ID,i.TOPIC, e.EMPLOYEE_NAME   associates, e1.EMPLOYEE_NAME principal,i.description,i.END_TIME endtime,i.PRIORITY,i.STATUS,i.CREATE_TIME createtime, e.EMPLOYEE_NAME operator FROM individual_task i  JOIN employee e ON i.RESPONSIBLE_PERSON=e.EMPLOYEE_ID LEFT JOIN task_user_relations t ON i.TASK_ID=t.TASK_ID LEFT JOIN employee e1 ON t.EMPLOYEE_ID=e1.EMPLOYEE_ID ");
		if("1".equals(identity))
		{
			sb.append("  WHERE  e.EMPLOYEE_NAME=?");
		}
		else
		{
			sb.append(" AND e1.EMPLOYEE_NAME=? ");
		}
       QueryRunner qr=new QueryRunner();
		
		try {
			return qr.query(JDBCUtil.getConnection(), sb.toString(),new BeanListHandler<IndividualTaskVo>(IndividualTaskVo.class),name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	
	}




	@Override
	public IndividualTaskVo selectById(int taskId) {
		   QueryRunner qr=new QueryRunner();
			
			try {
				return qr.query(JDBCUtil.getConnection(), "SELECT i.TASK_ID,i.TOPIC, e.EMPLOYEE_NAME   associates, e1.EMPLOYEE_NAME principal,i.description,i.END_TIME endtime,i.PRIORITY,i.STATUS,i.CREATE_TIME createtime, e.EMPLOYEE_NAME operator FROM individual_task i  JOIN employee e ON i.RESPONSIBLE_PERSON=e.EMPLOYEE_ID LEFT JOIN task_user_relations t ON i.TASK_ID=t.TASK_ID LEFT JOIN employee e1 ON t.EMPLOYEE_ID=e1.EMPLOYEE_ID WHERE  i.TASK_ID=?",new BeanHandler<IndividualTaskVo>(IndividualTaskVo.class),taskId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}




	@Override
	public int insert(IndividualTaskVo indicidualTask) {
		
		// TODO Auto-generated method stub
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(JDBCUtil.getConnection(),"INSERT INTO individual_task (TASK_ID, TOPIC, DESCRIPTION, RESPONSIBLE_PERSON, END_TIME, PRIORITY, STATUS, CREATE_TIME, OPERATOR, LINK_URL, TASK_TYPE)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",indicidualTask.getTaskId(),indicidualTask.getTopic(),indicidualTask.getDescription(),indicidualTask.getResponsiblePerson(),indicidualTask.getEndTime(),indicidualTask.getPriority(),indicidualTask.getStatus(),indicidualTask.getCreateTime(),indicidualTask.getOperator(),indicidualTask.getLinkUrl(),indicidualTask.getTaskType());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
    
	public static void main(String[] args) {
		IndividualTaskVo  indicidualTask = new IndividualTaskVo();
		indicidualTask.setOperator("1");
		IndividualTaskVoDaoI individualTaskVoDaoI = new  IndividualTaskVoDaoImpl();
		individualTaskVoDaoI.insert(indicidualTask);
	}

}
