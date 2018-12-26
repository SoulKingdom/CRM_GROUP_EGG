package net.wanho.vo.customer;

import java.sql.ResultSet;

import net.wanho.vo.mapper.RowMapper;

public class BusinessVoMapper implements RowMapper<BusinessVo> {

	@Override
	public BusinessVo mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		return new BusinessVo(rs.getInt("businessId"),rs.getString("employeeName"),rs.getDate("createTime"),rs.getString("nickName"),rs.getString("sex"),rs.getString("phoneNum"),rs.getString("qQ"),rs.getString("email"),rs.getString("status"),rs.getString("creator"),rs.getString("customerName"),rs.getString("name"),rs.getString("businessName"),rs.getString("typeName"),rs.getString("sourceName"),rs.getBigDecimal("probability"),rs.getBigDecimal("persalePrice"),rs.getDate("visitTime"),rs.getString("visitContent"),rs.getDate("updateTime"),rs.getInt("sourceId"),rs.getInt("typeId"));
	}

}
