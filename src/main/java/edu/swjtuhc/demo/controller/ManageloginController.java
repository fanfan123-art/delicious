package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.swjtuhc.demo.model.Sysmanage;
import edu.swjtuhc.demo.service.ManageloginService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/manage")
public class ManageloginController {
	@Autowired
	ManageloginService manageloginService;
		
		@RequestMapping(value="/login",method = RequestMethod.POST)
		
		public JSONObject login(@RequestBody Sysmanage sysmanage) {
			JSONObject result=new JSONObject();
			Sysmanage user1=manageloginService.selectUser(sysmanage.getManagename(),sysmanage.getPassword());
			System.out.println(user1);
			if (user1==null) {
				result.put("mistake", "密码和用户名错误！");
				return result;
			}else {
				result.put("success", "登入成功");
				return result;
			}
		}
}
