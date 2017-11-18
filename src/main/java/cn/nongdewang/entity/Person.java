package cn.nongdewang.entity;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	// @Value("${person.password}")
	// @NotEmpty(message="密码不能为空")
	private String password;
	// @Value("${person.id}")
	/*@Id
	@GeneratedValue*/
	// @Max(message="id不能大于100", value = 0)
	private Integer id;

	public Person() {
	}

	;

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
