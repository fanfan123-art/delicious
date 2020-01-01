package edu.swjtuhc.demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UsermessageService;
import net.sf.json.JSONObject;



@RestController
@RequestMapping("/user")
public class UsermessageController {



	@Autowired
	UsermessageService usermessageService;
	
	@RequestMapping(value = "/usermessage",method = RequestMethod.POST)

	
	public JSONObject login(@RequestBody SysUser sysUser) {
		JSONObject result=new JSONObject();
		SysUser user1=usermessageService.selectUser(sysUser.getUsername());
		System.out.println(user1);
		if (user1==null) {
			result.put("mistake", "用户不存在！");
			return result;
		}else {
			result.put("success", "查询成功！");
			return result;
		}
	}
}
