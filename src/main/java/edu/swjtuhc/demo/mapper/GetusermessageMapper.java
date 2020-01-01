package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.Sysmanage;
@Mapper
public interface GetusermessageMapper {
	public List<SysUser>selectAlluser();
	public List<Sysmanage>selectAllmanage();
}
