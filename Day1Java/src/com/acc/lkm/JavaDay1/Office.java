package com.acc.lkm.JavaDay1;

public class Office {
	String name="John";
	String role="OPLead";
	
	public void phoneNo(long n1) {
		System.out.println("Name: "+name+" role: "+role+" sim1: "+n1);
		
	}
	public void phoneNo(long n1,long n2) {
		System.out.println("Name: "+name+" role: "+role+" sim1: "+n1+" sim2: "+n2);;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Office of=new Office();
		of.phoneNo(9874497800L);
		of.phoneNo(9874497800L,7003020091L);

	}

}
