package sample;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of Square");
		int s=sc.nextInt();
		int a=s*s;
		System.out.println("The area of Square is "+a);

	}

}
