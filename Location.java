package closebook;

import java.util.Scanner;

public class Location {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int[] ar= {6,4,5,3,7,2,8};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==n)
				System.out.println(i);
			
		}
	}
}
