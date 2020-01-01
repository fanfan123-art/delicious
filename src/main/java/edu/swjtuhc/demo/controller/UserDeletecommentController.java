package edu.swjtuhc.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import edu.swjtuhc.demo.model.Syscomment;
import edu.swjtuhc.demo.service.UserDeletecommentService;
import net.sf.json.JSONObject;



@RestController
@RequestMapping("/comment")
public class UserDeletecommentController {
	@Autowired
	UserDeletecommentService userDeletecommentService;
	
	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public JSONObject Deletecomment(@RequestBody Syscomment syscomment) {
		JSONObject result=new JSONObject();
		int i=userDeletecommentService.delete(syscomment);
		result.put("state",i);
		
		return result;
			}
	@RequestMapping(value = "/managerdelete",method = RequestMethod.POST)
	public JSONObject Managedeletecomment(@RequestBody Syscomment syscomment) {
		JSONObject result=new JSONObject();
		int j=userDeletecommentService.Managedelete(syscomment);
		result.put("state",j);
		
		return result;
			}
}
