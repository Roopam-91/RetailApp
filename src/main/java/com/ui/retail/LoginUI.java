package com.ui.retail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.bean.retail.User;
import com.dao.retail.HibernateUserDao;

public class LoginUI {
	private Properties credentials;
	private HibernateUserDao userDao=new HibernateUserDao();
	public User getLoggedInUser(){
		loadCredentials();
		return getUserBean();
	}
	private void loadCredentials(){
		credentials = new Properties();
		//InputStream inputStream = getClass().getResourceAsStream("src/main/resources/credentials.properties");
		try {
			FileInputStream fis=new FileInputStream("src/main/resources/credentials.properties");
			credentials.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	private User getUserBean(){
		return userDao.findById(Integer.parseInt(credentials.getProperty("userId")));
	}
}
