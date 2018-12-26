package net.wanho.util;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class RequestWaper {
	private static final Logger log = Logger.getLogger(RequestWaper.class);

	public static <T> T parseRequest2Bean(HttpServletRequest request, Class<?> entityCls) {
		Object entity =null;
		try {
			// 1.��ȡʵ������
			  entity = entityCls.newInstance();
			// 2.ͨ�������ȡ���Զ����ö�������
			Field[] fieldAy = entityCls.getDeclaredFields();
			for (Field field : fieldAy) {
				// ���Կ��Ը���
				field.setAccessible(true);
				System.out.println(field.getName());
				// ͨ�����ܻ�ȡ����ֵ
				String[] valueAy = request.getParameterValues(field.getName());
				log.debug(Arrays.toString(valueAy));
				//�������Ϊ�� û������
				if(valueAy==null||valueAy.length==0){
					continue;
				}
				// �ж��Ƿ�ֻ��һ������
				if (valueAy.length == 1) {
					// 3.�������������Integer��int ǿתString
					if (field.getType() == Integer.class || field.getType() == int.class) {
						// 4.������ֵ
						field.set(entity, Integer.parseInt(valueAy[0]));
						continue;
					}
					// 4.如果对象属性是BigDecimal类型  强转BigDecimal
					field.getName();
					if (field.getType() == BigDecimal.class) {
						field.set(entity, new BigDecimal(valueAy[0]));
						continue;
					}
					
					if(field.getType() == Date.class){
						field.set(entity, new SimpleDateFormat("yyyy-MM-dd").parse(valueAy[0]));
						continue;
					}
					field.set(entity, valueAy[0]);
					continue;
				}
				//��������������Ը�ֵ
				StringBuffer sb = new StringBuffer();
				for (String string : valueAy) {
					sb.append(string).append(",");
				}
				sb=sb.deleteCharAt(sb.length()-1);
				field.set(entity, sb.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) entity;

	}
}
