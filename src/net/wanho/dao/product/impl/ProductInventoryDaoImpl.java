package net.wanho.dao.product.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.log4j.Logger;

import net.wanho.dao.product.ProductInventoryDaoI;
import net.wanho.po.product.OrdersDetail;
import net.wanho.po.product.ProductInventory;
import net.wanho.util.DbUtil;
import net.wanho.vo.product.ProductInventoryVO;

public class ProductInventoryDaoImpl implements ProductInventoryDaoI {
	private static Logger log = Logger.getLogger(ProductInventoryDaoImpl.class);
	@Override
	public int insert(ProductInventory productInventory) {
		QueryRunner qr = new QueryRunner();
		String sql="INSERT INTO product_inventory (inventory_id, product_id, store_id, inventory, update_time)VALUES(?, ?, ?, ?, ?);";
		try {
			return qr.update(DbUtil.getConnection(), sql, productInventory.getInventoryId(),productInventory.getProductId(),productInventory.getStoreId(),productInventory.getInventory(),productInventory.getUpdateTime());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="DELETE FROM product_inventory WHERE inventory_id = ? ;";
		try {
			return qr.update(DbUtil.getConnection(), sql, id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(ProductInventory productInventory) {
		QueryRunner qr = new QueryRunner();
		String sql="UPDATE product_inventory  SET  PRODUCT_ID = ? , STORE_ID = ? , INVENTORY = ? , UPDATE_TIME = ? WHERE INVENTORY_ID = ? ";
		try {
			return qr.update(DbUtil.getConnection(), sql,productInventory.getProductId(),productInventory.getStoreId(),productInventory.getInventory(),productInventory.getUpdateTime(),productInventory.getInventoryId());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ProductInventory selectById(Integer id) {
		QueryRunner qr = new QueryRunner();
		String sql="SELECT 	inventory_id inventoryId , product_id productId, store_id storeId, inventory inventory, update_time updateTime FROM product_inventory WHERE inventory_id=?";
		try {
			return qr.query(DbUtil.getConnection(),sql,new BeanHandler<ProductInventory>(ProductInventory.class),id);
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(ProductInventory productInventory) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductInventory> selectCond(int pageNo, int pageSize, ProductInventory info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductInventoryVO> queryAll(ProductInventoryVO cond) {
		QueryRunner qr = new QueryRunner();
		List<String> varList = new ArrayList<>(0);
		StringBuilder sb = new StringBuilder("SELECT proIn.INVENTORY_ID inventoryId , proIn.PRODUCT_ID productId, proIn.STORE_ID storeId, proIn.INVENTORY inventory, proIn.UPDATE_TIME updateTime,pro.PROD_STANDARD prodStandard,sto.STORE_NAME storeName,pro.PROD_NAME prodName FROM product_inventory proIn LEFT JOIN product pro ON pro.PRODUCT_ID= proIn.PRODUCT_ID LEFT JOIN store sto ON sto.STORE_ID=proIn.STORE_ID WHERE 1=1 ");
		if(cond.getProdName()!=null && !"".equals(cond.getProdName())){
			sb.append("AND pro.PROD_NAME LIKE ? ");
			varList.add("%"+cond.getProdName()+"%");
		}
		if(cond.getStoreId()!=null && !"".equals(cond.getStoreId())){
			sb.append("AND proIn.STORE_ID = ?");
			varList.add(cond.getStoreId().toString());
		}
		
		log.debug(sb.toString());
		log.debug(varList.toArray());
		//String sql="SELECT 	proIn.INVENTORY_ID inventoryId , proIn.PRODUCT_ID productId, proIn.STORE_ID storeId, proIn.INVENTORY inventory, proIn.UPDATE_TIME updateTime,pro.PROD_STANDARD prodStandard,sto.STORE_NAME storeName,pro.PROD_NAME prodName FROM product_inventory proIn LEFT JOIN product pro ON pro.PRODUCT_ID= proIn.PRODUCT_ID LEFT JOIN store sto ON sto.STORE_ID=proIn.STORE_ID";
		try {
			return qr.query(DbUtil.getConnection(), sb.toString(),new BeanListHandler<ProductInventoryVO>(ProductInventoryVO.class),varList.toArray());
		} catch (SQLException e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	
}
