package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBO;
import com.example.lesson02.domain.UsedGoods;

@RestController
public class Lesson02Ex01RestController {


	@Autowired // DI - spring bean을 주입 받음
	private UsedGoodsBO usedGoodsBO;
	
	// http://localhost/lesson02/ex01
	@RequestMapping("/lesson02/ex01")
	// DTO (Data Transfer Object): 데이터를 담아서 이동하는 오브젝트 
	//(also call as Model or Domain)
	
	// VO (Value Object): read only
	
	// Entity: DB에서 가져온 가공되지 않은 것
	
	public List<UsedGoods> ex01(){
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		return usedGoodsList;
	}
}
