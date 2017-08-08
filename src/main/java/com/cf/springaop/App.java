package com.cf.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cf.springaop.entity.Person;
import com.cf.springaop.service.MyService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyService myService = (MyService) factory.getBean("myService");
		myService.loginIn();
		myService.loginOut();
	}
}
