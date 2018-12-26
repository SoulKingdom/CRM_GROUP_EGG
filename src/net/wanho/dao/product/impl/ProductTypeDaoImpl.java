package net.wanho.dao.product.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.log4j.Logger;

import net.wanho.dao.product.ProductTypeDaoI;
import net.wanho.po.product.ProductType;
import net.wanho.util.DbUtil;

public class ProductTypeDaoImpl implements ProductTypeDaoI {
	private static Logger log = Logger.getLogger(ProductTypeDaoImpl.class);

	@Override
	public int insert(ProductType productType) {
		QueryRunner qr = new QueryRunner();
		String sql="INSERT INTO product_type (TYPE_ID, TYPE_NAME, TYPE_DESCRIPTION, PARENT_TYPE_ID)VALUES(?, ?, ?, ?)";
		try {
			return qr.update(DbUtil.getConnection(),sql,productType.getTypeId(),productType.getTypeName(),productType.getTypeDescription(),productType.getParentTypeId());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="DELETE FROM product_type WHERE TYPE_ID = ? ";
		try {
			return qr.update(DbUtil.getConnection(), sql, id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(ProductType productType) {
		QueryRunner qr = new QueryRunner();
		String sql="UPDATE product_type SET  TYPE_NAME = ? , TYPE_DESCRIPTION = ? , PARENT_TYPE_ID = ? WHERE TYPE_ID = ? ";
		try {
			return qr.update(DbUtil.getConnection(),sql,productType.getTypeName(),productType.getTypeDescription(),productType.getParentTypeId(),productType.getTypeId());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ProductType selectById(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="SELECT 	type_id typeId, type_name typeName, type_description typeDescription, parent_type_id parentTypeId FROM product_type WHERE TYPE_ID=?";
		try {
			return qr.query(DbUtil.getConnection(),sql,new BeanHandler<ProductType>(ProductType.class),id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(ProductType info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductType> selectCond(int pageNo, int pageSize, ProductType info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductType> selectAll(int type) {
		QueryRunner qr = new QueryRunner();
		StringBuilder sb=new StringBuilder("SELECT 	type_id typeId , type_name typeName, type_description typeDescription, parent_type_id parentTypeId FROM product_type WHERE 1=1 ");
		List<String> parList = new ArrayList<>(0); 
		//判断产品状态
		if(type==0){
			sb.append(" AND PARENT_TYPE_ID IS NULL");
		}
		if(type>0){
			sb.append(" AND PARENT_TYPE_ID = ?");
			parList.add(String.valueOf(type));
		}
		try {
			return qr.query(DbUtil.getConnection(),sb.toString(),new BeanListHandler<ProductType>(ProductType.class),parList.toArray());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}


}
