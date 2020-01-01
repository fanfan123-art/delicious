package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Syscomment;

@Mapper
public interface GetcommentMapper {
	public List<Syscomment>selectAllcomment();
}
