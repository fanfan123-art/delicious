package edu.swjtuhc.demo.servicelmpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UsermessageMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UsermessageService;

@Service
public class UsermessageServicelmpl implements UsermessageService{
	@Autowired
	UsermessageMapper usermessageMapper;
	
	@Override
	public SysUser selectUser(String username) {
		// TODO Auto-generate method stub
		System.out.println(username+" "+username);
		return usermessageMapper.selectUser(username);
	}
}