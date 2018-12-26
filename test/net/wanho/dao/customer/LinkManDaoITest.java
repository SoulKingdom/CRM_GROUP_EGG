package net.wanho.dao.customer;

import static org.junit.Assert.*;

import org.junit.Test;

import net.wanho.dao.customer.impl.LinkManDaoImpl;
import net.wanho.po.customer.LinkMan;

public class LinkManDaoITest {
	private LinkManDaoI linkManDao=new LinkManDaoImpl();
	@Test
	public void testInsert() {
		LinkMan linkMan=new LinkMan();
		linkMan.setLinkManId(10);
		linkMan.setEmail("16564");
		linkManDao.insert(linkMan);
	}

	@Test
	public void testDelete() {
		Integer id=10;
		linkManDao.delete(id);
	}

	@Test
	public void testUpdate() {
		LinkMan linkMan=new LinkMan();
		linkMan.setLinkManId(10);
		linkMan.setEmail("99999");
		linkManDao.update(linkMan);
	}

	@Test
	public void testSelectById() {
		Integer id=6;
		System.out.println(linkManDao.selectById(id));
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
