package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Feedback;
import com.springboot.service.FeedbackService;

@RestController
public class FeedbackRest {
	@Autowired
	private FeedbackService service;
	@PostMapping("/feedback")
	
	public String feedback(@RequestParam ("uname")String uname,@RequestParam ("org") String uorg,@RequestParam("country") String ucountry, @RequestParam ("email") String uemail,@RequestParam ("prof") String uprof,@RequestParam ("rating") String urating,@RequestParam ("comments") String ucomments){
		Feedback e = new Feedback(uname, uorg,ucountry,uemail, uprof, urating, ucomments);
			boolean data = service.addFeedback(e);
			
			if(data){
			return "Thank you for your valuable feedback";
			}
			else{
			return "Please try again";
	}

	}
	
}
