package com.sgic.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.library.model.Classification;
import com.sgic.library.service.ClassificationService;

@Controller
public class ClassificationController {
	
	@Autowired 
	private ClassificationService classificationService;
	
	@RequestMapping(value = "/classification", method = RequestMethod.POST)
	public ModelAndView saveClassification(@ModelAttribute("classification")Classification classification, 
	   BindingResult result) {
		classificationService.createClassification(classification);
		System.out.println("maths");
		return new ModelAndView() ;
	
	  
	 }

}
