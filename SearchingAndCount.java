package closebook;

import java.util.Scanner;

public class SearchingAndCount {

	public static void main(String[] args) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int[] ar= {6,4,5,3,4,2,8};
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==n) {
				++c;
				System.out.print(i+" ");
			}
		}System.out.println();
		if(c==0)
			System.out.println("Number not found");
		else
			System.out.println("Number is found and repeated for "+c+" times");
	}

}
