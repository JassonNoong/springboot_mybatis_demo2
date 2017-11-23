package cn.nongdewang.entity;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String password;



	public Person() {
	}

	

	public Person(Integer id,String name, String password) {
		this();
		this.name = name;
		this.password = password;
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", password='" + password + '\'' + ", id=" + id + '}';
	}
}
