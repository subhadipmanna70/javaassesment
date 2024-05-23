package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class Book {
	String author="";
	String title="";
	int year;
	Book(String title,String author,int year){
		this.title=title;
		this.author=author;
		this.year=year;
	}
	void display() {
		System.out.println("Author name: "+author+"\n"+"Book title: "+title+"\n"+"publication year: "+year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter title");
		String title=sc.nextLine();
		System.out.println("Enter author name");

		String author=sc.nextLine();
		System.out.println("Enter year");

		int year=sc.nextInt();
Book b=new Book(title,author,year);
b.display();
	}

}
