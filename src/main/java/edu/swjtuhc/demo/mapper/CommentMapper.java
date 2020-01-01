package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import edu.swjtuhc.demo.model.Syscomment;

@Mapper
public interface CommentMapper {
	public  int insertComment(Syscomment comment);
}
