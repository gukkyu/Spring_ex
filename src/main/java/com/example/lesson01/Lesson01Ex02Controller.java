package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // spring bean, @ResponseBody 있으면 안됨!!!
public class Lesson01Ex02Controller {

	
	@RequestMapping("/lesson01/ex02")
	public String ex03() {
		// @ResponseBody가 없는 상태로 return String 하면
		// ViewResolver 에 의해 리턴된 HTML 경로를 찾아 화면이 구성된다.
		return "lesson01/ex02";
	}
}
