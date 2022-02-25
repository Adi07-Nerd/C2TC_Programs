package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL=3000;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried=" + isSalaried() + ", AccNm="
				+ getAccNm() + ", AccNo=" + getAccNo() + ", AccBal=" + getAccBal();
	}
	
}
