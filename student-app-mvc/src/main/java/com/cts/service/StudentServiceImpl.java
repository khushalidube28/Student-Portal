package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.StudentDao;
import com.cts.model.Student;
import com.cts.model.StudentDetails;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return studentDao.getAll();
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getById(id);
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.addStudent(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(id);
		
	}

	@Override
	public StudentDetails getDetailsById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getDetailsById(id);
	}

}
