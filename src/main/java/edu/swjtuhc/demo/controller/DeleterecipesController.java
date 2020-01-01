package edu.swjtuhc.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysRecipes;
import edu.swjtuhc.demo.service.DeleterecipesService;
import net.sf.json.JSONObject;



@RestController
@RequestMapping("/recipes")
public class DeleterecipesController {
	@Autowired
	DeleterecipesService deleterecipesService;
	
	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public JSONObject Deleterecipes(@RequestBody SysRecipes recipes) {
		JSONObject result=new JSONObject();
		int i=deleterecipesService.delete(recipes);
		result.put("state",i);
		
		return result;
			}
	@RequestMapping(value = "/managerdelete",method = RequestMethod.POST)
	public JSONObject Managedeleterecipes(@RequestBody SysRecipes recipes) {
		JSONObject result=new JSONObject();
		int j=deleterecipesService.Managedelete(recipes);
		result.put("state",j);
		
		return result;
			}
}
