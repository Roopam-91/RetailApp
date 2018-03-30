package com.startup.retail;

import com.ui.retail.LoginUI;

public class Startup {
	
	public static void main(String[] args){
		LoginUI credentials=new LoginUI();
		System.out.println(credentials.getLoggedInUser());
	}	
	
	
}
