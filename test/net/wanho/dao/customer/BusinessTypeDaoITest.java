package net.wanho.dao.customer;

import static org.junit.Assert.*;

import org.junit.Test;

import net.wanho.dao.customer.impl.BusinessTypeDaoImpl;
import net.wanho.po.customer.BusinessType;

public class BusinessTypeDaoITest {
	private BusinessTypeDaoI businessTypeDaoI=new BusinessTypeDaoImpl();
	@Test
	public void testInsert() {
		BusinessType businessType=new BusinessType();
		businessType.setTypeId(203);
		businessType.setTypeName("很快就好的");
		businessTypeDaoI.insert(businessType);
	}

	@Test
	public void testDelete() {
		Integer id=203;
		businessTypeDaoI.delete(id);
	}

	@Test
	public void testUpdate() {
		BusinessType businessType=new BusinessType();
		businessType.setTypeId(203);
		businessType.setTypeName("黄金卡多少");
		businessTypeDaoI.update(businessType);
	}

	@Test
	public void testSelectById() {
		Integer id=203;
		System.out.println(businessTypeDaoI.selectById(id));
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
