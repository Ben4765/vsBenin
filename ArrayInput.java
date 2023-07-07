package sample;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[5];
		for(int i=0;i<10;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println(ar[2]);
	}
}
