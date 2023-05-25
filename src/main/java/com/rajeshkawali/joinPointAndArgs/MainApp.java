package com.rajeshkawali.joinPointAndArgs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajeshkawali.joinPointAndArgs.ShapeService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rajeshkawali/joinPointAndArgs/SpringCfg.xml");
		ShapeService shape = context.getBean("shapeBean", ShapeService.class);

		shape.getCircle().setName("---Setting from MainApp for args() expression---");
		System.out.println("-------Triangle Name-------" + shape.getTriangle().getName());
		//System.out.println("-------Circle Name---------" + shape.getCircle().getName());

	}

}
