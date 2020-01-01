package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysRecipes;

@Mapper
public interface RecipesMapper {
	public List<SysRecipes>selectAllRecipes();
}
