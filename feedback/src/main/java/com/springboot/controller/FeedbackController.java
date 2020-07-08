package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.springboot.entity.Feedback;
import com.springboot.service.FeedbackService;

@Controller
public class FeedbackController {
	
	
	
	@GetMapping("/feedback")
	public String feedback(){
		return "feedback";
	}
	
	
	}
	
	


