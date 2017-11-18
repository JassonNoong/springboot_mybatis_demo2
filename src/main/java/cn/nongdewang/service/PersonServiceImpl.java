package cn.nongdewang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nongdewang.dao.PersonMapper;
import cn.nongdewang.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonMapper personMapper;
	@Override
	public List<Person> findAll() {
		List<Person> list = personMapper.findAllPersons();
		return list;
	}
	@Override
	public int savePerson(Person person) {
		int count = personMapper.save(person);
		return count;
	}

}
