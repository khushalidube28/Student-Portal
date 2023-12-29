package com.cts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.model.Course;
@Repository
public class CourseDaoImpl implements CourseDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List getAll() {
		return jdbcTemplate.query("select * from course",
			new RowMapper<Course>() {

				@Override
				public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
					
					// TODO Auto-generated method stub
					Course c = new Course();
					c.setId(rs.getInt(1));
					c.setBranch(rs.getString(2));
					c.setYear(rs.getInt(3));
					c.setResult(rs.getString(4));
					return c;
				}
			
		});
	}
	
	public Course getById(int id) {
		return jdbcTemplate.queryForObject("select * from course where studentId=?",
				(rs,rowNum)-> new Course(rs.getInt("studentId"),rs.getString("branch"),rs.getInt("year"),
						rs.getString("result")),id);
	}
	
	public void addCourse(Course course) {
		jdbcTemplate.update("insert into course values(?,?,?,?)",course.getId(),course.getBranch(),
				course.getYear(),course.getResult());
	}
	
	public void updateCourse(Course course) {
		jdbcTemplate.update("update course set branch=?,year=?,result=? where studentId=?",course.getBranch(),
				course.getYear(),course.getYear(),course.getResult());
	}
	
	public void deleteCourse(int id) {
		jdbcTemplate.update("delete from course where studentId=?",id);
	}
	
	public List<Course> getbyFilter( String filter) {
		return jdbcTemplate.query("select * from course where studentId=? or branch=? or year=? or result=?",
				new RowMapper<Course>() {

					@Override
					public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Course c = new Course();
						c.setId(rs.getInt(1));
						c.setBranch(rs.getString(2));
						c.setYear(rs.getInt(3));
						c.setResult(rs.getString(4));
						return c;
					}
	},filter,filter,filter,filter);
		

	}
	
}
