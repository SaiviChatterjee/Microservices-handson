package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.models.Account;

@RestController
public class AccountController {
	@GetMapping("/accounts/{number}")
	public Account getAccount(@PathVariable String number) {
		Account account=new Account(number,"savings",234343);
		return account;
	}
}
