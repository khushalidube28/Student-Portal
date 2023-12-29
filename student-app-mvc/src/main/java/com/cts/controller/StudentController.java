package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.cts.model.Student;
import com.cts.model.StudentDetails;
import com.cts.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String showfp() {
		return "login";
	}
	
	
	@GetMapping("/school")
	public String showSchool() {
		return "school";
	}
	
	
	
	@GetMapping("/index")
	public ModelAndView showIndexPage() {
		ModelAndView mv = new ModelAndView("index");
		List<Student> students = studentService.getAll();
		mv.addObject("students",students);
		
		return mv;
	}
	
	@GetMapping("/add")
	public String showAddform(Model m)
	{
		m.addAttribute("student", new Student());
		return "add";
	}
	
	@PostMapping("/add-student")
	public String addStudent(@ModelAttribute Student student) {
		studentService.addStudent(student);
		return "redirect:/";
	}
	@GetMapping("/update")
	public String showUpdateForm(int id,Model model) {
		Student student = studentService.getById(id);
		model.addAttribute("student",student);
		return "update";
		
	}
	
	@PostMapping("/update-student")
	public String updateStudent(@ModelAttribute Student student) {
		studentService.updateStudent(student);
		return "redirect:/";
		
	}
	
	@GetMapping("/delete")
	public String deleteStudent(int id) {
		studentService.deleteStudent(id);
		return "redirect:/";
		
	}
	
	@GetMapping("/studentdetails")
	public String getdetails( @RequestParam int id,Model m) {
		StudentDetails sd=studentService.getDetailsById(id);
		m.addAttribute("details",sd);
		return "school";
		
		
	}
	
	
}