package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		//load the spring configuration file and create a spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container (myCoach is bean id and Coach.class is an interface)
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
