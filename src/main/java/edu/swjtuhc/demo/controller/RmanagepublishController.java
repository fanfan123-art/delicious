package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysRecipes;
import edu.swjtuhc.demo.service.RmanagepublishService;
import net.sf.json.JSONObject;


//JSON格式数据
//RESTful 风格

@RestController
@RequestMapping("/recipes")
public class RmanagepublishController {
	@Autowired
	RmanagepublishService rmanagepublishService;

	@RequestMapping(value="/managerpublish",method = RequestMethod.POST)
	public JSONObject publish(@RequestBody SysRecipes recipes){	
		JSONObject result=new JSONObject();
		//调用Service层
		int i=rmanagepublishService.publish(recipes);
		result.put("state",i);
		
		return result;
	}
}
