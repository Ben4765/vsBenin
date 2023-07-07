package sample;

import java.util.Scanner;

public class QndR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num to find quotient");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int q=a/b;
		int r=a%b;
		System.out.println("The quotient of "+a+","+b+"="+q);
		System.out.println("The Reminder of "+a+","+b+"="+r);

	}

}