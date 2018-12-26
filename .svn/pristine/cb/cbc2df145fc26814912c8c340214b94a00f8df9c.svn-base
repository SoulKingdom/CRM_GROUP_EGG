package net.wanho.dao.customer.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.customer.BusinessTypeDaoI;
import net.wanho.po.customer.BusinessSource;
import net.wanho.po.customer.BusinessType;
import net.wanho.util.DbUtil;

public class BusinessTypeDaoImpl implements BusinessTypeDaoI {

	@Override
	public int insert(BusinessType businessType) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "INSERT INTO business_type (TYPE_ID,TYPE_NAME) VALUES(?,?)"
					                                       ,businessType.getTypeId(),businessType.getTypeName());
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
	public int update(BusinessType businessType) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "UPDATE business_type SET TYPE_NAME =? WHERE TYPE_ID =?"
														,businessType.getTypeName(),businessType.getTypeId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public BusinessType selectById(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT TYPE_ID typeId,TYPE_NAME typeName FROM business_type where TYPE_ID=?",new BeanHandler<>(BusinessType.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(BusinessType info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BusinessType> selectCond(int pageNo, int pageSize, BusinessType info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BusinessType> selectAll() {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT TYPE_ID typeId,TYPE_NAME typeName FROM business_type ",new BeanListHandler<>(BusinessType.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
