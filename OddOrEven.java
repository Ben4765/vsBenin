package sample;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		System.out.println("Enter the number to check");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0) 
			System.out.println("It is an Even number");
		else
			System.out.println("It is an odd number");
	}

}
