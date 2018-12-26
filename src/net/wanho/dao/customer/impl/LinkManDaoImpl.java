package net.wanho.dao.customer.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;

import net.wanho.dao.customer.LinkManDaoI;
import net.wanho.po.customer.LinkMan;
import net.wanho.util.DbUtil;

public class LinkManDaoImpl implements LinkManDaoI {

	@Override
	public int insert(LinkMan linkMan) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "INSERT INTO link_man (LINK_MAIN_ID,NAME,SEX,POSITION,NICKNAME,PHONENUM,EMAIL,QQ,CREATE_TIME,UPDATE_TIME,REMARKS,QR_CODE,CUSTOMER_ID)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)"
		    ,linkMan.getLinkManId(),linkMan.getName(),linkMan.getSex(),linkMan.getPosition(),linkMan.getNickName(),linkMan.getPhoneNum(),linkMan.getEmail(),linkMan.getQQ(),linkMan.getCreateTime(),linkMan.getUpdateTime(),linkMan.getRemarks(),linkMan.getQrCode(),linkMan.getCustomerId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "DELETE FROM link_man WHERE LINK_MAIN_ID = ?",id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(LinkMan linkMan) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.update(DbUtil.getConnection(), "UPDATE link_man SET NAME =?,SEX = ?,POSITION =?,NICKNAME =?,PHONENUM =? ,EMAIL =?,QQ =? ,CREATE_TIME =? ,UPDATE_TIME = ? ,REMARKS =? ,QR_CODE =? ,CUSTOMER_ID = ? WHERE LINK_MAIN_ID = ?"
					,linkMan.getName(),linkMan.getSex(),linkMan.getPosition(),linkMan.getNickName(),linkMan.getPhoneNum(),linkMan.getEmail(),linkMan.getQQ(),linkMan.getCreateTime(),linkMan.getUpdateTime(),linkMan.getRemarks(),linkMan.getQrCode(),linkMan.getCustomerId(),linkMan.getLinkManId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public LinkMan selectById(Integer id) {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT LINK_MAIN_ID linkManId,NAME name,SEX sex,POSITION position,NICKNAME nickName,PHONENUM phoneNum,EMAIL email,QQ,CREATE_TIME createTime,UPDATE_TIME updateTime,REMARKS remarks,QR_CODE qrCode,CUSTOMER_ID customerId FROM link_man where LINK_MAIN_ID=? ",new BeanHandler<>(LinkMan.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int selectCondCount(LinkMan info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<LinkMan> selectCond(int pageNo, int pageSize, LinkMan info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LinkMan> selectAll() {
		QueryRunner qr=new QueryRunner();
		try {
			return qr.query(DbUtil.getConnection(), "SELECT LINK_MAIN_ID linkManId,NAME name,SEX sex,POSITION position,NICKNAME nickName,PHONENUM phoneNum,EMAIL email,QQ,CREATE_TIME createTime,UPDATE_TIME updateTime,REMARKS remarks,QR_CODE qrCode,CUSTOMER_ID customerId FROM link_man ",new BeanListHandler<>(LinkMan.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LinkMan selectcondition(Integer mobile,String email) {
		QueryRunner qr=new QueryRunner();
		List<Object> addList=new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		sb.append("SELECT LINK_MAIN_ID linkManId,NAME name,SEX sex,POSITION position,NICKNAME nickName,PHONENUM phoneNum,EMAIL email,QQ,CREATE_TIME createTime,UPDATE_TIME updateTime,REMARKS remarks,QR_CODE qrCode,CUSTOMER_ID customerId FROM link_man where 1=1");
		if(mobile!=null){
			sb.append("  and phoneNum=").append("?");
			addList.add(mobile);
		}
		if(email!=null&&!"".equals(email)){
			sb.append("  and email=").append("?");
			addList.add(email);
		}
		try {
			System.out.println(sb.toString());
			for (Object object : addList) {
				System.out.println(object);
			}
			return qr.query(DbUtil.getConnection(), sb.toString(),new BeanHandler<>(LinkMan.class), addList.toArray());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
