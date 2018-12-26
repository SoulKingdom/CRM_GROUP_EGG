package net.wanho.service.system.impl;




import java.util.List;




import org.apache.log4j.Logger;

import net.wanho.dao.system.EmployeeDaoI;
import net.wanho.dao.system.impl.EmployeeDaoImpl;
import net.wanho.po.system.Employee;
import net.wanho.service.system.EmployeeServiceI;


public class EmployeeServiceImpl implements EmployeeServiceI {
	private static Logger log = Logger.getLogger(EmployeeServiceImpl.class);
    private EmployeeDaoI employeeDaoI =new EmployeeDaoImpl();
	@Override
	public int add(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modify(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee queryByEmployId(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDaoI.selectByEmployeeId(employeeId);
	}


	@Override
	public List<Employee> queryAll() {
		return employeeDaoI.selectAll();
	}


}
