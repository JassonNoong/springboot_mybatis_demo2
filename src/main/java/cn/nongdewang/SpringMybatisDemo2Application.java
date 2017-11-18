package cn.nongdewang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.nongdewang.dao")

@SpringBootApplication
public class SpringMybatisDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisDemo2Application.class, args);
	}
}
