package com.gl.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appCont.xml");
			
			SportsCoach spcoach = ctx.getBean("cricketCoach",SportsCoach.class);
			System.out.println("The timing is : "+spcoach.GetTrainingSchedule());
		} 
	

}
