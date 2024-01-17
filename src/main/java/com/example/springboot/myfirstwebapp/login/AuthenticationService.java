package com.example.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service

public class AuthenticationService {
	
	public boolean authenticate(String name, String password) {
		boolean isName=name.equalsIgnoreCase("Pushpendra");
		boolean isPass= password.equalsIgnoreCase("12345");
		return isName && isPass;
	}

}
