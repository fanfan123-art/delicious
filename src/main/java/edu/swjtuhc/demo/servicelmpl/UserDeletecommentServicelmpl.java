package edu.swjtuhc.demo.servicelmpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.swjtuhc.demo.mapper.UserDeletecommentMapper;
import edu.swjtuhc.demo.model.Syscomment;
import edu.swjtuhc.demo.service.UserDeletecommentService;


@Service
public class UserDeletecommentServicelmpl implements UserDeletecommentService{
	@Autowired
	UserDeletecommentMapper userDeletecommentMapper;
	@Override
	public int delete(Syscomment syscomment) {
		// TODO Auto-generated method stub
		int i=-1;
		return i=userDeletecommentMapper.delete(syscomment);
	}
	@Override
	public int Managedelete(Syscomment syscomment) {
		// TODO Auto-generated method stub
		int j=-1;
		return j=userDeletecommentMapper.Managedelete(syscomment);
	}
	

	
}