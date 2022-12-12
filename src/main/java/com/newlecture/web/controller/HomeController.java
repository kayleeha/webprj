package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/")
public class HomeController { //HomeController는 Controller를 담는 그릇임, 실질적인 controller는 함수임
							//Class 단위로 url을 mapping 시키는 것이 아니라 함수 단위로 url mapping 시킴
							//url mapping을 위해 class를 여러개 만들 필요가 없어짐
	@RequestMapping("index") //	<mvc:annotation-driven /> 써줄 것
	@ResponseBody //viewResolver 사용하지 말고 return 값을 그대로 사용자에게 보내라 text만 보여주고 싶을 때 사용..
	public String index() {
		
		return "Hello Index";
		}
		//return "root.index";  //view page를 찾아줌
	
	
	
//	@Override  //dispatcher 기능은 spring이 제공, dispatcher를 하기 위한 ModelAndView를 제공
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "Hello Spring MVC~"); //데이터를 담음
//		//mv.setViewName("/WEB-INF/view/index.jsp"); 
//		
//		return mv;
//	}

}
