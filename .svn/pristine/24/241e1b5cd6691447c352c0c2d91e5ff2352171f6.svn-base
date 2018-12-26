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

import net.wanho.factory.ObjectFactory;
import net.wanho.po.product.Store;
import net.wanho.service.product.StoreServiceI;
import net.wanho.util.RequestWaper;

/**
 * Servlet implementation class StoreServlet
 */
@WebServlet("/store.do")
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(StoreServlet.class);

	private StoreServiceI storeServiceI = (StoreServiceI) ObjectFactory.getObject("StoreServiceI");

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
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

	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 查询所有信息
		List<Store> storeList = storeServiceI.queryAll();

		request.setAttribute("storeList", storeList);

		request.getRequestDispatcher("view/productManage/product-warehouse/index.jsp").forward(request, response);
	}

	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("===========add==============");
		// 增加商品返回信息
		Store store = RequestWaper.parseRequest2Bean(request, Store.class);
		log.debug(store);
		// 增加商品信息
		if (storeServiceI.add(store) > 0) {
			log.debug("增加成功");
		}
		response.sendRedirect(request.getContextPath() + "/store.do");
	}

	private void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("============remove==================");
		// 通过ajax返回参数形式
		String storeId = request.getParameter("storeId");
		log.debug(storeId);
		// 查询所有信息
		if (storeId != null && !"".equals(storeId)) {
			int i = storeServiceI.remove(Integer.parseInt(storeId));
		}
		List<Store> storeList = storeServiceI.queryAll();
		request.setAttribute("storeList", storeList);
		request.getRequestDispatcher("/WEB-INF/view/ajax/product/deleteCommon.jsp").forward(request, response);
	}

	private void toCreateUl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("============toCreateUl==================");
		response.sendRedirect(request.getContextPath() + "/view/productManage/product-warehouse/create.jsp");
	}

	private void toUpdateUl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("============toUpdateUl==================");
		// 获取对应的仓库信息
		String storeId = request.getParameter("storeId");
		Store store = storeServiceI.queryById(Integer.parseInt(storeId));
		log.debug(store);
		request.setAttribute("store", store);
		request.getRequestDispatcher("view/productManage/product-warehouse/update.jsp").forward(request, response);
		// response.sendRedirect(request.getContextPath()+"/view/productManage/product-warehouse/update.jsp");
	}

	private void modify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("============modify==================");
		// 修改仓库信息
		Store store = RequestWaper.parseRequest2Bean(request, Store.class);
		log.debug(store);
		if (storeServiceI.modify(store) > 0) {
			log.debug("修改成功");
		}
		response.sendRedirect(request.getContextPath() + "/store.do");
	}

}
