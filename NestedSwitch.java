package sample;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		switch(n) {
			case 1:{
				System.out.println("One");
				break;
			}
			case 2:{
				System.out.println("Two");
				int m=sc.nextInt();
				switch(m) {
					case 1:{
						System.out.println("1");
						break;
					}
					case 2:{
						System.out.println("2");
						break;
					}
				}break;
			}
		}
	}
}
