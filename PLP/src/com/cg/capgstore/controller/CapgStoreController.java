package com.cg.capgstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capgstore.dto.StoreDTO;
import com.cg.capgstore.service.CapgStoreService;

@Controller
public class CapgStoreController {
	@Autowired
	CapgStoreService service;
	@RequestMapping(value="/ho")
	public String home1()
	{
		return "home";
	}
	@RequestMapping(value="products")
	public ModelAndView electronics(@ModelAttribute("my") StoreDTO d,@RequestParam("id") int i)
	{
		List<StoreDTO> list=service.getAllProducts(i);
		return new ModelAndView("electronics","data",list);
	}
	@RequestMapping(value="sort")
	public ModelAndView sort(@ModelAttribute("my") StoreDTO d,@RequestParam("id") int i,@RequestParam("aqqq") int a)
	{
		
		//System.out.println(i+" "+a);
		List<StoreDTO> list=service.sort(i,a);
		//List<StoreDTO> list=service.getAllProducts(10);
		return new ModelAndView("electronics","data",list);
	}

}
