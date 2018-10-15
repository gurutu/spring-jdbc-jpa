package com.example.demo;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.data.entity.Person;
import com.example.demo.data.jdbc.PersonJdbcDao;
import com.example.demo.data.jpa.PersonJpaDao;

@SpringBootApplication
public class JpaDaoApplication implements CommandLineRunner{

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDaoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		logger.info("Hello This is dta -> {}",dao.findById(1001));;
		logger.info("All the data -> {}",dao.findAll());
	/*	for (Person person : ls) {
			logger.info("you will get value -> {}",person.getId());
		}
		
		logger.info("Person MAil -> {}",dao.findById(1001));
		logger.info("person delete -> {}",dao.deleteById(1004));
		logger.info("Insert value -> {}",dao.insert(new Person(1008,"hello","bangalore",new Date())));
	*/}
}
