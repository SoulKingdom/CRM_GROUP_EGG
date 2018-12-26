package net.wanho.dao.system;

import java.util.List;

import net.wanho.dao.baseDao.BaseDaoI;
import net.wanho.po.system.Employee;

public interface EmployeeDaoI extends BaseDaoI<Employee, Integer> {
	Employee selectByEmployeeId(int employeeId);
	/**
	 * 查询所有员工信息
	 * @return 返回所有员工信息
	 */
	List<Employee> selectAll();
	
}
