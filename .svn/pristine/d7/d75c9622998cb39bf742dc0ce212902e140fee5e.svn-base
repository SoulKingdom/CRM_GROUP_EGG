package net.wanho.dao.customer;

import static org.junit.Assert.*;

import org.junit.Test;

import net.wanho.dao.customer.impl.CustomerDaoImpl;
import net.wanho.po.customer.Customer;
import net.wanho.vo.customer.CustomerVo;

public class CustomerDaoITest {
	private CustomerDaoI customerDao=new CustomerDaoImpl();
	@Test
	public void testInsert() {
		Customer customer=new Customer();
		customer.setCustomerId(8);
		customer.setCustomerName("交换机");
		customer.setPostCode("132465");
		customerDao.insert(customer);
	}

	@Test
	public void testDelete() {
		Integer id=8;
		customerDao.delete(id);
	}

	@Test
	public void testUpdate() {
		Customer customer=new Customer();
		customer.setCustomerId(8);
		customer.setCustomerName("好看撒地");
		customer.setPostCode("56513");
		customerDao.update(customer);
	}

	@Test
	public void testSelectByKey() {
		Integer id=4;
		System.out.println(customerDao.selectByKey(id));
	}

	@Test
	public void testSelectCondCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCond() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSelectAll() {
		System.out.println(customerDao.selectAll());
		
	}
	
	@Test
	public void selectAllPrincipal(){
		System.out.println(customerDao.selectAllPrincipal());
	}

}
