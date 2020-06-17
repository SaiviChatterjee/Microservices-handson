package com.cognizant.models;

public class Account {
	private String number;
	private String type;
	private float balance;
	public Account() {
		super();
	}
	public Account(String number, String type, float balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", type=" + type + ", balance=" + balance + "]";
	}
}
