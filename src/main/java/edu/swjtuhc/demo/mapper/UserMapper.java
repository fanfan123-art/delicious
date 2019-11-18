package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {
	public List<SysUser> selectAllUsers();
}
