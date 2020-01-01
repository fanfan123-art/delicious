package edu.swjtuhc.demo.model;

import java.util.Date;

public class Syscomment {
	int RID;
	int CID;
	int uid;
	String username;
	String Ccontent;	
	Date Ctime;
	public int getRID() {
		return RID;
	}
	public void setRID(int rID) {
		RID = rID;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCcontent() {
		return Ccontent;
	}
	public void setCcontent(String ccontent) {
		Ccontent = ccontent;
	}
	public Date getCtime() {
		return Ctime;
	}
	public void setCtime(Date ctime) {
		Ctime = ctime;
	}
	public int getCID() {
		return CID;
	}
	public void setCID(int cID) {
		CID = cID;
	}
	@Override
	public String toString() {
		return "Syscomment [RID=" + RID + ", CID=" + CID + ", uid=" + uid + ", username=" + username + ", Ccontent="
				+ Ccontent + ", Ctime=" + Ctime + "]";
	}
	
	
	
	
}
