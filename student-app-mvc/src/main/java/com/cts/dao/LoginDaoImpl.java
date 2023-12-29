package com.cts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Login isValidCredentials(String username,String password) {
		try {
			String sql="select * from admin where username=? and password=?";
			return jdbcTemplate.queryForObject(sql,new RowMapper<Login>() {

			@Override
			public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				Login l = new Login();
				l.setUsername(rs.getString("username"));
				l.setPassword(rs.getString("password"));
				return l;
			}
			
		},username,password);
		}
		catch(Exception ex){
			return null;
			
		}
		
	}

}
