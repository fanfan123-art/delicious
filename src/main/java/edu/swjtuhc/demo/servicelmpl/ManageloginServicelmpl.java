package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ManageloginMapper;
import edu.swjtuhc.demo.model.Sysmanage;
import edu.swjtuhc.demo.service.ManageloginService;

@Service
public class ManageloginServicelmpl implements ManageloginService{
	@Autowired
	ManageloginMapper manageloginMapper;
	public Sysmanage selectUser(String managename, String password) {
		// TODO Auto-generated method stub
		System.out.println(managename+" "+managename);
		return manageloginMapper.selectUser(managename,password);
	}
}
