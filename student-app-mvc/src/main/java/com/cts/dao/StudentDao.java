package com.cts.dao;

import java.util.List;

import com.cts.model.Student;
import com.cts.model.StudentDetails;

public interface StudentDao {
	List getAll();
	Student getById(int id);
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int id);
	StudentDetails getDetailsById(int id);

}
