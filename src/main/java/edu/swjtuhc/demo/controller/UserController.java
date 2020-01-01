package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;


//JSON格式数据
//RESTful 风格

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public JSONObject register(@RequestBody SysUser user){	
		JSONObject result=new JSONObject();
		//调用Service层
		int i=userService.register(user);
		result.put("state",i);
		
		return result;
	}
	
}
