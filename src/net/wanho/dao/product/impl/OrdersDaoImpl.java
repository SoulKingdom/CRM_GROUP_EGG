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

import net.wanho.dao.product.OrdersDaoI;
import net.wanho.po.product.Orders;
import net.wanho.util.DbUtil;
import net.wanho.vo.product.OrdersVO;

public class OrdersDaoImpl implements OrdersDaoI {
	private static Logger log = Logger.getLogger(OrdersDaoImpl.class);

	@Override
	public int insert(Orders orders) {
		QueryRunner qr = new QueryRunner();
		String sql="INSERT INTO orders (order_id, order_seq, title, customer_id, total_money, status, operator, order_time, create_time, order_type)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			/*Connection conn = qr.getDataSource().getConnection() ;
			PreparedStatement pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS) ;*/
			return qr.update(DbUtil.getConnection(), sql, orders.getOrderId(),orders.getOrderSeq(),orders.getTitle(),orders.getCustomerId(),orders.getTotalMoney(),orders.getStatus(),orders.getOperator(),orders.getOrderTime(),orders.getCreateTime(),orders.getOrederType());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="DELETE FROM orders WHERE ORDER_ID = ? ";
		try {
			return qr.update(DbUtil.getConnection(), sql, id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Orders orders) {
		QueryRunner qr = new QueryRunner();
		String sql="UPDATE orders SET  ORDER_SEQ = ? , TITLE = ? , CUSTOMER_ID = ? , TOTAL_MONEY = ? , STATUS = ? , OPERATOR = ? , ORDER_TIME = ? , CREATE_TIME = ? , ORDER_TYPE = ? WHERE ORDER_ID = ? ";
		try {
			return qr.update(DbUtil.getConnection(), sql,orders.getOrderSeq(),orders.getTitle(),orders.getCustomerId(),orders.getTotalMoney(),orders.getStatus(),orders.getOperator(),orders.getOrderTime(),orders.getCreateTime(),orders.getOrederType(),orders.getOrderId());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int selectCondCount(Orders orders) {
		StringBuffer sb = new StringBuffer("SELECT COUNT(1) ORDERS_COUNT FROM orders WHERE 1=1");
		List<String> ordersDetailList = new ArrayList<>(0);
		
		//detail_id, order_id, store_id, product_id, buy_nums, real_prices, real_totalprice
		
		/*if (ordersDetail.getDetailId() != null) {
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
*/
		QueryRunner qr = new QueryRunner();
		try {
			Map<String, Object> map = qr.query(DbUtil.getConnection(), sb.toString(), new MapHandler(),ordersDetailList.toArray());
			return ((Long) map.get("ORDERS_COUNT")).intValue();
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Orders> selectCond(int pageNo, int pageSize, Orders orders) {
		StringBuffer sb = new StringBuffer("SELECT 	o1.order_id orderId, o1.order_seq orderSeq, o1.title title, o1.customer_id customerId, o1.total_money totalMoney, o1.status STATUS, o1.operator operator, o1.order_time orderTime, o1.create_time createTime, o1.order_type orederType FROM orders o1  WHERE 1=1");
		List<Object> ordersDetailList = new ArrayList<>(0);
		
		//detail_id, order_id, store_id, product_id, buy_nums, real_prices, real_totalprice
		
		
		if (orders.getOrederType()!= null) {
			sb.append(" AND o1.order_type = ").append("? ");
			ordersDetailList.add(orders.getOrederType());
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
			return qr.query(DbUtil.getConnection(), sb.toString(), new BeanListHandler<Orders>(Orders.class),ordersDetailList.toArray());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Orders selectById(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="SELECT 	order_id orderId, order_seq orderSeq, title title, customer_id customerId, total_money totalMoney, status status, operator operator, order_time orderTime, create_time createTime, order_type orederType FROM orders WHERE order_id=?";
		try {
			return qr.query(DbUtil.getConnection(),sql,new BeanHandler<Orders>(Orders.class),id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<OrdersVO> selectCond(int pageNo, int pageSize, OrdersVO ordersVO) {
		StringBuffer sb = new StringBuffer("SELECT 	o1.order_id orderId, o1.order_seq orderSeq, o1.title title, o1.customer_id customerId, o1.total_money totalMoney, o1.status STATUS, o1.operator operator, o1.order_time orderTime, o1.create_time createTime, o1.order_type orederType,c1.customer_name customerName ,e1.employee_name employeeName FROM orders o1 LEFT JOIN customer c1 ON c1.customer_id=o1.customer_id LEFT JOIN employee e1 ON e1.employee_id=o1.operator WHERE 1=1 AND o1.order_type!=0 ");
		List<Object> ordersDetailList = new ArrayList<>(0);
		
		//detail_id, order_id, store_id, product_id, buy_nums, real_prices, real_totalprice
		if(ordersVO.getOrderSeq()!=null){
			sb.append(" AND o1.order_seq LIKE ").append("? ");
			ordersDetailList.add("%"+ordersVO.getOrderSeq()+"%");
		}
		if(ordersVO.getEmployeeName()!=null){
			sb.append(" AND e1.employee_name LIKE ").append("? ");
			ordersDetailList.add("%"+ordersVO.getEmployeeName()+"%");
		}
		if (ordersVO.getOrederType()!= null) {
			sb.append(" AND o1.order_type = ").append("? ");
			ordersDetailList.add(ordersVO.getOrederType());
		}
		if (ordersVO.getStatus()!= null) {
			sb.append(" AND o1.status = ").append("? ");
			ordersDetailList.add(ordersVO.getStatus());
		}
		/*
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
			return qr.query(DbUtil.getConnection(), sb.toString(), new BeanListHandler<OrdersVO>(OrdersVO.class),ordersDetailList.toArray());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(OrdersVO info) {
		StringBuffer sb = new StringBuffer("SELECT COUNT(1) ORDERS_COUNT FROM orders o1 WHERE 1=1 AND o1.order_type!=0 ");
		List<String> ordersDetailList = new ArrayList<>(0);
		
		QueryRunner qr = new QueryRunner();
		try {
			Map<String, Object> map = qr.query(DbUtil.getConnection(), sb.toString(), new MapHandler(),ordersDetailList.toArray());
			return ((Long) map.get("ORDERS_COUNT")).intValue();
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer... id) {
		Object[][] obj = new Object[id.length][1];
		for (int i = 0; i < id.length; i++) {
			obj[i][0] = id[i];
			log.debug(obj[i][0]);
		}
		QueryRunner qr = new QueryRunner();
		String sql="UPDATE orders SET ORDER_TYPE = '0' WHERE ORDER_ID = ? ";
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
