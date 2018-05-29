package com.kavi.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]) {
		System.out.println("Before configuring application context");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DiscussThrowCoach coach = context.getBean("discussThrowCoach", DiscussThrowCoach.class);
		System.out.println(coach.getDailyWorkouts());
		context.close();
	}

}
