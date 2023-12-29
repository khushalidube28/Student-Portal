package com.cts.dao;

import com.cts.model.Login;

public interface LoginDao {
	Login isValidCredentials(String username,String password);

}
