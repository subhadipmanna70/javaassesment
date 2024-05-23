package com.acc.lkm.JavaDay1;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+" is leapyear");
		}
		else {
			System.out.println(year+" is not leapyear");

		}

	}

}
