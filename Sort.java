package closebook;

public class Sort {

	public static void main(String[] args) {
		int[] ar= {6,4,5,3,7,2,8};;
		for(int j=0;j<(ar.length-1);j++) {
			int i=1;
			for(i=1;i<ar.length;i++) {
				int a=ar[j];
				int b=ar[i];
				if(a>b) {
					int t=ar[j];
					ar[j]=b;
					ar[i]=t;
				}
			}
		}
		for(int i:ar) {
			System.out.println(i);
		}
	}
}
