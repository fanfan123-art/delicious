package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserloginService;
import net.sf.json.JSONObject;


@RestController
@RequestMapping("/user")
	
public class UserloginController {
	@Autowired
	UserloginService userloginService;
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	
	public JSONObject login(@RequestBody SysUser sysUser) {
		JSONObject result=new JSONObject();
		SysUser user1=userloginService.selectUser(sysUser.getUsername(),sysUser.getPassword());
		System.out.println(user1);
		if (user1==null) {
			result.put("msg", "密码和账户错误！");
			return result;
		}else {
			result.put("msg", "登入成功");
			return result;
		}
	}
}
