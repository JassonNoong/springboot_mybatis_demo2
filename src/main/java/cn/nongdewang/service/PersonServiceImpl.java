package cn.nongdewang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nongdewang.dao.UserMapper;
import cn.nongdewang.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {
	private final org.slf4j.Logger log =org.slf4j.LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int saveUser(Person person) {
		userMapper.save(person);
		log.info("user="+person.toString());
		return 1;
	}

	@Override
	public List<Person> findAllUsers() {
		
	List<Person>list=	userMapper.findAllUsers();
		return list;
	}

	@Override
	public Person findUserByID(Integer id ) {
		Person person=userMapper.findUserByID( id );
		return person;
	}

		@Override
	public void updateUser(Person person) {
		userMapper.updateUser(person);
		
	}

		@Override
		public void deleteUser(Person person) {
			userMapper.deleteUser( person);
		}

}
