package com.cts.pms.ProductModule_placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.pms.ProductModule_placeholder.model.Car;
import com.cts.pms.ProductModule_placeholder.model.JdbcConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext bf = null;
		bf = new ClassPathXmlApplicationContext("spring.xml");
		
		JdbcConfig jdbc=(JdbcConfig)bf.getBean("jdbcConfig");
		System.out.println(jdbc.getDbUrl());
		System.out.println(jdbc.getUn());
		System.out.println(jdbc.getPwd());
		
		System.out.println(jdbc.getDbUrl1());
		System.out.println(jdbc.getUn1());
		System.out.println(jdbc.getPwd1());
		
		System.out.println(jdbc.getDbUrl2());
		System.out.println(jdbc.getUn2());
		System.out.println(jdbc.getPwd2());
	}
}
