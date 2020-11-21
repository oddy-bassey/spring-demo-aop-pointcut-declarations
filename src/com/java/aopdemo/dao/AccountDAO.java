package com.java.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount(Account account, boolean flag) {
		System.out.println(getClass()+"adding an account \n");
	}
	
	public String personAccount() {
		return "@revoltcode";
	}
}
