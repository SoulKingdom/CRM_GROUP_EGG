package net.wanho.dao.customer;

import static org.junit.Assert.*;

import org.junit.Test;

import net.wanho.dao.customer.impl.BusinessDaoImpl;
import net.wanho.po.customer.Business;

public class BusinessDaoITest {
	private BusinessDaoI businessDao=new BusinessDaoImpl();
	@Test
	public void testInsert() {
		Business business=new Business();
		business.setBusinessId(10);
		business.setBusinessName("打砂机");
		businessDao.insert(business);
	}

	@Test
	public void testDelete() {
		Integer id=10;
		businessDao.delete(id);
	}

	@Test
	public void testUpdate() {
		Business business=new Business();
		business.setBusinessId(10);
		business.setBusinessName("淡饭");
		businessDao.update(business);
	}

	@Test
	public void testSelectById() {
		Integer id=10;
		System.out.println(businessDao.selectById(id));
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
		System.out.println(businessDao.selectAll());
		
	}
}
