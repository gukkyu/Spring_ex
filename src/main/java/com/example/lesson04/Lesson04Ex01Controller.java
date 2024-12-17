package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;
import com.example.lesson04.domain.User;

@RequestMapping("lesson04/ex01")
@Controller
public class Lesson04Ex01Controller {

	@RequestMapping(path = "/sign-up-view", method = RequestMethod.GET)
	public String signUpView(){
		return "lesson04/addUser";
	}
	
	@Autowired
	private UserBO userBO;
	
	@PostMapping("/sign-up")
	public String signUp(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("email") String email,
			@RequestParam(value = "introduce", required = false) String introduce
			) {
		
		userBO.addUser(name, yyyymmdd, email, introduce);
		
		return "lesson04/afterAddUser";
	}
	
	@GetMapping("/latest-user-view")
	public String latestUserView(Model model) {
		User user = userBO.getUser();
		
		model.addAttribute("result", user);
		model.addAttribute("title", "마지막 가입된 유저");
		
		return "lesson04/latestUser";
	}
}
