package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.Sysmanage;
import edu.swjtuhc.demo.service.GetusermessageService;

@RestController
@RequestMapping("/manage")
public class GetusermessageController {
	@Autowired
	GetusermessageService getusermessageService;
	
	@RequestMapping("/getusermessage")
	public List<SysUser>list(){
		return getusermessageService.getusermessageList();
	}
	
	@RequestMapping("/getmanagemessage")
	public List<Sysmanage>list1(){
		return getusermessageService.getusermessageList1();
	}
}
