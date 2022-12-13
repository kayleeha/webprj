package com.newlecture.web.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service; //데이터를 요청하기 위해서 service 객체 가져옴
	
	@RequestMapping("list")
	public Notice list() throws ClassNotFoundException, SQLException {
		
		List<Notice> list = service.getList(1, "title", ""); //객체를 던져버리면 알아서 JSON
		
		return list.get(0);
	}
}
