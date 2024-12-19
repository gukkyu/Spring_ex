package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.domain.Student;

@RequestMapping("/lesson04/ex02")
@Controller
public class Lesson04Ex02Controller {

	@Autowired
	private StudentBO studentBO;
	// 학생 추가
	@GetMapping("/add-student-view")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	
	@PostMapping("/add-student")
	public String addStudent(
			@ModelAttribute Student student, // request param 명과 필드명이 일치하는
			Model model) {
		
		// DB insert -> id 를 얻을수 있음
		studentBO.addStudent(student);
		
		// DB select -> id로 -> 방금 가입된 학생
		int id = student.getId();
		student = studentBO.getStudent(id);
		
		// model 에 담는다
		model.addAttribute("student", student);
		
		return "lesson04/afterAddStudent";
	}
	
	// DB Insert - 결과 방금 가입된 학생
}
