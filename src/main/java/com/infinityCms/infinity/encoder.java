package com.infinityCms.infinity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class encoder {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String pass = "admin";
		String encodedPassword = encoder.encode(pass);
		
		System.out.println(encodedPassword);

	}

}
