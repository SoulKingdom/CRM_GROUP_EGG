package net.wanho.servlet.customer;

import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import net.wanho.dao.customer.BusinessDaoI;
import net.wanho.dao.customer.BusinessSourceDaoI;
import net.wanho.dao.customer.BusinessTypeDaoI;
import net.wanho.dao.customer.CustomerDaoI;
import net.wanho.dao.customer.LinkManDaoI;
import net.wanho.dao.customer.impl.BusinessDaoImpl;
import net.wanho.dao.customer.impl.BusinessSourceDaoImpl;
import net.wanho.dao.customer.impl.BusinessTypeDaoImpl;
import net.wanho.dao.customer.impl.CustomerDaoImpl;
import net.wanho.dao.customer.impl.LinkManDaoImpl;
import net.wanho.po.customer.Business;
import net.wanho.po.customer.BusinessSource;
import net.wanho.po.customer.BusinessType;
import net.wanho.po.customer.LinkMan;
import net.wanho.vo.customer.BusinessVo;
import net.wanho.vo.customer.CustomerVo;
import net.wanho.vo.customer.PrincipalVo;
@WebServlet("/BuinessServlet")
public class BuinessServlet extends HttpServlet {
	private BusinessDaoI businessDaoI=new BusinessDaoImpl();
	private CustomerDaoI customerDaoI=new CustomerDaoImpl();
	private LinkManDaoI linkManDaoI=new LinkManDaoImpl();
	private BusinessSourceDaoI businessSourceDaoI=new BusinessSourceDaoImpl();
	private BusinessTypeDaoI businessTypeDaoI=new BusinessTypeDaoImpl();
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
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
	
