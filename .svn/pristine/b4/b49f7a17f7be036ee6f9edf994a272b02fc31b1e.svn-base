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

import net.wanho.dao.product.OrdersDetailDaoI;
import net.wanho.po.product.OrdersDetail;
import net.wanho.util.DbUtil;

public class OrdersDetailDaoImpl implements OrdersDetailDaoI {
	private static Logger log = Logger.getLogger(OrdersDetailDaoImpl.class);
	@Override
	public int insert(OrdersDetail ordersDetail) {
		QueryRunner qr = new QueryRunner();
		String sql="INSERT INTO orders_detail (detail_id, order_id, store_id, product_id, buy_nums, real_prices, real_totalprice ) VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			return qr.update(DbUtil.getConnection(), sql, ordersDetail.getDetailId(),ordersDetail.getOrderId(),ordersDetail.getStoreId(),ordersDetail.getProductId(),ordersDetail.getBuyNums(),ordersDetail.getRealPrices(),ordersDetail.getRealTotalPrice());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="DELETE FROM orders_detail WHERE detail_id = ? ";
		try {
			return qr.update(DbUtil.getConnection(), sql, id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(OrdersDetail ordersDetail) {
		QueryRunner qr = new QueryRunner();
		String sql="UPDATE orders_detail SET  ORDER_ID = ? , STORE_ID = ? , PRODUCT_ID = ? , BUY_NUMS = ? , REAL_PRICES = ? , REAL_TOTALPRICE = ? WHERE DETAIL_ID = ? ";
		try {
			return qr.update(DbUtil.getConnection(), sql,ordersDetail.getOrderId(),ordersDetail.getStoreId(),ordersDetail.getProductId(),ordersDetail.getBuyNums(),ordersDetail.getRealPrices(),ordersDetail.getRealTotalPrice(),ordersDetail.getDetailId());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int selectCondCount(OrdersDetail ordersDetail) {
		StringBuffer sb = new StringBuffer("SELECT COUNT(1) DETAIL_COUNT FROM orders_detail WHERE 1=1");
		List<String> ordersDetailList = new ArrayList<>(0);
		
		//detail_id, order_id, store_id, product_id, buy_nums, real_prices, real_totalprice
		
		if (ordersDetail.getDetailId() != null) {
			sb.append("AND detail_id = ").append("? ");
			ordersDetailList.add(ordersDetail.getDetailId().toString());
		}
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
		}

		QueryRunner qr = new QueryRunner();
		try {
			Map<String, Object> map = qr.query(DbUtil.getConnection(), sb.toString(), new MapHandler(),ordersDetailList.toArray());
			log.debug(map.get("DETAIL_COUNT").getClass());
			
			return ((Long) map.get("DETAIL_COUNT")).intValue();
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<OrdersDetail> selectCond(int pageNo, int pageSize, OrdersDetail ordersDetail) {
		StringBuffer sb = new StringBuffer("SELECT 	detail_id detailId, order_id orderId, store_id storeId, product_id productId, buy_nums buyNums, real_prices realPrices, real_totalprice realTotalPrice FROM orders_detail WHERE 1=1 ");
		List<Object> ordersDetailList = new ArrayList<>(0);
		
		//detail_id, order_id, store_id, product_id, buy_nums, real_prices, real_totalprice
		
		if (ordersDetail.getDetailId() != null) {
			sb.append("AND detail_id = ").append("? ");
			ordersDetailList.add(ordersDetail.getDetailId().toString());
		}
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
		}
		sb.append("LIMIT ?,?");
		ordersDetailList.add((pageNo-1)*pageSize);
		ordersDetailList.add(pageSize);
		QueryRunner qr = new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), sb.toString(), new BeanListHandler<OrdersDetail>(OrdersDetail.class),ordersDetailList.toArray());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OrdersDetail selectById(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="SELECT 	detail_id detailId, order_id orderId, store_id storeId, product_id productId, buy_nums buyNums, real_prices realPrices, real_totalprice realTotalPrice FROM orders_detail WHERE detail_id=?";
		try {
			return qr.query(DbUtil.getConnection(),sql,new BeanHandler<OrdersDetail>(OrdersDetail.class),id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}
