package com.acc.lkm.JavaDay1;

public class EncapsulationDemo {
	
	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getOTP() {
		return OTP;
	}

	public void setOTP(int oTP) {
		OTP = oTP;
	}

	private String account_holder;
	private int CVV;
	private double balance;
	private int OTP;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo encap=new EncapsulationDemo();
		encap.setAccount_holder("Roni");
		encap.setBalance(10000);
		encap.setCVV(677);
		encap.setOTP(1999);
		System.out.println(encap.getAccount_holder()+" "+
		encap.getBalance()+" "+
		encap.getCVV()+" "+
		encap.getOTP());

	}

}
