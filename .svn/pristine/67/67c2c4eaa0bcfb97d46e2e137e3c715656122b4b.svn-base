package net.wanho.servlet.person;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import net.wanho.dao.customer.CustomerDaoI;
import net.wanho.dao.customer.impl.CustomerDaoImpl;
import net.wanho.po.customer.LinkMan;
import net.wanho.po.person.IndividualTask;
import net.wanho.po.system.Employee;
import net.wanho.service.customer.LinkManServiceI;
import net.wanho.service.customer.LinkManServiceImpl;
import net.wanho.service.person.IndividualTaskVoServiceI;
import net.wanho.service.person.impl.IndividualTaskVoServiceImpl;
import net.wanho.service.system.EmployeeServiceI;
import net.wanho.service.system.impl.EmployeeServiceImpl;
import net.wanho.vo.customer.PrincipalVo;
import net.wanho.vo.person.IndividualTaskVo;

/**
 * Servlet implementation class TaskServlet
 */
@WebServlet("/task.do")
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// private IndividualTaskVoServiceI
	// individualTaskVoService=(IndividualTaskVoServiceI)
	// ObjectFactory.getObject("IndividualTaskVoServiceI");
	// private EmployeeServiceI employeeService=(EmployeeServiceI)
	// ObjectFactory.getObject("EmployeeServiceI");
	private IndividualTaskVoServiceI individualTaskVoService = new IndividualTaskVoServiceImpl();
	private EmployeeServiceI employeeService = new EmployeeServiceImpl();
	private CustomerDaoI customerDaoI = new CustomerDaoImpl();
	private LinkManServiceI linkManServiceI = new LinkManServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String methodName = request.getParameter("method");
		System.out.println("=======================>" + methodName);
		if (methodName == null || "".equals(methodName)) {
			methodName = "list";
		}
		try {
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);
			method.setAccessible(true);
			method.invoke(this, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TaskServlet========================>");
		List<IndividualTaskVo> individualTaskVoList = individualTaskVoService.queryAll();
		request.setAttribute("individualTaskVoList", individualTaskVoList);
		request.setAttribute("individualTaskVoListSize", individualTaskVoList.size());
		for (IndividualTaskVo individualTaskVo : individualTaskVoList) {
			System.out.println(individualTaskVo);
		}
		request.getRequestDispatcher("view/personalOffice/task/index.jsp").forward(request, response);
	}

	@SuppressWarnings("unused")
	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String taskId = request.getParameter("taskId");
		String status = request.getParameter("status");
		System.out.println("taskId=======================>" + taskId);
		System.out.println("status=======================>" + status);
		IndividualTask individual = new IndividualTask();
		int task = Integer.parseInt(taskId);
		individual.setTaskId(task);
		individual.setStatus(status);
		if (individualTaskVoService.modify(individual) > 0) {

			response.sendRedirect(request.getContextPath() + "/task.do？method=list");
		}
	}

	private void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String taskId = request.getParameter("taskId");
		System.out.println("taskId=======remove=========>" + taskId);
		if (individualTaskVoService.remove(taskId) > 0) {
			response.sendRedirect(request.getContextPath() + "/task.do？method=list");

		}

	}

	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String status = request.getParameter("status");
		System.out.println("==========query==========>" + status);
		List<IndividualTaskVo> individualTaskVoList = individualTaskVoService.queryByStatus(status);

		request.setAttribute("individualTaskVoList", individualTaskVoList);
		request.setAttribute("individualTaskVoListSize", individualTaskVoList.size());
		request.getRequestDispatcher("view/personalOffice/task/index.jsp").forward(request, response);

	}

	private void queryByIdentity(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("0----0>");
		String identity = request.getParameter("identity");
		Cookie[] cookies = request.getCookies();
		String cookieName = "employeeId";
		String employeeId = null;
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals(cookieName)) {
				employeeId = cookie.getValue();
				break;
			}
		}
		Employee employee = employeeService.queryByEmployId(Integer.parseInt(employeeId));
		System.out.println("---------->" + employee.getEmployeeName());
		String name = employee.getEmployeeName();
		List<IndividualTaskVo> individualTaskVoList = individualTaskVoService.queryByIdentity(identity, name);
		for (IndividualTaskVo individualTaskVo : individualTaskVoList) {
			System.out.println(individualTaskVo);
		}
		request.setAttribute("individualTaskVoList", individualTaskVoList);
		request.setAttribute("individualTaskVoListSize", individualTaskVoList.size());
		request.getRequestDispatcher("view/personalOffice/task/index.jsp").forward(request, response);
	}

	private void queryById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String taskId = request.getParameter("taskId");
		System.out.println("======taskId========>" + taskId);
		IndividualTaskVo individualTaskVo = individualTaskVoService.queryById(Integer.parseInt(taskId));
		System.out.println(individualTaskVo);
		request.setAttribute("individualTaskVo", individualTaskVo);
		request.getRequestDispatcher("view/personalOffice/task/view.jsp").forward(request, response);

	}

	private void toCreateUl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("==========toCreateUl==============");
		List<PrincipalVo> principalVoList = customerDaoI.selectAllPrincipal();
		System.out.println(principalVoList);
		request.setAttribute("principalVoList", principalVoList);
		for (PrincipalVo principalVo : principalVoList) {
			System.out.println(principalVo);
		}

		List<LinkMan> linkManList = linkManServiceI.selectAll();
		request.setAttribute("linkManList", linkManList);
		System.out.println(linkManList);
		for (LinkMan linkMan : linkManList) {
			System.out.println(linkMan);
		}

		request.getRequestDispatcher("view/personalOffice/task/create.jsp").forward(request, response);
	}

	private void addTask(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("===========addTask==============");
		
		String topic=request.getParameter("topic");
		String responsiblePerson=request.getParameter("responsiblePerson");
		String employeeName=request.getParameter("employeeName");
		String endTime=request.getParameter("endTime");
		String priority=request.getParameter("priority");
		String status=request.getParameter("status");
		
		IndividualTaskVo indicidualTask = new IndividualTaskVo();
		indicidualTask.setTopic(topic);
		indicidualTask.setResponsiblePerson(Integer.parseInt(responsiblePerson));
		indicidualTask.setEmployeeName(employeeName);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			indicidualTask.setEndTime(sdf.parse(endTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		indicidualTask.setPriority(priority);
		indicidualTask.setStatus(status);
		int r=individualTaskVoService.insert(indicidualTask);
		if(r>0){
			JSONObject obj = new JSONObject();
			obj.put("flag", 1);
			obj.put("msg", "添加成功");
			response.getWriter().write(obj.toString());
		}
		
		list(request, response);
/*		request.getRequestDispatcher("view/personalOffice/task/index.jsp").forward(request, response);*/
		// request.getRequestDispatcher("view/personalOffice/task/create.jsp").forward(request,
		// response);
	}
}
