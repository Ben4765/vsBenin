package sample;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num to multiply");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("The multiplication of "+a+","+b+"="+c);

	}

}