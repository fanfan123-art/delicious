package edu.swjtuhc.demo.model;

public class SysUser {
	
	 String email;
	 String password;
	 String username;
	 String number;
	 String registertime;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getRegistertime() {
		return registertime;
	}
	public void setRegistertime(String registertime) {
		this.registertime = registertime;
	}
	@Override
	public String toString() {
		return "SysUser [email=" + email + ", password=" + password + ", username=" + username + ", number=" + number
				+ ", registertime=" + registertime + "]";
	}
	
	
	

}
