package com.cts.service;

import com.cts.model.Login;

public interface LoginService {
	Login isValidCredentials(String username,String password);
}
