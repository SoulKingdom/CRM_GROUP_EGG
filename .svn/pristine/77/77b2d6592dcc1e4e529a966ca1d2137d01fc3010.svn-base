package net.wanho.servlet.person;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import net.wanho.factory.ObjectFactory;
import net.wanho.service.person.InstationMailVoServiceI;
import net.wanho.service.person.impl.InstationMailVoServiceImpl;
import net.wanho.vo.person.InstationMailVo;

/**
 * Servlet implementation class MailServlet
 */
@WebServlet("/mail.do")
public class MailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private InstationMailVoServiceI instationMailVoService= new InstationMailVoServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String methodName = request.getParameter("method");
		//private InstationMailVoServiceI instationMailVoService=(InstationMailVoServiceI) ObjectFactory.getObject("InstationMailVoServiceI");
		System.out.println("============123===========>"+methodName);
		try {
			Method method = getClass().getDeclaredMethod(methodName,HttpServletRequest.class, HttpServletResponse.class);
			method.setAccessible(true);
			method.invoke(this, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     System.out.println("==============mail===========>");
	     List<InstationMailVo> instationMailVoList=instationMailVoService.queryAll();
	     for (InstationMailVo instationMailVo : instationMailVoList) {
			System.out.println(instationMailVo);
		}
	     request.setAttribute("instationMailVoList", instationMailVoList);
	     request.setAttribute("instationMailVoListSize", instationMailVoList.size());
		 request.getRequestDispatcher("view/personalOffice/mail/index.jsp").forward(request,response);
		}
	private void listtttt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     System.out.println("==============mail===========>");
	     List<InstationMailVo> instationMailVoList=instationMailVoService.queryllAll();
	     for (InstationMailVo instationMailVo : instationMailVoList) {
			System.out.println(instationMailVo);
		}
	     request.setAttribute("instationMailVoList", instationMailVoList);
	     request.setAttribute("instationMailVoListSize", instationMailVoList.size());
		 request.getRequestDispatcher("view/personalOffice/mail/index.jsp").forward(request,response);
		}
	
	
	
	private void querystatus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String status = request.getParameter("status");
		List<InstationMailVo> instationMailVoList=instationMailVoService.queryStatusAll(status);
		System.out.println("------------------------------------------------");
		for (InstationMailVo instationMailVo : instationMailVoList) {
			System.out.println(instationMailVo);
		}
		request.setAttribute("instationMailVoList", instationMailVoList);
	     request.setAttribute("instationMailVoListSize", instationMailVoList.size());
		 request.getRequestDispatcher("view/personalOffice/mail/index.jsp").forward(request,response);
	}
	private void queryLike(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String k = request.getParameter("k");
		System.out.println(k);
		List<InstationMailVo> instationMailVoList=instationMailVoService.queryLike(k);
		System.out.println("------------------------------------------------");
		for (InstationMailVo instationMailVo : instationMailVoList) {
			System.out.println(instationMailVo);
		}
		request.setAttribute("instationMailVoList", instationMailVoList);
	     request.setAttribute("instationMailVoListSize", instationMailVoList.size());
		 request.getRequestDispatcher("view/personalOffice/mail/index.jsp").forward(request,response);
	}
	
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      String delMailId=request.getParameter("mailId");
	      String[] delMailIdAy=delMailId.split(",");
    	  System.out.println("===========delMailIdAy================?>");
	    for (String delMail : delMailIdAy){
			
	       System.out.println("===========delMailIdAy================?>"+delMail);
		   instationMailVoService.remove(delMail);
	      }
		   response.sendRedirect(request.getContextPath()+"/mail.do？method=list");

	}
	
	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   System.out.println("======query=================>");
	   String mailId=request.getParameter("mailId");
	   System.out.println("======query=================>"+mailId);
	   InstationMailVo instationMailVo=instationMailVoService.queryByMailId(mailId);
	   System.out.println("==================>"+instationMailVo);
	   request.setAttribute("instationMailVo", instationMailVo);
	   request.getRequestDispatcher("view/personalOffice/mail/view.jsp").forward(request,response);
	}
	
	
	private void updateByStatus(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String status=request.getParameter("status");
	   String updateMailId=request.getParameter("mailId");
	   String[] updateMailIdAy=updateMailId.split(",");
 	   System.out.println("===========delMailIdAy================?>");
	   for (String updateMail : updateMailIdAy) {
	       System.out.println("===========update=mail===============?>"+updateMail);
		instationMailVoService.modify(updateMail,status);
	}
	   response.sendRedirect(request.getContextPath()+"/mail.do？method=list");

	}
	private void addmail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("______________________________________________");
		
		String mailId = request.getParameter("Mailsend");
		String theme = request.getParameter("Mail[subject]");
		String content = request.getParameter("content");
		System.out.println(mailId);
		System.out.println(theme);
		System.out.println(content);
		InstationMailVo instationMailVo = new InstationMailVo();
		instationMailVo.setReceiverId(Integer.parseInt(mailId));
		instationMailVo.setTheme(theme);
		instationMailVo.setContent(content);
		int r = instationMailVoService.insert(instationMailVo);
	
		if(r>0){
			JSONObject obj = new JSONObject();
			obj.put("flag", 1);
			obj.put("msg", "添加成功");
			response.getWriter().write(obj.toString());
		}
		  response.sendRedirect(request.getContextPath()+"/mail.do？method=list");
	}
}
