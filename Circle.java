package sample;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of Circle");
		double r=sc.nextDouble();
		double a=Math.PI*(r*r);
		System.out.println("The area of Circle is "+a);

	}

}
