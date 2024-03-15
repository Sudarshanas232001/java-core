package com.learning.core.day10;

import java.util.regex.*;
import java.util.regex.Pattern;

class D10P10 {

	public static void main(String[] args) {
		
	}

}

class UserProfile
{
	public boolean validateUsername(String name)
	{
		return Pattern.matches("^[a-zA-Z]+$", name);
	}
	public boolean validatePassword(String password)
	{
		return password.length() == 8 
				&& password.matches(".*[a-zA-Z].*") 
				&& password.matches(".*\\d.*");
	}
}