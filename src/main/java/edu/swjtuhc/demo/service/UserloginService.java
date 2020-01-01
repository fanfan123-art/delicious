package edu.swjtuhc.demo.service;



import edu.swjtuhc.demo.model.SysUser;

public interface UserloginService {

	public SysUser selectUser(String username, String password);
	
}
