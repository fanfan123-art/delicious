package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Syscomment;
import edu.swjtuhc.demo.service.GetcommentService;

@RestController
@RequestMapping("/comment")
public class GetcommentController {
	@Autowired
	GetcommentService getcommentService;
	
	@RequestMapping("/list")
	public List<Syscomment>list(){
		return getcommentService.getcommentList();
	}
}
