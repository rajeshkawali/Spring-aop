package com.rajeshkawali.afterThrowing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajeshkawali.afterThrowing.ShapeService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rajeshkawali/afterThrowing/SpringCfg.xml");
		ShapeService shape = context.getBean("shapeBean", ShapeService.class);
		shape.getTriangle().setName("Rajesh Here");
		shape.getCircle().setNameReturn("Rajesh name return...");
		System.out.println("-------Triangle Name-------" + shape.getTriangle().getName());
		//System.out.println("-------Circle Name---------" + shape.getCircle().getName());

	}

}
