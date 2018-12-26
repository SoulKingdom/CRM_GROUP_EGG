package net.wanho.servlet.customer;

import java.io.IOException;
import java.lang.reflect.Method;
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
import com.github.pagehelper.PageInfo;

import net.wanho.dao.customer.CustomerDaoI;
import net.wanho.dao.customer.WorkingFieldDaoI;
import net.wanho.dao.customer.impl.CustomerDaoImpl;
import net.wanho.dao.customer.impl.WorkingFieldDaoImpl;
import net.wanho.factory.ObjectFactory;
import net.wanho.po.customer.Customer;
import net.wanho.po.customer.LinkMan;
import net.wanho.po.customer.WorkingField;
import net.wanho.vo.customer.BusinessVo;
import net.wanho.vo.customer.CustomerVo;
import net.wanho.vo.customer.PrincipalVo;

@WebServlet("/CustomerServlet")
public class CustomerServlet  extends HttpServlet{
	private CustomerDaoI customerDaoI=new CustomerDaoImpl();
	private WorkingFieldDaoI workingFieldDaoI=new WorkingFieldDaoImpl();
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
	protected void addCustomer(HttpServletRequest request,HttpServletResponse response) throws IOException {
			String prinpical=request.getParameter("linkManId");
			String customerName=request.getParameter("CUSTOMERNAME");
			String postCode=request.getParameter("POST_CODE");
			String fieldId=request.getParameter("FIELD_ID");
			String sourceId=request.getParameter("SOURCE_ID");
			String busubessVolume=request.getParameter("BUSUBESS_VOLUME");
			String employeeNumbers=request.getParameter("EMPLOYEE_NUMBERS");
			String tag=request.getParameter("TAG");
			String remarks=request.getParameter("REMARKS");
			Customer customer=new Customer();
			customer.setPrinpical(Integer.parseInt(prinpical));
			customer.setCustomerName(customerName);
			customer.setPostCode(postCode);
			customer.setFieldId(Integer.parseInt(fieldId));
			customer.setSourceId(Integer.parseInt(sourceId));
			customer.setBusubessVolume(busubessVolume);
			customer.setEmployeeNumbers(employeeNumbers);
			customer.setTag(tag);
			customer.setRemarks(remarks);
			int r=customerDaoI.insert(customer);
			if(r>0){
				JSONObject obj = new JSONObject();
				obj.put("flag", 1);
				obj.put("msg", "添加成功");
				response.getWriter().write(obj.toString());
			}
	}
	
	/*
	 * 查询列表
	 */
	protected void getAllCustomer(HttpServletRequest request,HttpServletResponse response) {
		try {
			List<CustomerVo> customerList =customerDaoI.selectAll();
			System.out.println(customerList);
			request.setAttribute("customerList", customerList);
    		request.getRequestDispatcher("/WEB-INF/view/customerManage/customer/index.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 查询列表
	 */
	protected void getAllZd(HttpServletRequest request,HttpServletResponse response) {
		try {
			List<PrincipalVo> principalVoList=customerDaoI.selectAllPrincipal();
			System.out.println(principalVoList);
			request.setAttribute("principalVoList", principalVoList);
			
			List<WorkingField> workingField=workingFieldDaoI.selectAll();
			request.setAttribute("workingField",workingField);
			
			
    		request.getRequestDispatcher("/WEB-INF/view/customerManage/customer/create.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 单个数据查询
	 */
	protected void selectByPrimaryKey(HttpServletRequest request,HttpServletResponse response) {
		
			try {
				String customerId=request.getParameter("customerId");
				String type =request.getParameter("type") ;
				CustomerVo customerVo;
				customerVo=customerDaoI.selectByKey(Integer.parseInt(customerId));
				System.out.println(customerVo);
				request.setAttribute("customerVo", customerVo);
				if("1".equals(type)){
					List<PrincipalVo> principalVoList=customerDaoI.selectAllPrincipal();
					request.setAttribute("principalVoList", principalVoList);
					
					List<WorkingField> workingField=workingFieldDaoI.selectAll();
					request.setAttribute("workingField",workingField);
					request.getRequestDispatcher("/WEB-INF/view/customerManage/customer/update.jsp").forward(request,response);
					return ;
				}
				request.getRequestDispatcher("/WEB-INF/view/customerManage/customer/view.jsp").forward(request,response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	/*
	 * 修改
	 */
	protected void updateCustomer(HttpServletRequest request,HttpServletResponse response) {
			System.out.println("========");
			String customerId=request.getParameter("customerId");
			String prinpical=request.getParameter("linkManId");
			String customerName=request.getParameter("CUSTOMERNAME");
			String postCode=request.getParameter("POST_CODE");
			String fieldId=request.getParameter("FIELD_ID");
			String sourceId=request.getParameter("SOURCE_ID");
			String busubessVolume=request.getParameter("BUSUBESS_VOLUME");
			String employeeNumbers=request.getParameter("EMPLOYEE_NUMBERS");
			String tag=request.getParameter("TAG");
			String remarks=request.getParameter("REMARKS");
			Customer customer=new Customer();
			customer.setCustomerId(Integer.parseInt(customerId));
			customer.setPrinpical(Integer.parseInt(prinpical));
			customer.setCustomerName(customerName);
			customer.setPostCode(postCode);
			customer.setFieldId(Integer.parseInt(fieldId));
			customer.setSourceId(Integer.parseInt(sourceId));
			customer.setBusubessVolume(busubessVolume);
			customer.setEmployeeNumbers(employeeNumbers);
			customer.setTag(tag);
			customer.setRemarks(remarks);
			System.out.println(customer);
			int r=customerDaoI.update(customer);
			JSONObject obj = new JSONObject();
			if(r>0){
				System.out.println("===json=====");
				obj.put("flag", 1);
				obj.put("msg", "修改成功");
				try {
					response.getWriter().write(obj.toString());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	
	/*
	 * 搜索
	 */
	protected void getSomeCustomer(HttpServletRequest request,HttpServletResponse response) throws ParseException {
		System.out.println("=========getSomeCustomer==========");
		try {
			String type=request.getParameter("type");
			System.out.println(type);
			List<CustomerVo> customerList=new ArrayList<>();
			if("5".equals(type)||"6".equals(type)){
					String text=request.getParameter("text");
					System.out.println(text);
					String textTime=request.getParameter("textTime");
					System.out.println(textTime);
					customerList=customerDaoI.selectconditionTime(text, textTime, type);
					request.setAttribute("customerList", customerList);
			}else{
					String text=request.getParameter("text");
					customerList=customerDaoI.selectcondition(text, type);
					request.setAttribute("customerList", customerList);
				
			}
			request.getRequestDispatcher("/WEB-INF/view/customerManage/customer/index.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
