package cn.nongdewang.service;

import java.util.List;

import cn.nongdewang.entity.Person;

public interface PersonService {
	
	int saveUser(Person person);

	List<Person> findAllUsers();

	Person findUserByID(Integer id );

	void updateUser(Person person);
	void deleteUser(Person person);
 }
