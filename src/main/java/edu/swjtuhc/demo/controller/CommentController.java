package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.swjtuhc.demo.model.Syscomment;
import edu.swjtuhc.demo.service.CommentService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	CommentService commentservice;
	
	
	@RequestMapping(value="/publish",method = RequestMethod.POST)
	public JSONObject publish(@RequestBody Syscomment comment){	
		JSONObject result=new JSONObject();
		//调用Service层
		int j=commentservice.publish(comment);
		result.put("state",j);
		
		return result;
	}
}
