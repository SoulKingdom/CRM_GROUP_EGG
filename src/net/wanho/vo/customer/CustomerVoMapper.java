package net.wanho.vo.customer;

import java.sql.ResultSet;

import net.wanho.vo.mapper.RowMapper;

public class CustomerVoMapper implements RowMapper<CustomerVo> {

	@Override
	public CustomerVo mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		return new CustomerVo(rs.getInt("customerId"),rs.getString("name"), rs.getString("customerName"),rs.getInt("fieldId"),rs.getInt("sourceId"), rs.getString("fieldName"), rs.getString("sourceName"), rs.getDate("createTime"), rs.getDate("updateTime"),rs.getString("postCode"),rs.getString("busubessVolume"),rs.getString("employeeNumbers"),rs.getString("tag"),rs.getString("remarks"),rs.getInt("prinpical"));
	}

}
