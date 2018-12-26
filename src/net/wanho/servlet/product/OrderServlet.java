package net.wanho.servlet.product;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import net.wanho.consts.ConstVal;
import net.wanho.factory.ObjectFactory;
import net.wanho.page.PageBean;
import net.wanho.service.product.SalesServiceI;
import net.wanho.vo.product.OrdersVO;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/order.do")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(OrderServlet.class);
	private String orderStatus;
	
	private SalesServiceI salesServiceI = (SalesServiceI) ObjectFactory.getObject("SalesServiceI");
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String method = request.getParameter("method");
		log.debug(method);
		if (method == null || "".equals(method)) {
			method = "list";
		}
		Method reMethod = null;
		try {
			reMethod = this.getClass().getDeclaredMethod(method, HttpServletRequest.class, HttpServletResponse.class);
			reMethod.invoke(this, request, response);
		} catch (Exception e) {
			log.debug(e.getMessage());
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("============list=================");
		OrdersVO ordersVO  = new OrdersVO();
		//设置出入库属性 3 已出库  2等待出库  1已入库 0等待入库
		orderStatus = request.getParameter("orderStatus");
		//判断出入库状态
		if(orderStatus !=null && !"".equals(orderStatus)){
			log.debug(orderStatus+"==========");
			ordersVO.setStatus(orderStatus);
		}
		// 设置分页属性
		PageBean<OrdersVO> page = new PageBean<>();
		page.setpageNo(1);
		page.setPageSize(1000);
		//设置订单类型
		page.setCond(ordersVO);
		// 显示所有页面
		page = salesServiceI.queryAll(page);
		
		List<OrdersVO> ordersList = page.getPageDatas();
		// 显示所有列表
		request.setAttribute("ordersList", ordersList);
		request.getRequestDispatcher("view/productManage/stock/index.jsp").forward(request, response);
	}
	
	private void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("============remove=================");
		//获取要删除的id
		String orderId = request.getParameter("orderId");
		String[] orderIdList = orderId.split(",");
		Integer[] orderIds = new Integer[orderIdList.length];
		//删除类型转换
		for (int i = 0; i < orderIdList.length; i++) {
			orderIds[i] = Integer.parseInt(orderIdList[i]);
		}
		//删除操作
		if(salesServiceI.remove(orderIds)>0){
			log.debug("批量删除成功");
		}
		//刷新界面
		response.sendRedirect(request.getContextPath()+"/sales.do");
	}
}
