package net.wanho.service.system;



import java.util.List;

import net.wanho.po.system.Employee;
import net.wanho.service.baseservice.BaseServicesI;
import net.wanho.vo.customer.LinkManVo;


public interface EmployeeServiceI extends BaseServicesI<Employee, Integer> {
	/**
	 *根据员工id 获取员工对应的值
	 * @param employeeId
	 * @return
	 */
	Employee queryByEmployId(int employeeId);

	/**
	 * 查询所有员工信息
	 * @return 返回所有员工信息
	 */
	List<Employee> queryAll();

}
