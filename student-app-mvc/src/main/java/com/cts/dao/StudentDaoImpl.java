package com.cts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.model.Student;
import com.cts.model.StudentDetails;

@Repository
public  class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student", 
				new RowMapper<Student>() {

					@Override
					public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Student student = new Student();
						student.setId(rs.getInt(1));
						student.setName(rs.getString(2));
						student.setGender(rs.getString(3));
						student.setDob(rs.getDate(4));
						student.setContact(rs.getString(5));
						student.setEmail(rs.getString(6));
						
						return student;
					}
	});
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from student where studentId=?", 
				(rs,rowNum)->new Student(rs.getInt("studentId"),rs.getString("name"),
						rs.getString("gender"),rs.getDate("dob"),rs.getString("contact"),
						rs.getString("email_id")),id);
		
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into student values(?,?,?,?,?,?)",student.getId(),student.getName(),student.getGender(),
				student.getDob(),student.getContact(),student.getEmail());
		
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update student set name=?,gender=?,dob=?,contact=?,email_id=? where studentId=?",student.getName(),student.getGender(),
				student.getDob(),student.getContact(),student.getEmail(),student.getId());
		
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from student where studentId=?",id);
		
	}
	
	
	public StudentDetails getDetailsById(int id) {
		return jdbcTemplate.queryForObject("select * from student join fees on student.StudentID = fees.StudentID join course on student.StudentID = course.StudentID  where student.studentID=?",
				new RowMapper<StudentDetails>() {

					@Override
					public StudentDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						StudentDetails sd= new StudentDetails();
						sd.setId(rs.getInt("StudentID"));
						sd.setName(rs.getString("name"));
						sd.setDob(rs.getDate("dob"));
						sd.setGender(rs.getString("gender"));
						sd.setContact(rs.getString("contact"));
						sd.setEmail(rs.getString("email_id"));
						sd.setBranch(rs.getString("branch"));
						sd.setQuater1(rs.getFloat("quater_1"));
						sd.setQuater2(rs.getFloat("quater_2"));
						sd.setQuater3(rs.getFloat("quater_3"));
						sd.setQuater4(rs.getFloat("quater_4"));
						sd.setStatus(rs.getString("status"));
						sd.setResult(rs.getString("result"));
						sd.setYear(rs.getInt("year"));
						
						
						
						
						return sd;
					}
			},id);
		}
		
	
	
	/*public Admin  admincheck(Admin admin) {
		jdbcTemplate.queryForObject("select * from admin where usr=? psns=?", admin.username,) ;
	}*/
}
