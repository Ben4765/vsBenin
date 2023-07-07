package assignment;

import java.util.Scanner;

public class Arithmetic {
	
	int add(int a,int b) {
		return(a+b);
	}
	int sub(int a,int b) {
		return(a-b);
	}
	int mul(int a,int b) {
		return(a*b);
	}
	int div(int a,int b) {
		try {
		return(a/b);
		}
		catch(){
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Arithmetic obj=new Arithmetic();
		System.out.println("Enter two numbers to find the sum");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("The sum is "+ obj.add(n, m);
	}

}
