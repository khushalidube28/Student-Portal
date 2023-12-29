package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.Course;

import com.cts.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/course")
	public ModelAndView showCoursePage() {
		ModelAndView mv = new ModelAndView("course");
		List<Course> courses = courseService.getAll();
		mv.addObject("courses",courses);
		return mv;
	}
	@GetMapping("/addcourse")
	public String showAddcoursesform(Model m)
	{
		m.addAttribute("course", new Course());
		return "addcourse";
	}
	
	@PostMapping("/add-course")
	public String addCourse(@ModelAttribute Course course) {
		courseService.addCourse(course);
		return "redirect:/course";
		
	}
	
	@GetMapping("/updatecourse")
	public String showUpdateCourse(int id ,Model model) {
		Course course = courseService.getById(id);
		model.addAttribute("course",course);
		return "updatecourse";
		
	}
	
	@PostMapping("/update-course")
	public String updateCourse(@ModelAttribute Course course) {
		courseService.updateCourse(course);
		return "redirect:/course";
	}
	
	@GetMapping("/deletecourse")
	public String deleteCourse(int id) {
		courseService.deleteCourse(id);
		return "redirect:/course";
		
	}
	
	@GetMapping("/direct")
	public String getFilter(String filter,Model m) {
		
		List<Course> crs=  courseService.getbyFilter(filter);
		m.addAttribute("courses",crs);
		return "course";
		
	}
	

}
