package com.sgic.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.dao.ClassificationDAO;
import com.sgic.library.model.Classification;
import com.sgic.library.service.ClassificationService;
@Service
public class ClassificationServiceImpl implements ClassificationService {
	
	@Autowired
	private ClassificationDAO classificationDAO;

	public ClassificationDAO getClassificationDAO() {
		return classificationDAO;
	}

	public void setClassificationDAO(ClassificationDAO classificationDAO) {
		this.classificationDAO = classificationDAO;
	}

	public Classification createClassification(Classification classification) {
		
		return classificationDAO.addClassification(classification);
	}

	

}
