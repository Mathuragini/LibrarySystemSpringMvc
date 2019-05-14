package com.sgic.library.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sgic.library.model.Classification;
import com.sgic.library.service.ClassificationService;
import com.sgic.library.service.impl.ClassificationServiceImpl;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		ClassificationService classificationService = context.getBean("classificationService",
				ClassificationServiceImpl.class);
		Classification classification = new Classification();
		classification.setClassificationName("maths_ne");
		classificationService.createClassification(classification);
		System.out.println("Save");

	}

}
