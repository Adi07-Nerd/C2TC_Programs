package com.tns.framework;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public void bookProduct(float charges) {
		System.out.println("Dear "+this.accNm+" Your Charges are :"+charges+" with Delivery Charges is :"+getDeliveryCharges());	
	}

	@Override
	public String toString() {
		return "NormalAcc ["+this.getAccNm()+"]";
	}
	
}
