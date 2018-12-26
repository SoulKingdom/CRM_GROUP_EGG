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
import net.wanho.po.product.Product;
import net.wanho.po.product.ProductType;
import net.wanho.service.product.ProductServiceI;
import net.wanho.service.product.ProductTypeServiceI;
import net.wanho.util.RequestWaper;

/**
 * Servlet implementation class ProdectServlet
 */
@WebServlet("/product.do")
public class ProdectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(ProdectServlet.class);

	private ProductServiceI productServiceI = (ProductServiceI) ObjectFactory.getObject("ProductServiceI");
	private ProductTypeServiceI productTypeServiceI = (ProductTypeServiceI) ObjectFactory
			.getObject("ProductTypeServiceI");

	private Integer currPage = 1;
	/** 查询条件 */
	PageBean<Product> page = new PageBean<>();
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
		// 设置分页属性
//		PageBean<Product> page = new PageBean<>();
		// 获取当前页
		String pageNo = request.getParameter("pageNo");
		if (pageNo != null) {
			currPage = Integer.parseInt(pageNo);
		}
		page.setpageNo(currPage);
		page.setPageSize(ConstVal.PAGE_SIZE);
		// 显示所有页面
		page = productServiceI.queryAll(page);
		log.debug(page.getTotalPages());
		List<Product> productList = page.getPageDatas();
		// 显示所有状态列表
		List<ProductType> productTypeList = productTypeServiceI.queryAll(0);
		request.setAttribute("page", page);
		request.setAttribute("productList", productList);
		request.setAttribute("productTypeList", productTypeList);
		request.getRequestDispatcher("view/productManage/product/index.jsp").forward(request, response);
	}

	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取表信息
		Product product = RequestWaper.parseRequest2Bean(request, Product.class);
		product.setStatus("1");
		// 信息插入
		ProductServiceI productServiceI = (ProductServiceI) ObjectFactory.getObject("ProductServiceI");
		if (productServiceI.add(product) > 0) {
			log.debug("增加成功");
		}
		// 返回index界面
		response.sendRedirect(request.getContextPath() + "/product.do");

	}

	private void modify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("===========modify==========");
		// 获取修改的产品信息
		Product product = RequestWaper.parseRequest2Bean(request, Product.class);
		// 通过修改产品信息
		log.debug(product);
		if (productServiceI.modify(product) > 0) {
			log.debug("产品修改成功");
		} else {
			log.debug("修改失败");
		}
		// 跳转到主页面
		response.sendRedirect(request.getContextPath() + "/product.do");

	}

	private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("===========search==========");
		// 获取表信息
		Product product = RequestWaper.parseRequest2Bean(request, Product.class);
		// 设置分页属性
		// PageBean<Product> page = new PageBean<>();
		page.setpageNo(1);
		page.setPageSize(ConstVal.PAGE_SIZE);
		page.setCond(product);
		// 查询商品信息
		page = productServiceI.queryAll(page);
		// 获取查询商品
		List<Product> productList = page.getPageDatas();
		List<ProductType> productTypeList = productTypeServiceI.queryAll(0);

		request.setAttribute("productList", productList);
		request.setAttribute("productTypeList", productTypeList);

		request.getRequestDispatcher("view/productManage/product/index.jsp").forward(request, response);
	}

	private void toCreateUl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<ProductType> productTypeList = productTypeServiceI.queryAll(-1);
		request.setAttribute("productTypeList", productTypeList);
		request.getRequestDispatcher("view/productManage/product/create.jsp").forward(request, response);
	}

	private void queryOne(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("===========queryOnce==========");
		// 获取对应id的信息
		String id = request.getParameter("id");
		log.debug(id);
		// 通过id查找数据
		Product product = productServiceI.queryById(Integer.parseInt(id));
		// 获取产品状态列表
		List<ProductType> productTypeList = productTypeServiceI.queryAll(-1);
		request.setAttribute("productTypeList", productTypeList);
		request.setAttribute("product", product);
		log.debug(product);
		request.getRequestDispatcher("view/productManage/product/update.jsp?productId=" + id).forward(request,
				response);
	}

	private void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		log.debug("===========remove==========");

		// 获取信息
		String prodsId = request.getParameter("prodId");
		String[] prodIdList = prodsId.split(",");
		Integer[] prodIds = new Integer[prodIdList.length];
		for (int i = 0; i < prodIdList.length; i++) {
			prodIds[i] = Integer.parseInt(prodIdList[i]);
		}
		// 批量删除信息
		productServiceI.remove(prodIds);
		// 设置分页属性
		PageBean<Product> page = new PageBean<>();
		// 获取当前页
		String pageNo = request.getParameter("pageNo");
		if (pageNo != null) {
			currPage = Integer.parseInt(pageNo);
		}
		page.setpageNo(currPage);
		page.setPageSize(ConstVal.PAGE_SIZE);
		// 显示所有页面
		page = productServiceI.queryAll(page);
		List<Product> productList = page.getPageDatas();
		// 显示所有状态列表
		List<ProductType> productTypeList = productTypeServiceI.queryAll(0);
		request.setAttribute("page", page);
		request.setAttribute("productList", productList);
		request.setAttribute("productTypeList", productTypeList);
		request.getRequestDispatcher("WEB-INF/view/ajax/product/deleteProduct.jsp").forward(request, response);
		;
	}

	private void sort(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取查询界面

		// 回到当前页
		currPage = 1;
		// 设置分页属性
		PageBean<Product> page = new PageBean<>();
		// 获取当前页
		String pageNo = request.getParameter("pageNo");
		// 获取条件
		Product cond = new Product();
		String prodType = request.getParameter("typeId");
		cond.setProdType(Integer.parseInt(prodType));
		page.setCond(cond);
		if (pageNo != null) {
			currPage = Integer.parseInt(pageNo);
		}
		page.setpageNo(currPage);
		page.setPageSize(ConstVal.PAGE_SIZE);
		// 显示所有页面
		page = productServiceI.queryAll(page);
		List<Product> productList = page.getPageDatas();
		// 显示所有状态列表
		List<ProductType> productTypeList = productTypeServiceI.queryAll(0);
		request.setAttribute("page", page);
		request.setAttribute("productList", productList);
		request.setAttribute("productTypeList", productTypeList);
		request.getRequestDispatcher("view/productManage/product/index.jsp").forward(request, response);
	}
}
