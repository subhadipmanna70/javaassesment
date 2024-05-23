package com.acc.lkm.JavaDay2;
import java.util.Date;
public class PaymentMode {
	public String process_payment(Date payment,String mode1,String mode2) {
		String dt=String.valueOf(payment);
		return mode1 +"/n"+ mode2 +"/n"+ dt;
	}
	public String process_payment(Date payment,String mode1,String mode2,String mode3) {
		String dt=String.valueOf(payment);

		return mode1 +"/n"+ mode2 +"/n"+ mode3+"/n"+ dt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMode paymentMode=new PaymentMode();
		System.out.println(paymentMode.process_payment(new Date(),"Credit card","Debit card"));
		System.out.println(paymentMode.process_payment(new Date(),"Credit card","Debit card","Digital payment gateway"));

	}

}
