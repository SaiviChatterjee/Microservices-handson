package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.models.Loan;

@RestController
public class LoanController {
	@GetMapping("/loans/{number}")
	private Loan getLoan(@PathVariable String number) {
		Loan loan=new Loan(number,"car",400000,3258,18);
		return loan;
	}
}
