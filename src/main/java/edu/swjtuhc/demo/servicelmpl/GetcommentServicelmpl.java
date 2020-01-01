package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.GetcommentMapper;
import edu.swjtuhc.demo.model.Syscomment;
import edu.swjtuhc.demo.service.GetcommentService;

@Service
public class GetcommentServicelmpl implements GetcommentService{
	@Autowired
	GetcommentMapper getcommentMapper;
	
	@Override
	public List<Syscomment>getcommentList(){
		// TODO Auto-generated method stub
		return getcommentMapper.selectAllcomment();
		
	}
	
}
