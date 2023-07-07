package closebook;

import java.util.Scanner;

public class MarkList {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Students");
		int n=sc.nextInt();
		int[] no=new int[n];
		int[] mark=new int[n];
		System.out.println("Enter the Marks of Students");
		for(int i=0;i<n;i++) {
			no[i]=i+1;
			mark[i]=sc.nextInt();
			}
		for(int m:mark) {
			sum+=m;
		}System.out.println(sum);
	}

}
