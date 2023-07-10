package assignment;

import java.util.Scanner;

public class Aithmetic {
	
	int add(int a,int b) {
		return(a+b);
	}
	int sub(int a,int b) {
		return(a-b);
	}
	int mul(int a,int b) {
		return(a*b);
	}
	double div(int a,int b) {
		return(a/b);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Aithmetic obj=new Aithmetic();
		System.out.println("Enter two numbers to find the sum");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("The sum is "+obj.add(m, n));
		System.out.println("Enter two numbers to find the difference");
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("The difference is "+obj.sub(m, n));
		System.out.println("Enter two numbers to find the product");
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("The product is "+obj.mul(m, n));
		System.out.println("Enter two numbers to find the quotient");
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("The quotient is "+obj.div(m, n));
	}

}
