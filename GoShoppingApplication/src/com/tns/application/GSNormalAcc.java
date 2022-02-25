package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+this.accNm+" Your Charges are :"+charges+" with Delivery Charges is :"+getDeliveryCharges());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
