package edu.swjtuhc.demo.servicelmpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.swjtuhc.demo.mapper.DeleterecipesMapper;
import edu.swjtuhc.demo.model.SysRecipes;
import edu.swjtuhc.demo.service.DeleterecipesService;


@Service
public class DeleterecipesServicelmpl implements DeleterecipesService{
	@Autowired
	DeleterecipesMapper deleterecipesMapper;
	@Override
	public int delete(SysRecipes recipes) {
		// TODO Auto-generated method stub
		int i=-1;
		return i=deleterecipesMapper.delete(recipes);
	}
	@Override
	public int Managedelete(SysRecipes recipes) {
		// TODO Auto-generated method stub
		int j=-1;
		return j=deleterecipesMapper.Managedelete(recipes);
	}
	

	
}