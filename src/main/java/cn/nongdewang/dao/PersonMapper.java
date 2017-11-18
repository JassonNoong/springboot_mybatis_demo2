package cn.nongdewang.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import cn.nongdewang.entity.Person;
@Component
@Repository
public interface PersonMapper {
	//查找所有的用户信息
	List<Person> findAllPersons();
	//保存用户信息.
	int save(Person person);
 }