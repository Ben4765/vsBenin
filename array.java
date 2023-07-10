package assignment;

import java.util.Scanner;

public class array {
	
	void display(int a[]){
		System.out.print("The elements in array are: ");
		for(int i:a) 
			System.out.print(i+" ");
		System.out.println("");
	}
	void average(int a[]) {
		int s=0,c=0;
		for(int i:a) {
			s+=i;
			++c;
		}
		System.out.println("The average of elements is "+(s/c));
	}
	void maxmin(int a[]) {
		int max=a[0], min=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]){
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("The max value is "+max+" and the min value is "+ min);
	}
	void sort(int a[]) {
		System.out.println("The sorted array is");
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				int t=0;
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
			}
		System.out.println("");
		}
	void search(int a[],int b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				System.out.println("Value found in "+i+" index");
				break;}
			else {
				System.out.println("Value not found!");
				break;}
		}
	}
	
	void mod(int a[], int b, int c){
		a[b]=c;
		System.out.println("The new array values are \n");
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		array obj=new array();
		int ar[]=new int[5];
		System.out.println("Enter the elements");
		for(int i=0;i<5;i++) {
			ar[i]=sc.nextInt();		
		}
		obj.display(ar);
		obj.average(ar);
		obj.maxmin(ar);
		obj.sort(ar);
		System.out.println("Enter a value to search");
		int n=sc.nextInt();
		obj.search(ar, n);
		System.out.println("Enter the index and the value to be replced");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		obj.mod(ar, n1, n2);
		
	}

}
