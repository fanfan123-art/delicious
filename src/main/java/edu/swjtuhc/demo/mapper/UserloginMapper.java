package edu.swjtuhc.demo.mapper;


import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserloginMapper {

	public SysUser selectUser(String username,String password);
	
}


