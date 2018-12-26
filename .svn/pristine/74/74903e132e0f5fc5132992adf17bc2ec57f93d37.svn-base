package net.wanho.dao.customer.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.customer.CustomerDaoI;
import net.wanho.po.customer.Customer;
import net.wanho.util.DbUtil;
import net.wanho.vo.customer.BusinessVo;
import net.wanho.vo.customer.CustomerVo;
import net.wanho.vo.customer.PrincipalVo;

public class CustomerDaoImpl implements CustomerDaoI {

	@Override
	public int insert(Customer customer) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "INSERT INTO customer(CUSTOMER_ID,CUSTOMER_NAME,POST_CODE,FIELD_ID,SOURCE_ID,CREATE_TIME,UPDATE_TIME,EMPLOYEE_NUMBERS,PRINPICAL,ADDRESS,TAG,REMARKS,BUSUBESS_VOLUME) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)"
					        ,customer.getCustomerId(),customer.getCustomerName(),customer.getPostCode(),customer.getFieldId(),customer.getSourceId(),customer.getCreateTime(),customer.getUpdateTime(),customer.getEmployeeNumbers(),customer.getPrinpical(),customer.getAddress(),customer.getTag(),customer.getRemarks(),customer.getBusubessVolume());
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
			return qr.update(DbUtil.getConnection(), "DELETE FROM customer WHERE CUSTOMER_ID =?",id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Customer customer) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "UPDATE customer SET CUSTOMER_NAME = ?,POST_CODE =?,FIELD_ID = ?,SOURCE_ID = ?,CREATE_TIME =?,UPDATE_TIME =?,EMPLOYEE_NUMBERS = ?,PRINPICAL = ?,TAG = ? ,REMARKS = ? ,BUSUBESS_VOLUME = ? WHERE CUSTOMER_ID =?"
												,customer.getCustomerName(),customer.getPostCode(),customer.getFieldId(),customer.getSourceId(),customer.getCreateTime(),customer.getUpdateTime(),customer.getEmployeeNumbers(),customer.getPrinpical(),customer.getTag(),customer.getRemarks(),customer.getBusubessVolume(),customer.getCustomerId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Customer selectById(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT lm.NAME,c.CREATE_TIME createTime,c.UPDATE_TIME updateTime,c.CUSTOMER_NAME customerName,c.POST_CODE postCode,wf.FIELD_NAME fieldName,bs.SOURCE_NAME sourceName,c.BUSUBESS_VOLUME busubessVolume,c.EMPLOYEE_NUMBERS employeeNumbers,c.TAG,c.REMARKS FROM customer c LEFT JOIN link_man lm ON lm.LINK_MAIN_ID=c.PRINPICAL LEFT JOIN working_field wf ON wf.FIELD_ID=c.FIELD_ID LEFT JOIN business_source bs ON bs.SOURCE_ID=c.SOURCE_ID where c.CUSTOMER_ID=?",new BeanHandler<>(Customer.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(Customer info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> selectCond(int pageNo, int pageSize, Customer info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerVo> selectAll() {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT c.CUSTOMER_ID customerId,c.customer_name customerName,c.FIELD_ID fieldId,c.SOURCE_ID sourceId,e.EMPLOYEE_NAME NAME,c.CUSTOMER_NAME customerName,wf.FIELD_NAME fieldName,bs.SOURCE_NAME sourceName,c.CREATE_TIME createTime,c.UPDATE_TIME updateTime FROM customer c LEFT JOIN business_source bs ON c.SOURCE_ID=bs.SOURCE_ID LEFT JOIN working_field wf ON c.FIELD_ID=wf.FIELD_ID LEFT JOIN employee e ON e.EMPLOYEE_ID =c.PRINPICAL WHERE 1=1",new BeanListHandler<>(CustomerVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public CustomerVo selectByKey(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT c.CUSTOMER_ID customerId,e.EMPLOYEE_NAME NAME,c.CREATE_TIME createTime,c.UPDATE_TIME updateTime,c.CUSTOMER_NAME customerName,c.FIELD_ID fieldId,c.SOURCE_ID sourceId,c.POST_CODE postCode,wf.FIELD_NAME fieldName,bs.SOURCE_NAME sourceName,c.BUSUBESS_VOLUME busubessVolume,c.EMPLOYEE_NUMBERS employeeNumbers,c.TAG,c.PRINPICAL prinpical,c.REMARKS FROM customer c LEFT JOIN employee e ON e.EMPLOYEE_ID=c.PRINPICAL LEFT JOIN working_field wf ON wf.FIELD_ID=c.FIELD_ID LEFT JOIN business_source bs ON bs.SOURCE_ID=c.SOURCE_ID WHERE c.CUSTOMER_ID=?",new BeanHandler<>(CustomerVo.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<PrincipalVo> selectAllPrincipal() {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT e.EMPLOYEE_ID employeeId,e.EMPLOYEE_NAME employeeName,d.DEPARTMENT_NAME departmentName,ep.POSITION_NAME positionName,e.PHONE phoneNum FROM employee e LEFT JOIN department d ON d.DEPARTMENT_ID=e.DEPARTMENT_ID LEFT JOIN  emm_position  ep ON ep.POSITION_ID=e.POSITON_ID",new BeanListHandler<>(PrincipalVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(CustomerVo customerVo) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "UPDATE customer SET CUSTOMER_NAME =?, POST_CODE =?, FIELD_ID =?, SOURCE_ID = ?, UPDATE_TIME =?, EMPLOYEE_NUMBERS = ?, PRINPICAL =?,TAG =?, REMARKS =? , BUSUBESS_VOLUME =? WHERE CUSTOMER_ID = ?", customerVo.getCustomerName(),customerVo.getPostCode(),customerVo.getFieldId(),customerVo.getSourceId(),customerVo.getUpdateTime(),customerVo.getEmployeeNumbers(),customerVo.getPrinpical(),customerVo.getTag(),customerVo.getRemarks(),customerVo.getBusubessVolume(),customerVo.getCustomerId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<CustomerVo> selectcondition(String text, String type) {
		QueryRunner qr=new QueryRunner();
		StringBuilder sb=new StringBuilder();
		sb.append("SELECT c.CUSTOMER_ID customerId,c.customer_name customerName,c.FIELD_ID fieldId,c.SOURCE_ID sourceId,e.EMPLOYEE_NAME NAME,c.CUSTOMER_NAME customerName,wf.FIELD_NAME fieldName,bs.SOURCE_NAME sourceName,c.CREATE_TIME createTime,c.UPDATE_TIME updateTime FROM customer c LEFT JOIN business_source bs ON c.SOURCE_ID=bs.SOURCE_ID LEFT JOIN working_field wf ON c.FIELD_ID=wf.FIELD_ID LEFT JOIN employee e ON e.EMPLOYEE_ID =c.PRINPICAL WHERE 1=1");
		if("1".equals(type)){
			sb.append(" and c.customer_name like '%"+text+"%'");
			System.out.println(sb.toString());
		}else if("2".equals(type)){
			sb.append(" and c.field_id ="+text);
		}
		else if("3".equals(type)){
			sb.append(" and c.source_id ="+text);
		}
		try {
			System.out.println(sb.toString());
			return qr.query(DbUtil.getConnection(),sb.toString(),new BeanListHandler<>(CustomerVo.class));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<CustomerVo> selectconditionTime(String text, String textTime, String type) {
		QueryRunner qr=new QueryRunner();
		StringBuilder sb=new StringBuilder();
		sb.append("SELECT c.CUSTOMER_ID customerId,c.customer_name customerName,c.FIELD_ID fieldId,c.SOURCE_ID sourceId,e.EMPLOYEE_NAME NAME,c.CUSTOMER_NAME customerName,wf.FIELD_NAME fieldName,bs.SOURCE_NAME sourceName,c.CREATE_TIME createTime,c.UPDATE_TIME updateTime FROM customer c LEFT JOIN business_source bs ON c.SOURCE_ID=bs.SOURCE_ID LEFT JOIN working_field wf ON c.FIELD_ID=wf.FIELD_ID LEFT JOIN employee e ON e.EMPLOYEE_ID =c.PRINPICAL WHERE 1=1");
		if("5".equals(type)){	
		sb.append(" and c.CREATE_TIME between '").append(text).append("' and '").append(textTime).append("'");
		}
		else if("6".equals(type)){
			sb.append(" and c.UPDATE_TIME between '").append(text).append("' and '").append(textTime).append("'");
		}
			try {
				System.out.println(sb.toString());
				return qr.query(DbUtil.getConnection(),sb.toString(),new BeanListHandler<>(CustomerVo.class));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}

}
