package sample;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the width of triangle");
		int w=sc.nextInt();
		System.out.println("Enter the height of triangle");
		int h=sc.nextInt();
		int a=(w*h)/2;
		System.out.println("The area of triangle is "+a);

	}

}
