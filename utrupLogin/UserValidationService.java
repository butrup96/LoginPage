package com.utrupLogin;

public class UserValidationService {
	public boolean isUserValid(String user, String password){
		if (user.equals("Brandon") && password.equals("dummy"))
			return true;
		
		return false;
	}//isUserValid
}//UserValidationService
