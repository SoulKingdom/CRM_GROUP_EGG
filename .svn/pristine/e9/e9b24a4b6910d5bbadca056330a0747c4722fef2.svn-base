package net.wanho.servlet.login;
import java.io.IOException;
import java.lang.reflect.Method;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSONObject;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	
	
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
	
	protected void loginCheck(HttpServletRequest request,HttpServletResponse response){
		JSONObject json = new JSONObject();	       
				json.put("status", "1");
			 
						
				
		try {
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
		
	}
	
	protected void loginToCms(HttpServletRequest request,HttpServletResponse response){
		try {
		/*	System.out.println("toIndex页面");*/
			response.sendRedirect(request.getContextPath()+ "/ControlServlet?method=countAll");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void updatePassword(HttpServletRequest request,HttpServletResponse response){
		JSONObject json = new JSONObject();
			json.put("status", "1");
			json.put("msg", "修改成功");
		try {
			response.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	protected void logout(HttpServletRequest request,HttpServletResponse response){
		try {
			response.sendRedirect(request.getContextPath()+ "/login.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
