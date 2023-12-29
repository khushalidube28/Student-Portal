package com.cts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.model.Fees;

@Repository
public class FeesDaoImpl implements FeesDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List getAll() {
		return jdbcTemplate.query("select * from fees",
				new RowMapper<Fees>() {

					@Override
					public Fees mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Fees f = new Fees();
						f.setId(rs.getInt(1));
						f.setQuater1(rs.getFloat(2));
						f.setQuater2(rs.getFloat(3));
						f.setQuater3(rs.getFloat(4));
						f.setQuater4(rs.getFloat(5));
						f.setStatus(rs.getString(6));
						
						return f;
					}
		});

	}
	
	public Fees getById(int id) {
		return jdbcTemplate.queryForObject("select * from fees where studentId=?",
				(rs,rowNum)-> new Fees(rs.getInt("studentId"),rs.getFloat("quater_1"),rs.getFloat("quater_2"),
						rs.getFloat("quater_3"),rs.getFloat("quater_4"),rs.getString("status")),id);
	}
	
	public void addFees(Fees fees) {
		jdbcTemplate.update("insert into fees values(?,?,?,?,?,?)",fees.getId(),fees.getQuater1(),fees.getQuater2(),
				fees.getQuater3(),fees.getQuater4(),fees.getStatus());
	}
	
	public void updateFees(Fees fees) {
		jdbcTemplate.update("update fees set quater_1=?,quater_2=?,quater_3=?,quater_4=?,status=? where studentId=?",
				fees.getQuater1(),fees.getQuater2(),fees.getQuater3(),fees.getQuater4(),fees.getStatus(),fees.getId());
	}
	
	public void deleteFees(int id) {
		jdbcTemplate.update("delete from fees where studentId=?",id);
	}
	
	public List getPaidfees() {
		return jdbcTemplate.query("select * from fees where status='paid'",
				new RowMapper<Fees>() {

					@Override
					public Fees mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Fees f = new Fees();
						f.setId(rs.getInt(1));
						f.setQuater1(rs.getFloat(2));
						f.setQuater2(rs.getFloat(3));
						f.setQuater3(rs.getFloat(4));
						f.setQuater4(rs.getFloat(5));
						f.setStatus(rs.getString(6));
						
						return f;
					}
		});

	}
	
	public List getUnpaidfees() {
		return jdbcTemplate.query("select * from fees where status='unpaid'",
				new RowMapper<Fees>() {

					@Override
					public Fees mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Fees f = new Fees();
						f.setId(rs.getInt(1));
						f.setQuater1(rs.getFloat(2));
						f.setQuater2(rs.getFloat(3));
						f.setQuater3(rs.getFloat(4));
						f.setQuater4(rs.getFloat(5));
						f.setStatus(rs.getString(6));
						
						return f;
					}
		});

	}
}