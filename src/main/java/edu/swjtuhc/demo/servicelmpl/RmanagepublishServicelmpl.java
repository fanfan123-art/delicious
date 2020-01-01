package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.RmanagepublishMapper;
import edu.swjtuhc.demo.model.SysRecipes;
import edu.swjtuhc.demo.service.RmanagepublishService;

@Service
public class RmanagepublishServicelmpl implements RmanagepublishService{
	@Autowired
	RmanagepublishMapper rmanagepublishMapper;
	
	public int publish(SysRecipes recipes) {
		// TODO Auto-generated method stub
		//调用mapper实现注册
		SysRecipes u0=rmanagepublishMapper.selectByRecipesName(recipes.getRecipesName());
		int i=-1;
		if(u0==null) {
		
			i=rmanagepublishMapper.insertUser(recipes);
		}else {
			i=2;
		}
		return i;
	}
}
