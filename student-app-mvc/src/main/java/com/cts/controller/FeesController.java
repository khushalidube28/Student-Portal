package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.Fees;

import com.cts.service.FeesService;

@Controller
public class FeesController {
	
	@Autowired
	private FeesService feesService;
	
	@GetMapping("/fees")
	public ModelAndView showFeesPage() {
		ModelAndView mv = new ModelAndView("fees");
		List<Fees> feess = feesService.getAll();
		mv.addObject("feess",feess);
		return mv;
	}
	
	@GetMapping("/filterpaid")
	public ModelAndView showFilterpaid() {
		ModelAndView mv = new ModelAndView("filterpaid");
		List<Fees> feess= feesService.getPaidfees();
		mv.addObject("feess",feess);
		return mv;
	}
	
	@GetMapping("/filterunpaid")
	public ModelAndView showFilterunpaid() {
		ModelAndView mv = new ModelAndView("filterunpaid");
		List<Fees> feess= feesService.getUnpaidfees();
		mv.addObject("feess",feess);
		return mv;
	}
	
	@GetMapping("/addfees")
	public String showAddfeesform(Model m)
	{
		m.addAttribute("fees", new Fees());
		return "addfees";
	}
	
	@PostMapping("/add-fees")
	public String addFees(@ModelAttribute Fees fees) {
		feesService.addFees(fees);
		return "redirect:/fees";
		
	}
	
	@GetMapping("/updatefees")
	public String showUpdateForm(int id ,Model model) {
		Fees fees = feesService.getById(id);
		model.addAttribute("fees",fees);
		return "updatefees";
		
	}
	
	@PostMapping("/update-fees")
	public String updateFees(@ModelAttribute Fees fees) {
		feesService.updateFees(fees);
		return "redirect:/fees";
	}
	
	@GetMapping("/deletefees")
	public String deleteFees(int id) {
		feesService.deleteFees(id);
		return "redirect:/fees";
		
	}
	
	
	
	
	
	
	
}
