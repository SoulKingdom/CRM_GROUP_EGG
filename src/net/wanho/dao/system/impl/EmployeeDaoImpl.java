package net.wanho.dao.system.impl;


import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.log4j.Logger;

import net.wanho.dao.system.EmployeeDaoI;
import net.wanho.po.system.Employee;
import net.wanho.util.DbUtil;
;


public class EmployeeDaoImpl implements EmployeeDaoI {
	private static Logger log = Logger.getLogger(EmployeeDaoImpl.class);
	@Override
	public int insert(Employee info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Employee info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCondCount(Employee info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> selectCond(int pageNo, int pageSize, Employee info) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	@Override
	public Employee selectByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> selectAll() {
		QueryRunner qr = new QueryRunner();
		String sql = "SELECT 	EMPLOYEE_ID employeeId, EMPLOYEE_NAME employeeName, DEPARTMENT_ID departmentId, POSITON_ID positonId, PHONE phone, EMAIL email, STATUS status, PARENT_EMPLOYEE_ID parentEmployeeId, CREATE_TIME createTime, UPDATE_TIME updateTime FROM employee ";
		try {
			return qr.query(DbUtil.getConnection(), sql, new BeanListHandler<Employee>(Employee.class));
		} catch (SQLException e) {
		log.debug(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

}
