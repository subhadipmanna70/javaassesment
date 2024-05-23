package com.acc.lkm.JavaDay2;

public class O2 extends O1{
	public void method(int am) {
		System.out.println("child class "+am);
	}
	public static void main(String args[]) {
		O2 op=new O2();
		op.method(12);
	}

}
