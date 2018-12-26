package net.wanho.dao.customer;

import static org.junit.Assert.*;

import org.junit.Test;

import net.wanho.dao.customer.impl.WorkingFieldDaoImpl;
import net.wanho.po.customer.WorkingField;

public class WorkingFieldDaoITest {
	private WorkingFieldDaoI workingFieldDao=new WorkingFieldDaoImpl();
	@Test
	public void testInsert() {
		WorkingField workingField=new WorkingField();
		workingField.setFieldId(153);
		workingField.setFieldName("附近考虑");
		workingFieldDao.insert(workingField);
	}

	@Test
	public void testDelete() {
		Integer id=153;
		workingFieldDao.delete(id);
	}

	@Test
	public void testUpdate() {
		WorkingField workingField=new WorkingField();
		workingField.setFieldId(153);
		workingField.setFieldName("阿斯蒂芬");
		workingFieldDao.update(workingField);
	}

	@Test
	public void testSelectById() {
		Integer id=153;
		System.out.println(workingFieldDao.selectById(id));
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
