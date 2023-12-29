package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.LoginDao;
import com.cts.model.Login;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public Login isValidCredentials(String username, String password) {
		// TODO Auto-generated method stub
		return loginDao.isValidCredentials(username, password);
	}

}
