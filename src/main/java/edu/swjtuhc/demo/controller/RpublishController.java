package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysRecipes;
import edu.swjtuhc.demo.service.RpublishService;
import net.sf.json.JSONObject;


//JSON格式数据
//RESTful 风格

@RestController
@RequestMapping("/recipes")
public class RpublishController {
	@Autowired
	RpublishService rpublishService;
	
	
	@RequestMapping(value="/publish",method = RequestMethod.POST)
	public JSONObject register(@RequestBody SysRecipes recipes){	
		JSONObject result=new JSONObject();
		//调用Service层
		int i=rpublishService.publish(recipes);
		result.put("state",i);
		
		return result;
	}
	
}
