package com.wanho.java115.testL.basedao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.apache.log4j.Logger;
import org.junit.Test;

import net.wanho.dao.baseDao.BaseDaoI;
import net.wanho.dao.product.ProductDaoI;
import net.wanho.dao.product.impl.OrdersDaoImpl;
import net.wanho.dao.product.impl.OrdersDetailDaoImpl;
import net.wanho.dao.product.impl.ProcessDaoImpl;
import net.wanho.dao.product.impl.ProductInventoryDaoImpl;
import net.wanho.dao.product.impl.ProductTypeDaoImpl;
import net.wanho.dao.product.impl.StoreDaoImpl;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.product.Orders;
import net.wanho.po.product.OrdersDetail;
import net.wanho.po.product.ProcessInfo;
import net.wanho.po.product.Product;
import net.wanho.po.product.ProductInventory;
import net.wanho.po.product.ProductType;
import net.wanho.po.product.Store;

public class BaseDaoITest {
	private static final Logger log = Logger.getLogger(BaseDaoITest.class);
	BaseDaoI<OrdersDetail, Integer> ordersDetailDaoI = new OrdersDetailDaoImpl();
	BaseDaoI<Orders, Integer> ordersDaoI = new OrdersDaoImpl();
//	BaseDaoI<Product, Integer> productDaoI = new ProductDaoImpl();
	ProductDaoI productDaoI = (ProductDaoI)ObjectFactory.getObject("ProductDaoI");
	BaseDaoI<ProductType, Integer> productTypeDaoI = new ProductTypeDaoImpl();
	BaseDaoI<Store, Integer> storeDaoI = new StoreDaoImpl();
	BaseDaoI<ProductInventory, Integer> productInventoryDaoI = new ProductInventoryDaoImpl();
	BaseDaoI<ProcessInfo, Integer> processDaoI = new ProcessDaoImpl();

	@Test
	public void testInsert() {
		// 订单详情
		/*
		 * OrdersDetail ordersDetail = new OrdersDetail();
		 * ordersDetail.setDetailId(19); ordersDetail.setBuyNums(2);
		 * assertThat(ordersDetailDaoI.insert(ordersDetail), is(1));
		 */

		// 订单信息
		// Orders orders = new Orders();
		// orders.setOrderId(30);;
		// orders.setTitle("001");
		// assertThat(ordersDaoI.insert(orders), is(1));

		// 产品信息
		
		  Product product = new Product(); product.setProductId(30);
		  product.setProdName("产品1"); log.debug(product);
		  assertThat(productDaoI.insert(product), is(1));
		 
		// 产品状态信息
		/*
		 * ProductType productType = new ProductType();
		 * productType.setTypeId(1); productType.setTypeName("兄弟");
		 * log.debug(productType);
		 * assertThat(productTypeDaoI.insert(productType), is(1));
		 */
		// 仓库信息
		/*
		 * Store store = new Store(); store.setStoreId(9);
		 * store.setStoreName("浩鑫超市"); storeDaoI.insert(store);
		 */
		// 产品库存
		
	/*	  ProductInventory productInventory = new ProductInventory();
		  productInventory.setInventoryId(15);
		  productInventory.setInventory(10);
		  productInventoryDaoI.insert(productInventory);
		 */
		// 流程更新
		// processDaoI
		/*ProcessInfo processInfo = new ProcessInfo();
		processInfo.setProcessId(10);
		processInfo.setOpinions("4");
		assertThat(processDaoI.insert(processInfo), is(1));
*/
	}

	@Test
	public void testDelete() {
		// 订单详情
		// assertThat(ordersDetailDaoI.delete(19), is(1));
		// 订单信息
		// assertThat(ordersDaoI.delete(30), is(1));
		// 产品信息
		// assertThat(productDaoI.delete(30), is(1));
		// 产品状态信息
		// assertThat(productTypeDaoI.delete(1), is(1));
		// 仓库信息
		// assertThat(storeDaoI.delete(9), is(1));
		// 产品库存
		// productInventoryDaoI.delete(15);
		// 流程操作
		processDaoI.delete(10);
	}

	@Test
	public void testUpdate() {
		// 订单详情
		// OrdersDetail ordersDetail = new OrdersDetail();
		// ordersDetail.setDetailId(19);
		// ordersDetail.setBuyNums(3);
		// ordersDetail.setRealTotalPrice(new BigDecimal(3));
		// assertThat(ordersDetailDaoI.update(ordersDetail), is(1));

		// 订单信息
		// Orders orders = new Orders();
		// orders.setOrderId(30);
		// orders.setTitle("002");
		// assertThat(ordersDaoI.update(orders), is(1));

		// 产品信息
		 Product product = new Product();
		 product.setProductId(30);
		 product.setProdName("产品2");
		 assertThat(productDaoI.update(product), is(1));
		// 产品状态信息
		// ProductType productType = new ProductType();
		// productType.setTypeId(1);
		// productType.setTypeName("兄弟2");
		// log.debug(productType);
		// assertThat(productTypeDaoI.update(productType), is(1));
		// 仓库信息
		// Store store = new Store();
		// store.setStoreId(9);
		// store.setStoreName("浩鑫大超市");
		// storeDaoI.update(store);
		// 库存
		/*
		 * ProductInventory productInventory = new ProductInventory();
		 * productInventory.setInventoryId(15);
		 * productInventory.setInventory(15);
		 * productInventoryDaoI.update(productInventory);
		 */

		/*ProcessInfo processInfo = new ProcessInfo();
		processInfo.setProcessId(10);
		processInfo.setOpinions("5");
		assertThat(processDaoI.update(processInfo), is(1));*/
	}

	@Test
	public void testSelectById() {
		// 订单详情
		// OrdersDetail ordersDetail =ordersDetailDaoI.selectById(1);
		// log.debug(ordersDetail);

		// 订单信息
		// Orders orders = ordersDaoI.selectById(30);
		// log.debug(orders);
		// 产品信息
		// Product product = productDaoI.selectById(30);
		// log.debug(product);
		// 产品状态信息
		// ProductType productType = productTypeDaoI.selectById(1);
		// log.debug(productType);
		// 仓库信息
		/*
		 * Store store = storeDaoI.selectById(9); log.debug(store);
		 */
		// 库存信息
		/*
		 * ProductInventory productInventory =
		 * productInventoryDaoI.selectById(15); log.debug(productInventory);
		 */
		//流程信息
		ProcessInfo processInfo =  processDaoI.selectById(10);
		log.debug(processInfo);
	}

	@Test
	public void testSelectCondCount() {
		// 订单详情
		// int sum = ordersDetailDaoI.selectCondCount(new OrdersDetail());

		// 订单信息
		// int sum = ordersDaoI.selectCondCount(new Orders());
		// 产品信息
		int sum = productDaoI.selectCondCount(new Product());
		log.debug(sum);
	}

	@Test
	public void testSelectCond() {
		/*
		 * List<OrdersDetail> ordersDetailList = ordersDetailDaoI.selectCond(1,
		 * 5, new OrdersDetail()); for (OrdersDetail ordersDetail :
		 * ordersDetailList) { log.debug(ordersDetail); }
		 */

		// List<Orders> ordersList = ordersDaoI.selectCond(1, 5, new Orders());

		/*
		 * List<Product> productList = productDaoI.selectCond(1, 5, new
		 * Product()); for (Product product : productList) { log.debug(product);
		 * 
		 * }
		 */
		// List<Process> processList =
	}

}
