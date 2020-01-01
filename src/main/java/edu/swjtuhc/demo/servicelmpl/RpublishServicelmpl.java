package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.RpublishMapper;
import edu.swjtuhc.demo.model.SysRecipes;
import edu.swjtuhc.demo.service.RpublishService;

@Service
public class RpublishServicelmpl implements RpublishService{
	@Autowired
	RpublishMapper rpublishMapper;
	
	@Override
	public int publish(SysRecipes recipes) {
		// TODO Auto-generated method stub
		//调用mapper实现注册
		SysRecipes u0=rpublishMapper.selectByRecipesName(recipes.getRecipesName());
		int i=-1;
		if(u0==null) {
		
			i=rpublishMapper.insertUser(recipes);
		}else {
			i=2;
		}
		return i;
	}
}
