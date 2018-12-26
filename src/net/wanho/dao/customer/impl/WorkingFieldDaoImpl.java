package net.wanho.dao.customer.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.customer.WorkingFieldDaoI;
import net.wanho.po.customer.BusinessType;
import net.wanho.po.customer.WorkingField;
import net.wanho.util.DbUtil;

public class WorkingFieldDaoImpl implements WorkingFieldDaoI {

	@Override
	public int insert(WorkingField workingField) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "INSERT INTO working_field (FIELD_ID,FIELD_NAME) VALUES(?,?)"
					                                       ,workingField.getFieldId(),workingField.getFieldName());
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
			return qr.update(DbUtil.getConnection(), "DELETE FROM working_field WHERE FIELD_ID =?",id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(WorkingField workingField) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "UPDATE working_field SET FIELD_NAME =? WHERE FIELD_ID =?"
														,workingField.getFieldName(),workingField.getFieldId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public WorkingField selectById(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT FIELD_ID fieldId,FIELD_NAME fieldName FROM working_field WHERE FIELD_ID=?",new BeanHandler<>(WorkingField.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(WorkingField info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<WorkingField> selectCond(int pageNo, int pageSize, WorkingField info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkingField> selectAll() {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT FIELD_ID fieldId,FIELD_NAME fieldName FROM working_field",new BeanListHandler<>(WorkingField.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
