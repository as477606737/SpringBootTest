package com.demo;


import com.demo.dao.UserDao;
import com.demo.model.user;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

@SpringBootApplication
@MapperScan("com.demo.dao")
public class SpringboottestApplication {





	public static void main(String[] args) {
		SpringApplication.run(SpringboottestApplication.class, args);
	}

}
