package sample;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int r = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		while(n>0) {
			r=r*10+n%10;
			n/=10;
		}
		System.out.println(r);

	}

}