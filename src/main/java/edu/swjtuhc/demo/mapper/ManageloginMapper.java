package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Sysmanage;

@Mapper
public interface ManageloginMapper {
	public Sysmanage selectUser(String managename,String password);
}
