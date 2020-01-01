package edu.swjtuhc.demo.model;

public class Sysmanage {
	String managename;
	String password;
	String number;
	String mname;
	public String getManagename() {
		return managename;
	}
	public void setManagename(String managename) {
		this.managename = managename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Sysmanage [managename=" + managename + ", password=" + password + ", number=" + number + ", mname="
				+ mname + "]";
	}
	
}
