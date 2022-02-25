package com.tns.framework;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL=5000.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public void withdraw(float amount) {
		float diffBal=this.getAccBal()-amount;
		if(diffBal >= getMinbal()) {
			this.setAccBal(diffBal);
			System.out.println("Transaction Successful");
		}
		else
			System.out.println("Unsuccessful your account balance will go "+diffBal+" which is less than"+getMinbal());
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getMinbal() {
		return MINBAL;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", isSalaried()=" + isSalaried() + ", getAccNm()=" + getAccNm()
				+ ", getAccNo()=" + getAccNo() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
