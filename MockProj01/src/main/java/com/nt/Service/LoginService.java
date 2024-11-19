package com.nt.Service;

import com.nt.DAO.ILoginDao;

public class LoginService implements ILoginSerive {

private ILoginDao dao;


public LoginService(ILoginDao dao) {
	this.dao=dao;
}


@Override
public String login(String uname, String pwd) {
	if(uname.equals(" ")||pwd.equals(""))
		throw new IllegalArgumentException("Invalid ");
       int count = dao.authinticate(uname, pwd);
       if(count==1)
    	   return "Valid Credentials";
       else
       return "Invalid Credentials :";
}


@Override
public String RegisterUser(String uname, String role) {
	
	if(!uname.equalsIgnoreCase("")|| !role.equalsIgnoreCase(""))
	{ dao.AddUser(uname, role);
	 return "user Added ";
	}else {
	return "Sorry User Not Added :";
	}
	}	
	
	


}
