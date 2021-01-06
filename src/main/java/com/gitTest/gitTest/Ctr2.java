package com.gitTest.gitTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctr2 {
	@RequestMapping("/bb")
	public String bb(){
		return "bb";
	}
}
