package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Sysmanage;

public interface ManageloginService {

	public Sysmanage selectUser(String managename, String password);
	
}
