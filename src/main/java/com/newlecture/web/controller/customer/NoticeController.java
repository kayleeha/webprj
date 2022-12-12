package com.newlecture.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/") //클래스의 url과 함수의 url이 합쳐져서 mapping, 같은 경로를 반복해서 쓰지 않고 간단하게 하기 위해서
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService; //interface 기반..
	
	@RequestMapping("list")
	public String  list() throws ClassNotFoundException, SQLException {
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		
		return "notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "notice.detail";
	}
}
