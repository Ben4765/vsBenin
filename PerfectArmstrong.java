package closebook;

import java.util.Scanner;

public class PerfectArmstrong {

	public static void main(String[] args) {
		int s=0;int n1,n2,n3,r=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check");
		int n=sc.nextInt();
		n1=n2=n3=n;
		while(n1>0) {
			int d=n1%10;
			s+=d*d*d;
			n1/=10;
		}
		if(s==n) {
			System.out.println("It is an Armstrong number");
		}
		while(n2>0) {
			r=r*10+n2%10;
			n2/=10;
		}
		if(r==n) {
			System.out.println("It is a Palindrome number");
		}
		s=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				s+=i;
			}
			}
		if(s==n) {
			System.out.println("It is a Perfect number");
		}
	}

}
