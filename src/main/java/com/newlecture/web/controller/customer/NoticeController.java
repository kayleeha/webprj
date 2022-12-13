package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/") //클래스의 url과 함수의 url이 합쳐져서 mapping, 같은 경로를 반복해서 쓰지 않고 간단하게 하기 위해서
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService; //interface 기반..
	
	@RequestMapping("list")
	public String  list(@RequestParam(value = "p", defaultValue = "1") Integer page) throws ClassNotFoundException, SQLException {
		//String p =  request.getParameter("p");  //RequestParam을 사용하면 간단한 url 주소를 만들 수 있다. parameter와 실제 받는 변수명이 다른 경우에 사용
		//defaultValue를 사용해 parameter 값이 null일 때 기본값을 설정할 수 있다.
		
		System.out.println("page:" + page);
		
		//List<Notice> list = noticeService.getList(1, "TITLE", "");
		
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
}
