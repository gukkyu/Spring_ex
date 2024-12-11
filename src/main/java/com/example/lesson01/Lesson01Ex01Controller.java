package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Spring bean 으로 등록
public class Lesson01Ex01Controller {

	// http://localhost:8080/lesson01/ex01/1
	// String 을 브라우저에 출력
	@RequestMapping("/lesson01/ex01/1")
	@ResponseBody
	public String ex01_1() {
		return "<h1>문자열을 response body로 보낸다.</h1>";
	}
	
	// http://localhost:8080/lesson01/ex01/2
	
	@RequestMapping("/lesson01/ex01/2")
	@ResponseBody
	public Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("딸기", 4);
		map.put("바나나", 7);
		map.put("감귤", 30);
		map.put("두리안", 1);
		
		// map -> JSON String 이 된다.
		return map;
	}
}
