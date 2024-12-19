package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {
	
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		List<String> fruits = new ArrayList<>();
		fruits.add("딸기");
		fruits.add("망고");
		fruits.add("바나나");
		fruits.add("사과");
		fruits.add("배");
		
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "김선우");
		user.put("age", 25);
		user.put("hobby", "게임");
		users.add(user);
		
		user = new HashMap<>();
		user.put("name", "김아기새");
		user.put("age", 32);
		user.put("hobby", "술마시기");
		users.add(user);
		
		model.addAttribute("users", users);
		
		model.addAttribute("fruits", fruits);
		
		return "lesson05/ex02";
	}
}
