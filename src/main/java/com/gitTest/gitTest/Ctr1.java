package com.gitTest.gitTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctr1 {

	public String name1="张三";
	
	public String name2="李四";
	public String name3="aaa";
	
	@RequestMapping("/aa")
	public String aa(){
		return "呵呵";
	}
}
