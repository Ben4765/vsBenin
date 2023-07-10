package assignment;

public class recursion {
	int fact(int a) {
		if(a>1)
			return (fact(a-1)*(a));
		else
			return a;
	}

	public static void main(String[] args) {
		recursion obj=new recursion();
		System.out.println(obj.fact(2));
	}

}
