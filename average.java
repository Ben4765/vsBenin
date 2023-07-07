package closebook;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		int s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of digits");
		int n=sc.nextInt();
		System.out.println("Enter the values");
		for(int i=0;i<n;i++) {
			s=s+sc.nextInt();
		}
		s=s/n;
		System.out.println("The average is "+s);
	}

}
