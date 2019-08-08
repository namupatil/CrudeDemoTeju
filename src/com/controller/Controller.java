package com.controller;





import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;

import com.model.Icecreame;
import com.serviceInterface.IceServiceInterface;
@org.springframework.stereotype.Controller



public class Controller {
	
	@Autowired
	private IceServiceInterface iceServiceInterface;

	@RequestMapping("namu")
	public ModelAndView open()
	{
		
		
		return new ModelAndView("Namu");
		
	}
	@RequestMapping(value="savenamu",params="Save")
	public ModelAndView savenamu(Model model,@ModelAttribute Icecreame icecreame,HttpServletRequest request)
	{
		//int iceId=Integer.parseInt(request.getParameter("iceId"));
		double quantity=Double.parseDouble(request.getParameter("quantity"));
		iceServiceInterface.saveIcecreame(icecreame);
		return new ModelAndView("Namu");
	}
	
	@RequestMapping("jayu")
	public ModelAndView open1()
	{
		return new ModelAndView("Jayu");
	}

}
