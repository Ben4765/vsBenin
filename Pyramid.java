package sample;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		int n=1,row=6;
		for(int c=1;c<=row;c++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	} 
}
