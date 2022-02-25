package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [CreditLimit=" + getCreditLimit() + ", AccNm=" + getAccNm() 
		+ ", AccNo=" + getAccNo() + ", AccBal=" + getAccBal() + "]";
	}
}
