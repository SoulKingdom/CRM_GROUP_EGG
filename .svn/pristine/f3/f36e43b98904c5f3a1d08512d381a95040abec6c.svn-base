package net.wanho.dao.product.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.log4j.Logger;

import net.wanho.dao.product.StoreDaoI;
import net.wanho.po.product.ProductType;
import net.wanho.po.product.Store;
import net.wanho.util.DbUtil;

public class StoreDaoImpl implements StoreDaoI{
	private static Logger log = Logger.getLogger(StoreDaoImpl.class);

	@Override
	public int insert(Store store) {
		QueryRunner qr = new QueryRunner();
		String sql="INSERT INTO store (store_id, store_name, description)VALUES(?, ?, ?);";
		try {
			return qr.update(DbUtil.getConnection(),sql,store.getStoreId(),store.getStoreName(),store.getDescription());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="DELETE FROM store WHERE STORE_ID = ? ";
		try {
			return qr.update(DbUtil.getConnection(), sql, id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Store store) {
		QueryRunner qr = new QueryRunner();
		String sql="UPDATE store SET  STORE_NAME = ? , DESCRIPTION = ? WHERE STORE_ID = ?";
		try {
			return qr.update(DbUtil.getConnection(),sql,store.getStoreName(),store.getDescription(),store.getStoreId());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Store selectById(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="SELECT 	store_id storeId, store_name storeName, description description FROM store WHERE store_id=? ";
		try {
			return qr.query(DbUtil.getConnection(),sql,new BeanHandler<Store>(Store.class),id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(Store info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Store> selectCond(int pageNo, int pageSize, Store info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Store> selectAll() {
		QueryRunner qr = new QueryRunner();
		String sql="SELECT 	STORE_ID storeId, STORE_NAME storeName, DESCRIPTION description FROM store ";
		try {
			return qr.query(DbUtil.getConnection(),sql,new BeanListHandler<Store>(Store.class));
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}
