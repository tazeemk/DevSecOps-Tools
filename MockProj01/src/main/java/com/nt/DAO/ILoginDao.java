package com.nt.DAO;

public interface ILoginDao {

     public int authinticate(String username,String password);
	
	public String AddUser(String username,String role);
	
}
