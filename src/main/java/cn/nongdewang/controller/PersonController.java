package cn.nongdewang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.nongdewang.entity.Person;
import cn.nongdewang.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService service;
	@RequestMapping("/findAllPersons")
	public String findAllPersons(){
		System.out.println("findAllPersons");
		List<Person> list = service.findAll();
		return list.toString();
	}
	
	//测试控制器是否正常
	@GetMapping("testGet")
	public String test1(){
		return "test get_method ok !";
	}
	
	@PostMapping("testPost")
	public String test2(){
		return "test post_method od !";
	}
	
	@PostMapping("savePerson")
	public String savePerson(){
		Person person =new Person(null,"小马","12345");
		int count = service.savePerson(person);
		return "修改了"+count+"位";
	}
}
