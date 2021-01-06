package com.gitTest.gitTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctr2 {
	
	public String name1="张三";
	
	public String name3="王五";
	
	@RequestMapping("/bb")
	public String bb(){
		return "bb";
	}
}
