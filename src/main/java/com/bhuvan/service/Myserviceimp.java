package com.bhuvan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhuvan.entity.SdfcBank;
import com.bhuvan.repo.MyRepo;

@Service
public class Myserviceimp  implements Myservice  {

	
	@Autowired
	private MyRepo repo;
	
	
	
	@Override
	public SdfcBank saveCustomerdetails(SdfcBank bank) {
		
		return repo.save(bank);
	}



	@Override
	public SdfcBank showBalance(int acno) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public SdfcBank depositAmount(int acno) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public SdfcBank withdrawAmount(int acno) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public SdfcBank transferAmount(int acno) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public SdfcBank closeAccount(int acno) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
