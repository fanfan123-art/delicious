package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.CommentMapper;
import edu.swjtuhc.demo.model.Syscomment;
import edu.swjtuhc.demo.service.CommentService;

@Service
public class CommentServicelmpl implements CommentService{
	@Autowired
	CommentMapper commentMapper;
	
	
	@Override
	public int publish(Syscomment comment) {
		// TODO Auto-generated method stub
		//调用mapper实现注册	
		int j=-1;
		
		j=commentMapper.insertComment(comment);
		return j;
	}
}
