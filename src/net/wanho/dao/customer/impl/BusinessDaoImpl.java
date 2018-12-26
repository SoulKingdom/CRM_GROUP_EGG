package net.wanho.dao.customer.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.customer.BusinessDaoI;
import net.wanho.po.customer.Business;
import net.wanho.util.DbUtil;
import net.wanho.vo.customer.BusinessVo;

public class BusinessDaoImpl implements BusinessDaoI {

	@Override
	public int insert(Business business) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "INSERT INTO business (BUSINESS_ID, CUSTOMER_ID,LINK_MAIN_ID,BUSINESS_NAME,BUSINESS_TYPE_ID,STATUS, BUSINESS_SOURCE_ID,PERSALE_PRICE,PROBABILITY,VISIT_TIME,VISIT_CONTENT,UPDATE_TIME,EMPLOYEE_ID)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);"
					                          ,business.getBusinessId(),business.getCustomerId(),business.getLinkMainId(),business.getBusinessName(),business.getBusinessTypeId(),business.getStatus(),business.getBusinessSourceId(),business.getPersalePrice(),business.getProbability(),business.getVisitTime(),business.getVisitContent(),business.getUpdateTime(),business.getEmployeeId());
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
			return qr.update(DbUtil.getConnection(), "DELETE FROM business WHERE BUSINESS_ID =?",id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Business business) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "UPDATE business SET CUSTOMER_ID =?,LINK_MAIN_ID =?,BUSINESS_NAME = ?,BUSINESS_TYPE_ID = ?,STATUS = ?,BUSINESS_SOURCE_ID =?,PERSALE_PRICE = ?,PROBABILITY =?,VISIT_TIME =?,VISIT_CONTENT =?,UPDATE_TIME =? ,EMPLOYEE_ID =? WHERE BUSINESS_ID = ?"
				                                     ,business.getCustomerId(),business.getLinkMainId(),business.getBusinessName(),business.getBusinessTypeId(),business.getStatus(),business.getBusinessSourceId(),business.getPersalePrice(),business.getProbability(),business.getVisitTime(),business.getVisitContent(),business.getUpdateTime(),business.getEmployeeId(),business.getBusinessId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Business selectById(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT BUSINESS_ID businessId, CUSTOMER_ID customerId, LINK_MAIN_ID linkMainId, BUSINESS_NAME businessName, BUSINESS_TYPE_ID businessTypeId,STATUS status,BUSINESS_SOURCE_ID businessSourceId,PERSALE_PRICE persalePrice,PROBABILITY probability,VISIT_TIME visitTime,VISIT_CONTENT visitContent,UPDATE_TIME updateTime, EMPLOYEE_ID employeeId FROM business WHERE BUSINESS_ID=?",new BeanHandler<>(Business.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(Business business) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Business> selectCond(int pageNo, int pageSize, Business info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BusinessVo> selectAll() {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT b.BUSINESS_ID businessId, b.CUSTOMER_ID customerId, b.LINK_MAIN_ID linkManId, b.BUSINESS_NAME businessName, b.BUSINESS_TYPE_ID typeId, b.STATUS, b.BUSINESS_SOURCE_ID sourceId, b.PERSALE_PRICE persalePrice, b.PROBABILITY probability, b.VISIT_TIME visitTime, b.VISIT_CONTENT visitContent, b.UPDATE_TIME updateTime, b.EMPLOYEE_ID employeeId,al.CREATOR creator,c.CUSTOMER_NAME customerName,lm.NAME NAME,bt.TYPE_NAME typeName,bs.SOURCE_NAME sourceName,lm.SEX,lm.PHONENUM,lm.EMAIL,lm.QQ,c.CREATE_TIME createTime,c.UPDATE_TIME updateTime,lm.NICKNAME FROM business b LEFT JOIN advanced_log al ON al.BUSINESS_ID=b.BUSINESS_ID LEFT JOIN customer c ON c.CUSTOMER_ID=b.CUSTOMER_ID LEFT JOIN link_man lm ON lm.LINK_MAIN_ID=b.LINK_MAIN_ID LEFT JOIN business_type bt ON bt.TYPE_ID=b.BUSINESS_TYPE_ID LEFT JOIN business_source bs ON bs.SOURCE_ID=b.BUSINESS_SOURCE_ID WHERE 1=1",new BeanListHandler<>(BusinessVo.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BusinessVo selectByKey(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT b.BUSINESS_ID businessId,e.EMPLOYEE_NAME employeeName,e.CREATE_TIME createTime,e.UPDATE_TIME updateTime,c.CUSTOMER_NAME customerName,lm.NAME,lm.SEX,lm.PHONENUM,lm.QQ qQ,lm.EMAIL,b.BUSINESS_NAME businessName,bt.TYPE_NAME typeName,b.STATUS,bs.SOURCE_NAME sourceName,b.PROBABILITY,b.PERSALE_PRICE persalePrice,b.VISIT_TIME visitTime,b.VISIT_CONTENT visitContent,b.BUSINESS_SOURCE_ID sourceId,b.BUSINESS_TYPE_ID typeId FROM business b LEFT JOIN customer c ON c.CUSTOMER_ID=b.CUSTOMER_ID LEFT JOIN link_man lm ON lm.LINK_MAIN_ID=b.LINK_MAIN_ID LEFT JOIN business_type bt ON bt.TYPE_ID=b.BUSINESS_TYPE_ID LEFT JOIN business_source bs ON bs.SOURCE_ID=b.BUSINESS_SOURCE_ID LEFT JOIN employee e ON e.EMPLOYEE_ID=b.EMPLOYEE_ID WHERE BUSINESS_ID=?",new BeanHandler<>(BusinessVo.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<BusinessVo> selectcondition(String text, String type) {
		QueryRunner qr=new QueryRunner();
		StringBuilder sb=new StringBuilder();
		sb.append("SELECT b.BUSINESS_ID businessId, b.CUSTOMER_ID customerId, b.LINK_MAIN_ID linkManId, b.BUSINESS_NAME businessName, b.BUSINESS_TYPE_ID typeId, b.STATUS, b.BUSINESS_SOURCE_ID sourceId, b.PERSALE_PRICE persalePrice, b.PROBABILITY probability, b.VISIT_TIME visitTime, b.VISIT_CONTENT visitContent, b.UPDATE_TIME updateTime, b.EMPLOYEE_ID employeeId,al.CREATOR creator,c.CUSTOMER_NAME customerName,lm.NAME NAME,bt.TYPE_NAME typeName,bs.SOURCE_NAME sourceName,lm.SEX,lm.PHONENUM,lm.EMAIL,lm.QQ,c.CREATE_TIME createTime,c.UPDATE_TIME updateTime,lm.NICKNAME FROM business b LEFT JOIN advanced_log al ON al.BUSINESS_ID=b.BUSINESS_ID LEFT JOIN customer c ON c.CUSTOMER_ID=b.CUSTOMER_ID LEFT JOIN link_man lm ON lm.LINK_MAIN_ID=b.LINK_MAIN_ID LEFT JOIN business_type bt ON bt.TYPE_ID=b.BUSINESS_TYPE_ID LEFT JOIN business_source bs ON bs.SOURCE_ID=b.BUSINESS_SOURCE_ID WHERE 1=1");
		if("1".equals(type)){
			sb.append(" and business_type_id ="+text);
		}else if("2".equals(type)){
			sb.append(" and status ="+text);
		}
		else if("3".equals(type)){
			sb.append(" and business_source_id ="+text);
		}else if("4".equals(type)){
			sb.append(" and business_name like '%"+text+"%'");
		}
		else if("5".equals(type)){
			sb.append(" and persale_price ="+text);
		}
		try {
			System.out.println(sb.toString());
			return qr.query(DbUtil.getConnection(),sb.toString(),new BeanListHandler<>(BusinessVo.class));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<BusinessVo> selectconditionTime(String text, String textTime, String type) {
		QueryRunner qr=new QueryRunner();
		StringBuilder sb=new StringBuilder();
		sb.append("SELECT b.BUSINESS_ID businessId, b.CUSTOMER_ID customerId, b.LINK_MAIN_ID linkManId, b.BUSINESS_NAME businessName, b.BUSINESS_TYPE_ID typeId, b.STATUS, b.BUSINESS_SOURCE_ID sourceId, b.PERSALE_PRICE persalePrice, b.PROBABILITY probability, b.VISIT_TIME visitTime, b.VISIT_CONTENT visitContent, b.UPDATE_TIME updateTime, b.EMPLOYEE_ID employeeId,al.CREATOR creator,c.CUSTOMER_NAME customerName,lm.NAME NAME,bt.TYPE_NAME typeName,bs.SOURCE_NAME sourceName,lm.SEX,lm.PHONENUM,lm.EMAIL,lm.QQ,c.CREATE_TIME createTime,c.UPDATE_TIME updateTime,lm.NICKNAME FROM business b LEFT JOIN advanced_log al ON al.BUSINESS_ID=b.BUSINESS_ID LEFT JOIN customer c ON c.CUSTOMER_ID=b.CUSTOMER_ID LEFT JOIN link_man lm ON lm.LINK_MAIN_ID=b.LINK_MAIN_ID LEFT JOIN business_type bt ON bt.TYPE_ID=b.BUSINESS_TYPE_ID LEFT JOIN business_source bs ON bs.SOURCE_ID=b.BUSINESS_SOURCE_ID WHERE 1=1 ");
		if("6".equals(type)){	
		sb.append(" and b.VISIT_TIME between '").append(text).append("' and '").append(textTime).append("'");
		}
		else{
			sb.append(" and b.UPDATE_TIME between '").append(text).append("' and '").append(textTime).append("'");
		}
			try {
				return qr.query(DbUtil.getConnection(),sb.toString(),new BeanListHandler<>(BusinessVo.class));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}
}
