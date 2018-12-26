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

import net.wanho.dao.product.ProductTypeDaoI;
import net.wanho.dao.product.impl.ProductTypeDaoImpl;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.product.ProductType;
import net.wanho.service.product.ProductTypeServiceI;
import net.wanho.util.RequestWaper;

/**
 * Servlet implementation class ProdectTypeServlet
 */
@WebServlet("/productType.do")
public class ProdectTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(StoreServlet.class);

	private ProductTypeServiceI productTypeServiceI = (ProductTypeServiceI) ObjectFactory
			.getObject("ProductTypeServiceI");

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

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取所有商品分类 做2级分类
		List<ProductType> productTypeList = productTypeServiceI.queryAllThreeNode();
		request.setAttribute("productTypeList", productTypeList);
		// 转换到界面
		request.getRequestDispatcher("view/productManage/product-category/index.jsp").forward(request, response);
	}

	private void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 删除数据
		log.debug("====================remove================");
		String typeId = request.getParameter("typeId");
		// 删除操作
		if (productTypeServiceI.remove(Integer.parseInt(typeId)) > 0) {
			log.debug("删除成功");
		}

		// 删除后刷新数据
		response.sendRedirect(request.getContextPath() + "/productType.do");
	}

	private void toCreateUl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 转到增加界面
		log.debug("====================toCreateUl================");
		//获取产品类别ID
		String typeId = request.getParameter("typeId");
		String typeName = request.getParameter("typeName");
		//设置参数
		request.setAttribute("typeId", typeId);
		request.setAttribute("typeName", typeName);
		
		log.debug(typeId+":"+typeName);
		request.getRequestDispatcher("view/productManage/product-category/create.jsp").forward(request, response);
	}
	

	private void add(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("============add============");
		ProductType productType = RequestWaper.parseRequest2Bean(request, ProductType.class);
		log.debug(productType);
		ProductTypeDaoI productTypeDaoI = new ProductTypeDaoImpl();
		productTypeDaoI.insert(productType);
		response.sendRedirect(request.getContextPath()+"/productType.do");
	}
}
