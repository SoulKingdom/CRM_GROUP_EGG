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

import com.alibaba.fastjson.JSONObject;

import net.wanho.consts.ConstVal;
import net.wanho.dao.customer.CustomerDaoI;
import net.wanho.dao.customer.impl.CustomerDaoImpl;
import net.wanho.factory.ObjectFactory;
import net.wanho.page.PageBean;
import net.wanho.po.product.Orders;
import net.wanho.po.product.OrdersDetail;
import net.wanho.po.product.Product;
import net.wanho.po.product.Store;
import net.wanho.po.system.Employee;
import net.wanho.service.product.OrdersDetailServicesI;
import net.wanho.service.product.ProductServiceI;
import net.wanho.service.product.SalesServiceI;
import net.wanho.service.product.StoreServiceI;
import net.wanho.service.system.EmployeeServiceI;
import net.wanho.service.system.impl.EmployeeServiceImpl;
import net.wanho.util.IDUtil;
import net.wanho.util.RequestWaper;
import net.wanho.vo.customer.CustomerVo;
import net.wanho.vo.product.OrdersVO;

/**
 * Servlet implementation class SalesServlet
 */
@WebServlet("/sales.do")
public class SalesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(ProdectServlet.class);
	private SalesServiceI salesServiceI = (SalesServiceI) ObjectFactory.getObject("SalesServiceI");
	private CustomerDaoI customerDaoI = new CustomerDaoImpl();
	private ProductServiceI productServiceI = (ProductServiceI) ObjectFactory.getObject("ProductServiceI");
	private StoreServiceI storeServiceI = (StoreServiceI) ObjectFactory.getObject("StoreServiceI");
	private OrdersDetailServicesI ordersDetailServicesI = (OrdersDetailServicesI) ObjectFactory
			.getObject("OrdersDetailServicesI");
	private EmployeeServiceI employeeServiceI = new EmployeeServiceImpl();
	
	// 默认订单状态 和 当前页
	private String orderType = "1";
	private Integer currPage = 1;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("==============list==============");
		String pageNo = request.getParameter("pageNo");
		PageBean<OrdersVO> page = new PageBean<>();
		OrdersVO ordersVO = new OrdersVO();
		//判断查询
		String number = request.getParameter("number");
		String created_by = request.getParameter("created_by");
		String send_date = request.getParameter("send_date");
		// 判断编号
		if (number != null && !"".equals(number)) {
			request.setAttribute("checkedType", "number");
			request.setAttribute("checkedValue", number);
			ordersVO.setOrderSeq(number);
		}
		// 判断制单人
		if (created_by != null && !"".equals(created_by)) {
			request.setAttribute("checkedType", "created_by");
			request.setAttribute("checkedValue", created_by);
			ordersVO.setEmployeeName(created_by);
		}
		if (pageNo != null) {
			log.debug(pageNo+"================");
			currPage = Integer.parseInt(pageNo);
		}
		if(request.getParameter("orderType")!=null && !"".equals(request.getParameter("orderType"))){			
			orderType = request.getParameter("orderType");
		}
		// 设置是否存在条件
		log.debug(currPage);
		page.setpageNo(currPage);
		ordersVO.setOrederType(orderType);
		page.setCond(ordersVO);
		
		page.setPageSize(ConstVal.PAGE_SIZE);
		// 设置订单类型
		// page.setCond(ordersVO);
		// 显示所有页面
		page = salesServiceI.queryAll(page);
		log.debug(page.getPageNo());
		List<OrdersVO> ordersList = page.getPageDatas();
		// 显示所有列表
		request.setAttribute("page", page);
		request.setAttribute("ordersList", ordersList);
		request.getRequestDispatcher("view/productManage/sales/index.jsp").forward(request, response);
	}

	private void toCreateUl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取客户信息
		List<CustomerVo> customerVoList = customerDaoI.selectAll();
		request.setAttribute("customerVoList", customerVoList);
		// 获得商品信息
		PageBean<Product> page = new PageBean<>();
		page.setpageNo(1);
		page.setPageSize(1000);
		page = productServiceI.queryAll(page);
		List<Product> productList = page.getPageDatas();
		request.setAttribute("productList", productList);
		// 获取仓库信息
		List<Store> storeList = storeServiceI.queryAll();
		//获取制单人信息
		List<Employee> employeeList = employeeServiceI.queryAll();
		request.setAttribute("employeeList", employeeList);
		request.setAttribute("storeList", storeList);
		// 转换到界面
		request.getRequestDispatcher("view/productManage/sales/create.jsp").forward(request, response);
	}

	private void toReProductUl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取客户信息
		List<CustomerVo> customerVoList = customerDaoI.selectAll();
		request.setAttribute("customerVoList", customerVoList);
		// 获得商品信息
		PageBean<Product> page = new PageBean<>();
		page.setpageNo(1);
		page.setPageSize(1000);
		page = productServiceI.queryAll(page);
		List<Product> productList = page.getPageDatas();
		request.setAttribute("productList", productList);
		// 获取仓库信息
		List<Store> storeList = storeServiceI.queryAll();
		//获取制单人信息
		List<Employee> employeeList = employeeServiceI.queryAll();
		request.setAttribute("employeeList", employeeList);
		request.setAttribute("storeList", storeList);
		// 转换到界面
		request.getRequestDispatcher("view/productManage/sales/reproduct.jsp").forward(request, response);
	}

	private void display(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("=========display=========");
		String prodId = request.getParameter("prodId");
		Product product = productServiceI.queryById(Integer.parseInt(prodId));
		if (prodId != null && !"".equals(prodId)) {
			JSONObject obj = new JSONObject();
			obj.put("flag", 1);
			obj.put("retailPrice", product.getRetailPrice());
			obj.put("prodStandard", product.getProdStandard());
			obj.put("msg", "查询成功");
			response.getWriter().write(obj.toString());
		}

		/*
		 * String prodId = request.getParameter("prodId"); log.debug(prodId);
		 * Product product =
		 * productServiceI.queryById(Integer.parseInt(prodId)); PrintWriter out
		 * = response.getWriter(); out.print(product.getRetailPrice());
		 */
	}

	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取订单信息
		Orders orders = RequestWaper.parseRequest2Bean(request, Orders.class);
		// 获取id号
		Integer orderId = IDUtil.randId();
		orders.setOrderId(orderId);
		if (salesServiceI.add(orders) > 0) {
			log.debug("订单插入成功");
		}
		// 获取订单详情
		OrdersDetail ordersDetail = RequestWaper.parseRequest2Bean(request, OrdersDetail.class);
		ordersDetail.setOrderId(orderId);
		if (ordersDetailServicesI.add(ordersDetail) > 0) {
			log.debug("订单详情插入成功");
		}
		//获取制单人信息
		
		log.debug(orders);
		log.debug(ordersDetail);
		response.sendRedirect(request.getContextPath() + "/sales.do");
	}

	private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("===========search============");
		PageBean<OrdersVO> page = new PageBean<>();
		OrdersVO ordersVO = new OrdersVO();
		// 获取对应条件
		String number = request.getParameter("number");
		String created_by = request.getParameter("created_by");
		String send_date = request.getParameter("send_date");
		log.debug(number+"===="+created_by+"====="+send_date);
		// 判断编号
		if (number != null && !"".equals(number)) {
			request.setAttribute("checkedType", "number");
			request.setAttribute("checkedValue", number);
			ordersVO.setOrderSeq(number);
		}
		// 判断制单人
		if (created_by != null && !"".equals(created_by)) {
			request.setAttribute("checkedType", "created_by");
			request.setAttribute("checkedValue", created_by);
			ordersVO.setEmployeeName(created_by);
		}

		orderType = request.getParameter("orderType");
		ordersVO.setOrederType(orderType);
		// 设置分页属性
		// PageBean<OrdersVO> page = new PageBean<>();
		page.setpageNo(1);
		page.setPageSize(ConstVal.PAGE_SIZE);
		// 设置订单类型
		page.setCond(ordersVO);
		// 显示所有页面
		page = salesServiceI.queryAll(page);

		List<OrdersVO> ordersList = page.getPageDatas();
		// 显示所有列表
		request.setAttribute("ordersList", ordersList);
		request.getRequestDispatcher("view/productManage/sales/index.jsp").forward(request, response);
	}
}
