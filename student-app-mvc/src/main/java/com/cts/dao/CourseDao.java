package com.cts.dao;

import java.util.List;

import com.cts.model.Course;

public interface CourseDao {
	List getAll();
	Course getById(int id);
	void addCourse(Course course);
	void updateCourse(Course course);
	void deleteCourse(int id);
	List getbyFilter(String filter);

}
