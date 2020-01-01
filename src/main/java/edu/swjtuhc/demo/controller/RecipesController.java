package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysRecipes;
import edu.swjtuhc.demo.service.RecipesService;

@RestController
@RequestMapping("/recipes")
public class RecipesController {
	
	@Autowired
	RecipesService recipesService;
	
	@RequestMapping("/list")
	public List<SysRecipes>list(){
		return recipesService.getRecipesList();
	}
}
