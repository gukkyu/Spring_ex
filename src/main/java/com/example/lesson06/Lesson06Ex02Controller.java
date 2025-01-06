package com.example.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson06/ex02")
@Controller
public class Lesson06Ex02Controller {

	@Autowired
	private UserBO userBO;
	
	// 회원가입 화면
	@GetMapping("/add-user-view")
	public String addUserView() {
		return "lesson06/duplicateAddUser";
	}
	
	// AJAX가 하는 요청
	@ResponseBody
	@GetMapping("/is-duplicate-name")
	public Map<String, Object> isDuplicateName(
			@RequestParam("name") String name){
		
		boolean isDuplicate = userBO.isDuplicateByName(name);
		
		Map<String, Object> result = new HashMap<>();
		result.put("code", 200);
		result.put("is_duplicate_name", isDuplicate);
		
		return result;
	}
	
}
