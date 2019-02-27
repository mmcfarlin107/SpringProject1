package com.mikemcfarlin.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {

	public static void main(String[] args) {
		
		//below loads the spring configuration file (creates the Spring Container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//below retrieves the Bean from the Spring container
		//method .getBean(bean id, Interface/Class of the bean)
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("footballCoach", Coach.class);
		//below calls a method on the Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		//close out the context at the end
		context.close();
	}

}
