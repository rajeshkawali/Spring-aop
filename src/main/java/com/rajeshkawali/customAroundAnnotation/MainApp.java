package com.rajeshkawali.customAroundAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rajeshkawali.customAroundAnnotation.ShapeService;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rajeshkawali/customAroundAnnotation/SpringCfg.xml");
		ShapeService shape = context.getBean("shapeBean", ShapeService.class);
		shape.getCircle().setName("Rajesh Here");
		
		shape.getTriangle().getName();
		System.out.println("----------------------------------------");
		shape.getCircle().getName();

	}

}
