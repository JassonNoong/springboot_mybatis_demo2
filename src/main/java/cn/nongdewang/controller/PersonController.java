package cn.nongdewang.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.nongdewang.entity.Person;
import cn.nongdewang.service.PersonService;
/**
 * 
 * @author nongdewang
 *
 */
@RestController
public class PersonController {
		private static Logger log =LoggerFactory.getLogger(PersonController.class);
	@Autowired
	PersonService service;
	
	//测试控制器是否正常
	@GetMapping("testGet")
	public String test1(){
		System.out.println("testGet");
		log.debug("debug########");
		log.error("error######");
		return "test get_method ok !"+System.currentTimeMillis();
	}
	
	@PostMapping("testPost")
	public String test2(){
		return "test post_method od !";
	}
	
@RequestMapping("saveUser")
	public String saveUser(){
		Person user =new Person ();
		user.setName("hah");
		user.setPassword("12341234");
		service.saveUser(user);
		log.debug("controller######saveUser");
		return "save user ok!";
	}
	
	@RequestMapping("findAllUsers")
		public String findAllUsers(){
		List<Person> list=service.findAllUsers();
		return list.toString();
	}

	@RequestMapping("findUserByID")
	public String findUserByID(Integer id  ){
		Person person=service.findUserByID( id );
		return person.toString();
	}
	
	@RequestMapping("updateUser")
	public String updataUser(Integer id ){
		Person person =new Person();
		person.setId(id);
		person.setName("joaj jao j");
		person.setPassword("34125");
		service.updateUser(person);
		return person.toString();
	}
	
	@RequestMapping("deleteUser")
	public String deleteUser(Integer id ){
		Person user =new Person();
		user.setId(id);
		service.deleteUser(user);
		return "delete OK";
		
	}
	
}
