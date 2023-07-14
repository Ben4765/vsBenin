package ass1;

public class Exception {

	public static void main(String[] args) {
		Exception.Divide(3, 0);
	}

	static void Divide(int a, int b) {
		double c;
		try {
			c = a / b;
			if (c < 0) {
				throw new ArithmeticException();
			}
			System.out.println(c);
		}

		catch (ArithmeticException e) {
			System.out.println("Enter a value greater than 0");
		}

	}
}
