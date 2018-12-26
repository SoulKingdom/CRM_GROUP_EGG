package net.wanho.servlet.customer;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSONObject;

import net.wanho.dao.customer.LinkManDaoI;
import net.wanho.dao.customer.impl.LinkManDaoImpl;
import net.wanho.exception.ServiceException;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.customer.LinkMan;

@WebServlet("/LinkManServlet")
public class LinkManServlet extends HttpServlet {
	private LinkManDaoI linkManDaoI = new LinkManDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String methodName = request.getParameter("method");
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

	/*
	 * 新增
	 */
	protected void addLinkMan(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String customerId=request.getParameter("customerId");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String nickName = request.getParameter("nickname");
		String position = request.getParameter("position");
		String phoneNum = request.getParameter("phonenum");
		String email = request.getParameter("email");
		String qq = request.getParameter("qq");
		String remarks = request.getParameter("remarks");
		String linkManId=request.getParameter("linkMainId");
		LinkMan linkMan = new LinkMan();
		linkMan.setCustomerId(Integer.parseInt(customerId));
		linkMan.setName(name);
		linkMan.setNickName(nickName);
		linkMan.setSex(sex);
		linkMan.setPosition(position);
		linkMan.setPhoneNum(Integer.parseInt(phoneNum));
		linkMan.setEmail(email);
		linkMan.setQQ(qq);
		linkMan.setRemarks(remarks);
		linkMan.setLinkManId(Integer.parseInt(linkManId));
	    int r=linkManDaoI.insert(linkMan);
		if (r > 0) {
			JSONObject obj = new JSONObject();
			obj.put("flag", 1);
			obj.put("msg", "添加成功");
			response.getWriter().write(obj.toString());
		}

	}

	/*
	 * 查询
	 */
	protected void getAllLinkMan(HttpServletRequest request, HttpServletResponse response) {
		try {
			List<LinkMan> linkList = linkManDaoI.selectAll();
			request.setAttribute("linkList", linkList);
			request.getRequestDispatcher("/WEB-INF/view/customerManage/contacts/index.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 查看
	 */
	protected void selectByPrimaryKey(HttpServletRequest request, HttpServletResponse response) {
		try {
			String id = request.getParameter("type");
			if (!"1".equals(id) && id != "1") {
				String linkManId = request.getParameter("linkManId");
				LinkMan linkMan = new LinkMan();
				linkMan = linkManDaoI.selectById(Integer.parseInt(linkManId));
				request.setAttribute("linkMan", linkMan);
				request.getRequestDispatcher("/WEB-INF/view/customerManage/contacts/update.jsp").forward(request,
						response);
				return;
			} else {
				String linkManId = request.getParameter("linkManId");
				System.out.println(linkManId);
				LinkMan linkMan = new LinkMan();
				linkMan = linkManDaoI.selectById(Integer.parseInt(linkManId));
				request.setAttribute("linkMan", linkMan);
				request.getRequestDispatcher("/WEB-INF/view/customerManage/contacts/view.jsp").forward(request,
						response);

			}
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 修改
	 */
	protected void updateLinkMan(HttpServletRequest request, HttpServletResponse response) {
		try {
			String linkManId = request.getParameter("linkManId");
			LinkMan linkMan = new LinkMan();
			linkMan = linkManDaoI.selectById(Integer.parseInt(linkManId));
			System.out.println(linkMan);
			request.setAttribute("linkMan", linkMan);
			System.out.println("==========");
			String name = request.getParameter("name");
			String sex = request.getParameter("sex");
			String nickName = request.getParameter("nickname");
			String position = request.getParameter("position");
			String phoneNum = request.getParameter("phonenum");
			String email = request.getParameter("email");
			String QQ = request.getParameter("qq");
			String remarks = request.getParameter("remarks");
			LinkMan linkMan2 = new LinkMan();
			linkMan2.setName(name);
			linkMan2.setSex(sex);
			linkMan2.setNickName(nickName);
			linkMan2.setPhoneNum(Integer.parseInt(phoneNum));
			linkMan2.setPosition(position);
			linkMan2.setEmail(email);
			linkMan2.setQQ(QQ);
			linkMan2.setRemarks(remarks);
			linkMan2.setLinkManId(Integer.parseInt(linkManId));
			linkMan2.setUpdateTime(new Date());
			System.out.println(linkMan2);
			int r=linkManDaoI.update(linkMan2);
			if (r > 0) {
				JSONObject obj = new JSONObject();
				obj.put("flag", 1);
				obj.put("msg", "修改成功");
				response.getWriter().write(obj.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 删除
	 */
	protected void deleteLinkMan(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect(request.getContextPath() + "/LinkManServlet?method=getAllLinkMan");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	/*
	 * 搜索
	 */
	protected void getOneLinkMan(HttpServletRequest request, HttpServletResponse response) {
		try {
			String mobile=request.getParameter("mobile");
			String email=request.getParameter("email");
			LinkMan linkMan=new LinkMan();
			List<LinkMan> linkList = new ArrayList<>();
			Integer phoneNum=0;
			if((mobile!=null&&!(mobile.equals("")))/*||(email!=null&&email!=""&&email!="undefined")*/){
				phoneNum=Integer.parseInt(mobile);
			}
			linkMan=linkManDaoI.selectcondition(phoneNum, email);
			System.out.println(linkMan);
			linkList.add(linkMan);
			request.setAttribute("linkList", linkList);
			request.getRequestDispatcher("/WEB-INF/view/customerManage/contacts/index.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 查询列表
	 */
	protected void getAllCustomer(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("/WEB-INF/view/customerManage/contacts/create.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
