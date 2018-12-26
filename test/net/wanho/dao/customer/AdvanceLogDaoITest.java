package net.wanho.dao.customer;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import net.wanho.dao.customer.impl.AdvanceLogDaoImpl;
import net.wanho.po.customer.AdvanceLog;

public class AdvanceLogDaoITest {
	private AdvanceLogDaoI advanceLogDaoI=new AdvanceLogDaoImpl();
	@Test
	public void testInsert() {
		AdvanceLog advanceLog=new AdvanceLog();
		advanceLog.setLogId(1);
		advanceLog.setBusinessId(6);
		advanceLog.setCreator(12);
		advanceLog.setAdvanceContent("喝咖啡");
		advanceLog.setCreateTime(new Date());
		advanceLog.setAdvanceStatus("0");
		advanceLogDaoI.insert(advanceLog);
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
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
	public void testSelectById() {
		fail("Not yet implemented");
	}
}
