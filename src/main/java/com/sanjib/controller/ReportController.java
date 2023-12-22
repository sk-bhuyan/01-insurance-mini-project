package com.sanjib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sanjib.entity.CitizenPlan;
import com.sanjib.request.SearchRequest;
import com.sanjib.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	private ReportService service;

	/**
	 * This method is used to load index page
	 * @param model
	 * @return String
	 */
	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("search", new SearchRequest());
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatus());
	}

	/**
	 * 
	 * @param search
	 * @param model
	 * @return
	 */
	@PostMapping("/search")
	public String handleSearch(SearchRequest search, Model model) {
		List<CitizenPlan> plans = service.search(search);
		model.addAttribute("plans", plans);
		model.addAttribute("search", search);

		init(model);
		return "index";
	}

}
