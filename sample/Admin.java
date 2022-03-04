package com.sirius.sample;



public class Admin{
	String adminname;
	int password;
	public Admin() {}
	public Admin(String adminname, int password) {
		super();
		this.adminname = adminname;
		this.password = password;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
}