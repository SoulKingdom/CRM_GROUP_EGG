package net.wanho.vo.mapper;

import java.sql.ResultSet;

import net.wanho.po.system.LogIn;



public class AdviceMapper implements RowMapper<LogIn> {

	@Override
	public LogIn mapRow(ResultSet rs) throws Exception {
		return new LogIn(rs.getInt(""),
				          rs.getInt(""), 
				          rs.getString(""));
	}
}
