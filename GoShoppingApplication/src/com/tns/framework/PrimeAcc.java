package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
	}

	public boolean isPrime() {
		return isPrime;
	}


	
	@Override
	public void bookProduct(float charges) {
		System.out.println("Dear Prime User, Your Charges are :"+charges);
	}

	@Override
	public String toString() {
		return "PrimeAcc [ "+this.getAccNm()+"]";
	}

	
}
