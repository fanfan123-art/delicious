package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServicelmpl implements UserService{
	@Autowired
	UserMapper userMapper;
	public 
	List<SysUser> getAllUsers(){
		return userMapper.selectAllUsers();
	}
}
