package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.springboot.entity.Feedback;

@Service
public class FeedbackService {
	
	@Autowired
	private MyRepo myrepo;
	
	public boolean addFeedback(Feedback f){
		
		myrepo.save(f);
		return true;
	}

}
