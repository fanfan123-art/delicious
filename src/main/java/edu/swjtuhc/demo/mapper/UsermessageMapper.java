package edu.swjtuhc.demo.mapper;





import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UsermessageMapper {
	
	public SysUser selectUser(String username);
	
}
