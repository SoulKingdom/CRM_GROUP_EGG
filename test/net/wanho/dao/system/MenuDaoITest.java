package net.wanho.dao.system;

import static org.junit.Assert.*;

import org.junit.Test;

import net.wanho.dao.system.impl.MenuDaoImpl;

public class MenuDaoITest {
	private MenuDaoI menuDaoI=new MenuDaoImpl();
	@Test
	public void testSelectAll() {
		System.out.println(menuDaoI.selectAll());
	}

}
