package com.tns.framework;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalaried);
	public CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit);
}
