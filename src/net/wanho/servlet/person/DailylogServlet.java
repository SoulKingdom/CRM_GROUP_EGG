package net.wanho.servlet.person;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.wanho.dao.customer.CustomerDaoI;
import net.wanho.dao.customer.impl.CustomerDaoImpl;
import net.wanho.dao.person.DailyLogDaoI;
import net.wanho.dao.person.impl.DailyLogDaoImpl;
import net.wanho.service.customer.LinkManServiceI;
import net.wanho.service.customer.LinkManServiceImpl;
import net.wanho.service.person.DailyLogVoServiceI;
import net.wanho.service.person.impl.DailyLogServiceImpl;
import net.wanho.vo.customer.PrincipalVo;
import net.wanho.vo.person.DailyLogVo;

/**
 * Servlet implementation class dailylogServlet
 */
@WebServlet("/dailylog.do")
public class DailylogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   // private DailyLogVoServiceI dailyLogService=(DailyLogVoServiceI) ObjectFactory.getObject("DailyLogVoServiceI");
	 private DailyLogVoServiceI dailyLogService=new DailyLogServiceImpl();
	 private LinkManServiceI linkManServiceI = new LinkManServiceImpl();
	 
	 private CustomerDaoI customerDaoI = new CustomerDaoImpl();
	 DailyLogDaoI dailyLogDaoI = new DailyLogDaoImpl();
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String methodName = request.getParameter("method");
		if (methodName == null || "".equals(methodName)) {
			methodName = "list";
		}
		try {
			Method method = getClass().getDeclaredMethod(methodName,
					HttpServletRequest.class, HttpServletResponse.class);
			method.setAccessible(true);
			method.invoke(this, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  List<DailyLogVo> dailyLogVoList=dailyLogService.queryAll();
	  for (DailyLogVo dailyLogVo : dailyLogVoList) {
		System.out.println(dailyLogVo);
		if(dailyLogVo.getCount()==null)
			dailyLogVo.setCount(0);
	}
	  request.setAttribute("dailyLogVoList", dailyLogVoList);
	  request.setAttribute("dailyLogVoListSize", dailyLogVoList.size());
	   request.getRequestDispatcher("view/personalOffice/dailylog/index.jsp").forward(request,response);
	}
	
	private void toCreateUl(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("==========toCreateUl==============");
		List<PrincipalVo> principalVoList = customerDaoI.selectAllPrincipal();
		System.out.println(principalVoList);
		request.setAttribute("principalVoList", principalVoList);
		for (PrincipalVo principalVo : principalVoList) {
			System.out.println(principalVo);
		}

	

		request.getRequestDispatcher("view/personalOffice/dailylog/create.jsp").forward(request, response);
	}
	
	
	protected void queryByDate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("=========queryByDate==========>");
	String serach_status=request.getParameter("search_status");
	System.out.println("=========earch_status==========>"+serach_status);
	 List<DailyLogVo> dailyLogVoList=dailyLogService.queryByDate(serach_status);
	 request.setAttribute("dailyLogVoList", dailyLogVoList);
	  request.setAttribute("dailyLogVoListSize", dailyLogVoList.size());
	   request.getRequestDispatcher("view/personalOffice/dailylog/index.jsp").forward(request,response);
	}
	
	private void queryById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
       String recordId = request.getParameter("recordId");
  	   List<DailyLogVo> dailyLogVoList=dailyLogService.queryById(Integer.parseInt(recordId));
       System.out.println(dailyLogVoList);
       request.setAttribute("dailyLogVoList", dailyLogVoList);
       request.setAttribute("dailyLogVoListSize", dailyLogVoList.size());
	   request.getRequestDispatcher("view/personalOffice/dailylog/view.jsp").forward(request,response);

	}
	private void queryBylike(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("__________-------------------------------------");
		String field = request.getParameter("field");
		System.out.println(field);
		List<DailyLogVo> dailyLogVoList=dailyLogService.queryLikeAll(field);
		  for (DailyLogVo dailyLogVo : dailyLogVoList) {
			System.out.println(dailyLogVo);
			if(dailyLogVo.getCount()==null)
				dailyLogVo.setCount(0);
		  }
		  request.setAttribute("dailyLogVoList", dailyLogVoList);
		  request.setAttribute("dailyLogVoListSize", dailyLogVoList.size());
		   request.getRequestDispatcher("view/personalOffice/dailylog/index.jsp").forward(request,response);
	}
	
	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("Dailylog[subject]");
		String content = request.getParameter("content");
		DailyLogVo dailyLogVo = new DailyLogVo();
		dailyLogVo.setTitle(title);
		dailyLogVo.setContent(content);	
		dailyLogVo.setCreateTime(new Date());
		System.out.println(dailyLogVo);
		dailyLogDaoI.insert(dailyLogVo);
		list(request, response);
	}
}
