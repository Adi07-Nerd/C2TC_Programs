package com.tns.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float  creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	
	public float getCreditLimit() {
		return creditLimit;
	}


	@Override
	public void withdraw(float amount) {
		//here should have setAmount method to increase amount as per perticular  speed
				if(this.getCreditLimit() > amount)
				{
					
					this.setAccBal(this.getAccBal()-amount);
					System.out.println("Amount Credited");
					
				}
				else
					System.out.println("Your can borrow money more than "+this.getCreditLimit());
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}
