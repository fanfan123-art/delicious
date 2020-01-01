package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.RecipesMapper;
import edu.swjtuhc.demo.model.SysRecipes;
import edu.swjtuhc.demo.service.RecipesService;

@Service
public  class RecipesServicelmpl implements RecipesService{
	@Autowired
	RecipesMapper recipesMapper;

	@Override
	public List<SysRecipes> getRecipesList() {
		// TODO Auto-generated method stub
		return recipesMapper.selectAllRecipes();
	}
	}
