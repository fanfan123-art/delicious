package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysRecipes;

@Mapper
public interface RpublishMapper {
	public SysRecipes selectByRecipesName(String recipesName);
	public int insertUser(SysRecipes recipes);
}
