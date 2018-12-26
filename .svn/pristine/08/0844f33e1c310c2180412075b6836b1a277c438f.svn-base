package net.wanho.dao.customer;

import static org.junit.Assert.*;

import org.junit.Test;

import net.wanho.dao.customer.impl.BusinessSourceDaoImpl;
import net.wanho.po.customer.BusinessSource;

public class BusinessSourceDaoITest {
	private BusinessSourceDaoI businessSourceDao=new BusinessSourceDaoImpl();
	@Test
	public void testInsert() {
		BusinessSource business=new BusinessSource();
		business.setSourceId(120);
		business.setSourceName("很快就爱上");
		businessSourceDao.insert(business);
	}

	@Test
	public void testDelete() {
		Integer id=120;
		businessSourceDao.delete(id);
	}

	@Test
	public void testUpdate() {
		BusinessSource business=new BusinessSource();
		business.setSourceId(120);
		business.setSourceName("加咖啡速度");
		businessSourceDao.update(business);
	}

	@Test
	public void testSelectById() {
		Integer id=120;
		businessSourceDao.selectById(id);
	}

	@Test
	public void testSelectCondCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectCond() {
		fail("Not yet implemented");
	}

}
