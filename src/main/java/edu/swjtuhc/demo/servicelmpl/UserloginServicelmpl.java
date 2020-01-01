package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserloginMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserloginService;

@Service
public class UserloginServicelmpl implements UserloginService{

	@Autowired
	UserloginMapper userloginMapper;
	public SysUser selectUser(String username, String password) {
		// TODO Auto-generate method stub
		System.out.println(username+" "+username);
		return userloginMapper.selectUser(username,password);
	}
}
