package cn.nongdewang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.nongdewang.entity.Person;

@Mapper
public interface UserMapper {
	public void save(Person person);

	public List<Person> findAllUsers();

	public Person findUserByID(Integer id);

	public void updateUser(Person person);
	
	public void deleteUser(Person person);
}
