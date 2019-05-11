package com.shop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.domain.Other;
import com.shop.service.otherlist;

@Controller
public class controllerother {
	@Autowired
	private otherlist other;
	@RequestMapping(value="/other")
	public ModelAndView getlist(){
		
		List<Other> otherlist = other.otherlist();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("productList");
		mv.addObject("productList", otherlist);
		
		return mv;
		
	}
}
