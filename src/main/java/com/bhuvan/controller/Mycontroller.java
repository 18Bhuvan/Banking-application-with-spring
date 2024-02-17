package com.bhuvan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhuvan.entity.SdfcBank;
import com.bhuvan.model.Openaccount;
import com.bhuvan.service.Myservice;

@Controller
public class Mycontroller {

	
	@Autowired
	private Myservice service;
	
	@RequestMapping("/")
	public String bankHomePage()
	{
		return "home";
		
	}
	@RequestMapping("/openaccount")
	public String openaccount(ModelMap model) 
	{
		Openaccount bank=new Openaccount();
		model.put("bank", bank);
		return "openaccount";
	}
	@RequestMapping("/register")
	public String registerBank(@ModelAttribute SdfcBank bank,ModelMap model) {
		
		SdfcBank sb=service.saveCustomerdetails(bank);
		
		return "success";
	}
	
	
	
}
