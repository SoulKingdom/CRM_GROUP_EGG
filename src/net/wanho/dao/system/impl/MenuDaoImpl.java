package net.wanho.dao.system.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import net.wanho.dao.system.MenuDaoI;
import net.wanho.po.system.Menu;
import net.wanho.util.DbUtil;

public class MenuDaoImpl implements MenuDaoI {

	@Override
	public List<Menu> selectAll() {
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT  MENU_ID menuId,MENU_NAME menuName,MENU_URL menuUrl,PICTURES,STATUS,CREATE_TIME createTime,UPDATE_TIME updateTime,PARENT_MENU_ID parentMenuId FROM menu ";
		try {
			return qr.query(DbUtil.getConnection(), sql, new BeanListHandler<Menu>(Menu.class));
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return null;
	}

}
