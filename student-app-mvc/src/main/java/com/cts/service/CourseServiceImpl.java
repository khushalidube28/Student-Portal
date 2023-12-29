package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.CourseDao;
import com.cts.model.Course;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List getAll() {
		return courseDao.getAll();
	}
	
	@Override
	public Course getById(int id) {
		return courseDao.getById(id);
		
	}
	
	public void addCourse(Course course) {
		courseDao.addCourse(course);
	}
	public void updateCourse(Course course) {
		courseDao.updateCourse(course);
	}
	
	@Override
	public void deleteCourse(int id) {
		// TODO Auto-generated method stub
		courseDao.deleteCourse(id);
		
	}

	@Override
	public List getbyFilter(String filter) {
		// TODO Auto-generated method stub
		return courseDao.getbyFilter(filter);
	}


}
