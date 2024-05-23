package com.acc.lkm.JavaDay1;
public class Car {
	
	String model="";
	String colour="";
	int year;
	Car(String m,String c,int y){
		model=m;
		colour=c;
		year=y;
	}
	public void start() {
		System.out.println("car has started");
	}
	public void stop() {
		System.out.println("var is stopped");
	}
	public void display() {
		System.out.println("car model is: "+model+" car colour is "+colour+" year of manufacture : "+year );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car("ford mustang","yellow",1999);
			car.start();
			car.display();

	}

}
