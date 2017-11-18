package cn.nongdewang.service;

import java.util.List;

import cn.nongdewang.entity.Person;

public interface PersonService {
	List<Person> findAll();
	int savePerson(Person person);
 }
