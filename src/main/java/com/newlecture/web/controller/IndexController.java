package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class IndexController implements Controller {

	@Override  //dispatcher 기능은 spring이 제공, dispatcher를 하기 위한 ModelAndView를 제공
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView("root.index");
		mv.addObject("data", "Hello Spring MVC~"); //데이터를 담음
		//mv.setViewName("/WEB-INF/view/index.jsp"); 
		
		return mv;
	}

}
