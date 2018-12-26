package net.wanho.dao.product.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.log4j.Logger;

import net.wanho.dao.product.ProductDaoI;
import net.wanho.po.product.Product;
import net.wanho.util.DbUtil;

public class ProductDaoImpl implements ProductDaoI {
	private static Logger log = Logger.getLogger(ProductDaoImpl.class);

	@Override
	public int insert(Product product) {
		QueryRunner qr = new QueryRunner();
		String sql="INSERT INTO product (product_id, prod_type, prod_name, prod_standard, cost_price, retail_price, remarks, status, create_time, update_time)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			return qr.update(DbUtil.getConnection(),sql,product.getProductId(),product.getProdType(),product.getProdName(),product.getProdStandard(),product.getCostPrice(),product.getRetailPrice(),product.getRemarks(),product.getStatus(),product.getCreateTime(),product.getUpdateTime());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="DELETE FROM product WHERE product_id = ? ";
		try {
			return qr.update(DbUtil.getConnection(), sql, id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Product product) {
		QueryRunner qr = new QueryRunner();
		String sql="UPDATE product SET  PROD_TYPE = ? , PROD_NAME = ? , PROD_STANDARD = ? , COST_PRICE = ? , RETAIL_PRICE = ? , REMARKS = ? , STATUS = ? , CREATE_TIME = ? , UPDATE_TIME = ? WHERE PRODUCT_ID = ? ";
		try {
			return qr.update(DbUtil.getConnection(),sql,product.getProdType(),product.getProdName(),product.getProdStandard(),product.getCostPrice(),product.getRetailPrice(),product.getRemarks(),product.getStatus(),product.getCreateTime(),product.getUpdateTime(),product.getProductId());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Product selectById(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="SELECT 	product_id productId, prod_type prodType, prod_name prodName, prod_standard prodStandard, cost_price costPrice, retail_price retailPrice, remarks remarks, status status, create_time createTime, update_time updateTime FROM product WHERE product_id=? AND status=1 ";
		try {
			return qr.query(DbUtil.getConnection(),sql,new BeanHandler<Product>(Product.class),id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(Product product) {
		StringBuffer sb = new StringBuffer("SELECT COUNT(1) PRODUCT_COUNT FROM product WHERE 1=1 AND status=1");
		List<String> ordersDetailList = new ArrayList<>(0);
		
		//detail_id, order_id, store_id, product_id, buy_nums, real_prices, real_totalprice
		
		if (product.getProdName() != null) {
			sb.append(" AND prod_name LIKE ? ");
			ordersDetailList.add("%"+product.getProdName()+"%");
		}
		/*if (ordersDetail.getOrderId() != null) {
			sb.append("AND order_id = ").append("? ");
			ordersDetailList.add(ordersDetail.getOrderId().toString());
		}
		if (ordersDetail.getStoreId() != null) {
			sb.append("AND store_id = ").append("? ");
			ordersDetailList.add(ordersDetail.getStoreId().toString());
		}
		if (ordersDetail.getProductId() != null) {
			sb.append("AND product_id = ").append("? ");
			ordersDetailList.add(ordersDetail.getProductId().toString());
		}
		if (ordersDetail.getBuyNums() != null) {
			sb.append("AND buy_nums= ").append("? ");
			ordersDetailList.add(ordersDetail.getBuyNums().toString());
		}
		if (ordersDetail.getRealPrices() != null) {
			sb.append("AND real_prices= ").append("? ");
			ordersDetailList.add(ordersDetail.getRealPrices().toString());
		}
		if (ordersDetail.getRealTotalPrice() != null) {
			sb.append("AND real_totalprice= ").append("? ");
			ordersDetailList.add(ordersDetail.getRealTotalPrice().toString());
		}
*/
		QueryRunner qr = new QueryRunner();
		try {
			Map<String, Object> map = qr.query(DbUtil.getConnection(), sb.toString(), new MapHandler(),ordersDetailList.toArray());
			return ((Long) map.get("PRODUCT_COUNT")).intValue();
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Product> selectCond(int pageNo, int pageSize, Product product) {
		StringBuffer sb = new StringBuffer("SELECT 	product_id productId, prod_type prodType, prod_name prodName, prod_standard prodStandard, cost_price costPrice, retail_price retailPrice, remarks remarks, status status, create_time createTime, update_time updateTime FROM product WHERE 1=1 AND status=1 ");
		List<Object> ordersDetailList = new ArrayList<>(0);
		
		//detail_id, order_id, store_id, product_id, buy_nums, real_prices, real_totalprice

		if (product.getProdName() != null) {
			sb.append(" AND prod_name LIKE ? ");
			ordersDetailList.add("%"+product.getProdName()+"%");
		}
		if (product.getProdType() != null) {
			sb.append("AND prod_type = ").append("? ");
			ordersDetailList.add(product.getProdType());
		}
		/*
		if (ordersDetail.getOrderId() != null) {
			sb.append("AND order_id = ").append("? ");
			ordersDetailList.add(ordersDetail.getOrderId().toString());
		}
		if (ordersDetail.getStoreId() != null) {
			sb.append("AND store_id = ").append("? ");
			ordersDetailList.add(ordersDetail.getStoreId().toString());
		}
		if (ordersDetail.getProductId() != null) {
			sb.append("AND product_id = ").append("? ");
			ordersDetailList.add(ordersDetail.getProductId().toString());
		}
		if (ordersDetail.getBuyNums() != null) {
			sb.append("AND buy_nums= ").append("? ");
			ordersDetailList.add(ordersDetail.getBuyNums().toString());
		}
		if (ordersDetail.getRealPrices() != null) {
			sb.append("AND real_prices= ").append("? ");
			ordersDetailList.add(ordersDetail.getRealPrices().toString());
		}
		if (ordersDetail.getRealTotalPrice() != null) {
			sb.append("AND real_totalprice= ").append("? ");
			ordersDetailList.add(ordersDetail.getRealTotalPrice().toString());
		}*/
		sb.append(" LIMIT ?,?");
		ordersDetailList.add((pageNo-1)*pageSize);
		ordersDetailList.add(pageSize);
		QueryRunner qr = new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), sb.toString(), new BeanListHandler<Product>(Product.class),ordersDetailList.toArray());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> selectProduceByLevel(Integer type) {
		StringBuffer sb = new StringBuffer("SELECT 	PRODUCT_ID, PROD_TYPE, PROD_NAME, PROD_STANDARD, COST_PRICE, RETAIL_PRICE, REMARKS, STATUS, CREATE_TIME, UPDATE_TIME FROM product WHERE PROD_TYPE IN(SELECT TYPE_ID FROM product_type WHERE PARENT_TYPE_ID");
		if(type==null){
			sb.append(" IS NULL");
		}else{
			sb.append("=").append(type).append(")");
		}
		
		QueryRunner qr = new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), sb.toString(), new BeanListHandler<Product>(Product.class));
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete(Integer... id) {
		Object[][] obj = new Object[id.length][1];
		for (int i = 0; i < id.length; i++) {
			obj[i][0] = id[i];
			log.debug(obj[i][0]);
		}
		QueryRunner qr = new QueryRunner();
		String sql="UPDATE product SET   STATUS = 0  WHERE PRODUCT_ID = ? ";
		try {
			qr.batch(DbUtil.getConnection(), sql, obj);
			return id.length;
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

}
