package com.sgic.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.library.model.Classification;

@Service
public interface ClassificationService {
	
	public abstract Classification createClassification(Classification classification);
//	public Classification updateClassification(Classification classification);
//	public List<Classification> listClassification();
//	public Classification getClassificationById(Integer classificationId);
//	public Classification Deleteclassification(Integer classificationId);

}
