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
import net.wanho.service.product.ProductInventoryServiceI;
import net.wanho.service.product.StoreServiceI;
import net.wanho.vo.product.ProductInventoryVO;

/**
 * Servlet implementation class StockDetail
 */
@WebServlet("/stockDetail.do")
public class StockDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(StockDetailServlet.class);
	
	//查询条件
	ProductInventoryVO productInventoryVO = new ProductInventoryVO();
	
	private ProductInventoryServiceI productInventoryServiceI = (ProductInventoryServiceI) ObjectFactory
			.getObject("ProductInventoryServiceI");
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

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("=========list==========");
		//获取条件
		String storeId = request.getParameter("storeId");
		String proName = request.getParameter("proName");
		log.debug(proName);
		//判断获取条件
		if(proName != null && !"".equals(proName)){
			log.debug("======cond=====");
			productInventoryVO.setProdName(proName);			
		}
		if(storeId != null && !"".equals(storeId)){
			log.debug("======cond=====");
			log.debug(storeId);
			productInventoryVO.setStoreId(Integer.parseInt(storeId));
		}
		log.debug(storeId == null || "".equals(storeId));
		//如果条件都没有
		if((proName == null || "".equals(proName))&&(storeId == null || "".equals(storeId))){
			log.debug("=======init======");
			productInventoryVO = new ProductInventoryVO();
		}
		// 查询所有仓库信息
		List<Store> storeList = storeServiceI.queryAll();
		request.setAttribute("storeList", storeList);
		// 查询所有数据
		List<ProductInventoryVO> productInventoryVOList = productInventoryServiceI.queryAll(productInventoryVO);
		request.setAttribute("productInventoryVOList", productInventoryVOList);
		// 传递数据
		request.getRequestDispatcher("view/productManage/stock-detail/index.jsp").forward(request, response);
	}

	/*private void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("=========search==========");
		log.debug("===============" + request.getParameter("proName"));
		// 获取查询条件
		productInventoryVO.setProdName(request.getParameter("proName"));
		// 查询所有数据
		List<ProductInventoryVO> productInventoryVOList = productInventoryServiceI.queryAll(productInventoryVO);
		request.setAttribute("productInventoryVOList", productInventoryVOList);
		// 传递数据
		request.getRequestDispatcher("view/productManage/stock-detail/index.jsp").forward(request, response);
	}*/

}
