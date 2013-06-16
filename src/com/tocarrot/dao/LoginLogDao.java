package com.tocarrot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tocarrot.domain.LoginLog;

@Repository
public class LoginLogDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertLoginLog( LoginLog loginLog )
	{
		String sqlStr = "Insert into t_login_log( user_id, ip, login_datetime ) " 
				+ " values( ?, ?, ? ) ";
		
		Object[] args = { loginLog.getUserid(), loginLog.getIp(), loginLog.getLoginDate() };
		
		jdbcTemplate.update(sqlStr, args );
	}
}
