package net.wanho.servlet.systemMgr;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;

import net.wanho.dao.system.MenuDaoI;
import net.wanho.dao.system.impl.MenuDaoImpl;
import net.wanho.exception.ServiceException;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.system.Menu;

@WebServlet("/MenuServlet")
public class MenuServlet extends HttpServlet {
	private MenuDaoI menuDaoI=new MenuDaoImpl();
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String methodName = request.getParameter("method");
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
	
	protected void getAllMenu(HttpServletRequest request,HttpServletResponse response){
		try {
			List<Menu> menuList=menuDaoI.selectAll();
			request.setAttribute("menuList", menuList);
			request.getRequestDispatcher("/WEB-INF/view/systemSettings/menu/index.jsp").forward(request,response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void  getAllParentMenu(HttpServletRequest request,HttpServletResponse response){
			try {
				request.getRequestDispatcher("/WEB-INF/view/systemSettings/menu/create.jsp").forward(request,response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	
	protected void addMenu(HttpServletRequest request,HttpServletResponse response){
			try {
				response.sendRedirect(request.getContextPath()+ "/MenuServlet?method=getAllMenu");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	protected void deleteMenuById(HttpServletRequest request,HttpServletResponse response){
		try {
			response.sendRedirect(request.getContextPath()+ "/MenuServlet?method=getAllMenu");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	protected void getUpdateMenudetailById(HttpServletRequest request,HttpServletResponse response){
		try {
			request.getRequestDispatcher("/WEB-INF/view/systemSettings/menu/update.jsp").forward(request,response);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
	
	protected void updateMenu(HttpServletRequest request,HttpServletResponse response){
		try {
			response.sendRedirect(request.getContextPath()+ "/MenuServlet?method=getAllMenu");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
