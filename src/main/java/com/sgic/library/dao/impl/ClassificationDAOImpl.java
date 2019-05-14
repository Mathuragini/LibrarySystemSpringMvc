package com.sgic.library.dao.impl;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sgic.library.dao.ClassificationDAO;
import com.sgic.library.model.Classification;

@Repository
@Transactional
public class ClassificationDAOImpl implements ClassificationDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	public Classification addClassification(Classification classification) {
		
		hibernateTemplate.save(classification);
		System.out.println("Saved");
		return null;
	}

	
}
