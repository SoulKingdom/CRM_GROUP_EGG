package net.wanho.vo.customer;

import java.sql.ResultSet;

import net.wanho.vo.mapper.RowMapper;

public class PrincipalVoMapper implements RowMapper<PrincipalVo> {

	@Override
	public PrincipalVo mapRow(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		return new PrincipalVo(rs.getInt("employeeId"),rs.getString("employeeName"),rs.getString("departmentName"),rs.getString("positionName"),rs.getString("phoneNum"));
	}

}
