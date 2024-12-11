package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // spring bean, @ResponseBody 있으면 안됨!!!
public class Lesson01Ex02Controller {

	
	@RequestMapping("/lesson01/ex02")
	public String ex03() {
		return "lesson01/ex02";
	}
}
