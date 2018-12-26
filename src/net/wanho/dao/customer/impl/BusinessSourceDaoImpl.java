package net.wanho.dao.customer.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.customer.BusinessSourceDaoI;
import net.wanho.po.customer.BusinessSource;
import net.wanho.po.customer.BusinessType;
import net.wanho.util.DbUtil;

public class BusinessSourceDaoImpl implements BusinessSourceDaoI {

	@Override
	public int insert(BusinessSource businessSource) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "INSERT INTO business_source(SOURCE_ID,SOURCE_NAME)VALUES(?,?)",businessSource.getSourceId(),businessSource.getSourceName());
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
			return qr.update(DbUtil.getConnection(), "DELETE FROM business_source WHERE SOURCE_ID =?",id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(BusinessSource businessSource) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "UPDATE business_source SET SOURCE_NAME = ? WHERE SOURCE_ID =?"
														,businessSource.getSourceName(),businessSource.getSourceId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public BusinessSource selectById(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT SOURCE_ID sourceId,SOURCE_NAME sourceName FROM business_source WHERE SOURCE_ID=?",new BeanHandler<>(BusinessSource.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(BusinessSource info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BusinessSource> selectCond(int pageNo, int pageSize, BusinessSource info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BusinessSource> selectAll() {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT SOURCE_ID sourceId,SOURCE_NAME sourceName FROM business_source",new BeanListHandler<>(BusinessSource.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
