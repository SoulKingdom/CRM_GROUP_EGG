package net.wanho.dao.customer.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import net.wanho.dao.customer.SourceDaoI;
import net.wanho.po.customer.BusinessSource;
import net.wanho.po.customer.Source;
import net.wanho.util.DbUtil;

public class SourceDaoImpl implements SourceDaoI {

	@Override
	public int insert(Source source) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "INSERT INTO source(SOURCE_ID,SOURCE_NAME) VALUES(?,?)"
					                                       ,source.getSourceId(),source.getSourceName());
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
			return qr.update(DbUtil.getConnection(), "DELETE FROM source WHERE SOURCE_ID =?",id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Source source) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "UPDATE source SET SOURCE_NAME =? WHERE SOURCE_ID = ?"
														,source.getSourceName(),source.getSourceId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Source selectById(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT SOURCE_ID sourceId,SOURCE_NAME sourceName FROM source WHERE SOURCE_ID=?",new BeanHandler<>(Source.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(Source info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Source> selectCond(int pageNo, int pageSize, Source info) {
		// TODO Auto-generated method stub
		return null;
	}

}
