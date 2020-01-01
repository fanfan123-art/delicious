package edu.swjtuhc.demo.mapper;
import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysRecipes;


@Mapper
public interface DeleterecipesMapper {
	
	public int delete(SysRecipes recipes);

	public int Managedelete(SysRecipes recipes);
	
	
	
}
