package com.bhuvan.service;

import com.bhuvan.entity.SdfcBank;

public interface Myservice {

	public SdfcBank saveCustomerdetails(SdfcBank bank);
	public SdfcBank showBalance(int acno);
	public SdfcBank depositAmount(int acno);
	public SdfcBank withdrawAmount(int acno);
	public SdfcBank transferAmount(int acno);
	public SdfcBank closeAccount(int acno);
	
}