	/*
	 * 新增
	 */
	protected void addBusiness(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
			String employeeId=request.getParameter("employeeId");
			String customerId=request.getParameter("customerId");
			String linkMainId=request.getParameter("linkMainId");
			String businessName=request.getParameter("businessName");
			String businessTypeId=request.getParameter("businessTypeId");
			String status=request.getParameter("status");
			String businessSourceId=request.getParameter("businessSourceId");
			String persalePrice=request.getParameter("persalePrice");
			String probability=request.getParameter("probability");
			String visitContent=request.getParameter("visitContent");
			String visitTime=request.getParameter("visitTime");
			Business business=new Business();
			business.setEmployeeId(Integer.parseInt(employeeId));
			business.setCustomerId(Integer.parseInt(customerId));
			business.setLinkMainId(Integer.parseInt(linkMainId));
			business.setBusinessName(businessName);
			business.setBusinessTypeId(Integer.parseInt(businessTypeId));
			business.setStatus(status);
			business.setBusinessSourceId(Integer.parseInt(businessSourceId));
			business.setPersalePrice(new BigDecimal(persalePrice));
			business.setProbability(new BigDecimal(probability));
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				business.setVisitTime(sdf.parse(visitTime));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			business.setVisitContent(visitContent);
			int r=businessDaoI.insert(business);
			if(r>0){
				JSONObject obj = new JSONObject();
				obj.put("flag", 1);
				obj.put("msg", "添加成功");
				response.getWriter().write(obj.toString());
			}
	}
	/*
	 * 查询
	 */
	protected void getAllBusiness(HttpServletRequest request,HttpServletResponse response) {

		try {
			List<BusinessVo> businessList=businessDaoI.selectAll();
			System.out.println(businessList);
			request.setAttribute("businessList", businessList);	
			
			request.getRequestDispatcher("/WEB-INF/view/customerManage/business/index.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 查看
	 */
	protected void selectByPrimaryKey(HttpServletRequest request,HttpServletResponse response) {
		try {
			String id = request.getParameter("type");
			if (!"1".equals(id) && id != "1") {
				String businessId=request.getParameter("businessId");
				System.out.println(businessId);
				BusinessVo businessVo;
				businessVo=businessDaoI.selectByKey(Integer.parseInt(businessId));
				System.out.println(businessVo);
				request.setAttribute("businessVo", businessVo);
				
				
				List<PrincipalVo> principalVoList=customerDaoI.selectAllPrincipal();
				System.out.println(principalVoList);
				request.setAttribute("principalVoList", principalVoList);
				List<CustomerVo> customerVoList=customerDaoI.selectAll();
				request.setAttribute("customerVoList", customerVoList);
				List<LinkMan> linkManList=linkManDaoI.selectAll();
				request.setAttribute("linkManList", linkManList);
				List<BusinessType> businessTypeList=businessTypeDaoI.selectAll();
				System.out.println(businessTypeList);
				request.setAttribute("businessTypeList", businessTypeList);
				List<BusinessSource> businessSourceList=businessSourceDaoI.selectAll();
				request.setAttribute("businessSourceList", businessSourceList);
				request.getRequestDispatcher("/WEB-INF/view/customerManage/business/update.jsp").forward(request, response);
				return;
			} else {
				String businessId=request.getParameter("businessId");
				System.out.println(businessId);
				BusinessVo businessVo;
				businessVo=businessDaoI.selectByKey(Integer.parseInt(businessId));
				request.setAttribute("businessVo", businessVo);
				request.getRequestDispatcher("/WEB-INF/view/customerManage/business/view.jsp").forward(request, response);

			}
			
			
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 查询联系人
	 */
	protected void getAllLinkMan(HttpServletRequest request,HttpServletResponse response) {

		try {
			List<PrincipalVo> principalVoList=customerDaoI.selectAllPrincipal();
			System.out.println(principalVoList);
			request.setAttribute("principalVoList", principalVoList);
			List<CustomerVo> customerVoList=customerDaoI.selectAll();
			request.setAttribute("customerVoList", customerVoList);
			List<LinkMan> linkManList=linkManDaoI.selectAll();
			request.setAttribute("linkManList", linkManList);
			List<BusinessType> businessTypeList=businessTypeDaoI.selectAll();
			System.out.println(businessTypeList);
			request.setAttribute("businessTypeList", businessTypeList);
			List<BusinessSource> businessSourceList=businessSourceDaoI.selectAll();
			request.setAttribute("businessSourceList", businessSourceList);
			
			List<BusinessVo> businessList=businessDaoI.selectAll();
			System.out.println(businessList);
			request.setAttribute("businessList", businessList);	
			request.getRequestDispatcher("/WEB-INF/view/customerManage/business/create.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 修改
	 */
	protected void updateBuiness(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("=========updateBuiness=========");
		String businessId=request.getParameter("businessId");
		System.out.println(businessId);
		String customerId=request.getParameter("customerId");
		String linkMainId=request.getParameter("linkMainId");
		String businessName=request.getParameter("businessTypeId");
		String businessTypeId=request.getParameter("businessTypeId");
		String status=request.getParameter("status");
		String businessSourceId=request.getParameter("businessSourceId");
		String persalePrice=request.getParameter("persalePrice");
		String probability=request.getParameter("probability");
		String visitContent=request.getParameter("visitContent");
		String visitTime=request.getParameter("visitTime");
		Business business=new Business();
		business.setCustomerId(Integer.parseInt(customerId));
		business.setLinkMainId(Integer.parseInt(linkMainId));
		business.setBusinessName(businessName);
		business.setBusinessTypeId(Integer.parseInt(businessTypeId));
		business.setStatus(status);
		business.setBusinessSourceId(Integer.parseInt(businessSourceId));
		business.setPersalePrice(new BigDecimal(persalePrice));
		business.setProbability(new BigDecimal(probability));
		business.setVisitContent(visitContent);
		business.setBusinessId(Integer.parseInt(businessId));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			business.setVisitTime(sdf.parse(visitTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(business);
		int r=businessDaoI.update(business);
		JSONObject obj=new JSONObject();
		if(r>0){
			System.out.println("修改成功");
		 obj.put("flag", 1);
		 obj.put("msg", "修改成功");
		 response.getWriter().write(obj.toString());
		}
	}
	
	/*
	 * 搜索
	 */
	protected void getSomeBuiness(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("=========getSomeBuiness==========");
		try {
			String type=request.getParameter("type");
			System.out.println(type);
			List<BusinessVo> businessList=new ArrayList<>();
			if("6".equals(type)||"7".equals(type)){
					String text=request.getParameter("text");
					String textTime=request.getParameter("textTime");
					businessList=businessDaoI.selectconditionTime(text, textTime, type);
					request.setAttribute("businessList", businessList);
			}else{
					String text=request.getParameter("text");
					businessList=businessDaoI.selectcondition(text, type);
					request.setAttribute("businessList", businessList);
				
			}
			request.getRequestDispatcher("/WEB-INF/view/customerManage/business/index.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
