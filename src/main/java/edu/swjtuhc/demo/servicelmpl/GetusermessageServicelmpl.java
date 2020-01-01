package edu.swjtuhc.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.GetusermessageMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.Sysmanage;
import edu.swjtuhc.demo.service.GetusermessageService;

@Service
public class GetusermessageServicelmpl implements GetusermessageService{
	@Autowired
	GetusermessageMapper getusermessageMapper;

	@Override
	public List<SysUser> getusermessageList() {
		// TODO Auto-generated method stub
		return getusermessageMapper.selectAlluser();
	}

	@Override
	public List<Sysmanage> getusermessageList1() {
		// TODO Auto-generated method stub
		return getusermessageMapper.selectAllmanage();
	}

	
	
}
