package edu.swjtuhc.demo.mapper;
import org.apache.ibatis.annotations.Mapper;
import edu.swjtuhc.demo.model.Syscomment;

@Mapper
public interface UserDeletecommentMapper {
	
	public int delete(Syscomment syscomment);

	public int Managedelete(Syscomment syscomment);
	
	
	
}
