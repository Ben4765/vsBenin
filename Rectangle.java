package sample;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width of Rectangle");
		int w=sc.nextInt();
		System.out.println("Enter the height of Rectangle");
		int h=sc.nextInt();
		int a=w*h;
		System.out.println("The area of Rectangle is "+a);

	}

}
