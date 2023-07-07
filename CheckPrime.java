package sample;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(n==1||n==2)
			System.out.println("prime number");
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0)
					System.out.println("Not a prime number");
				else
					System.out.println("prime number");
				break;
			}
		}
	}
}
