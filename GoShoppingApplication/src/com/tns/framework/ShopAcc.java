package com.tns.framework;

public class ShopAcc {
	protected int accNo;           //changes private to protected
	protected String accNm;         //changes private to protected
	private float charges;
	
	
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}	
	
	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

	public void bookProduct(float charges)
	{
		System.out.println("Product booked and charges are: "+charges);
	}
	
	public void items(float charges)
	{
		System.out.println("Your account is created with Charges of rupess :"+charges);
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
}

