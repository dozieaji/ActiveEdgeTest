package com.exercise.crudProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exercise.CrudeOperationApplication.dao.StockDao;

@Controller
public class StockController {
	
	@RequestMapping
	public String Stock() {
		
		return "home.jsp";
	}

	@Autowired
	StockDao Stock;
	
	@RequestMapping("/addStock")
	public String addStock() {
		
		return "home.jsp";
		
		
	}
	
	
}
