package ass1;

import java.util.Scanner;

public abstract class Shape {
	abstract void calculateArea();

	static Scanner s = new Scanner(System.in);
}

class Rectangle extends Shape {
	@Override
	public void calculateArea() {

		System.out.println("Enter the length of the rectangle");
		int length = s.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int breadth = s.nextInt();
		double area = length * breadth;
		System.out.println("The area of the rectangle is :" + area);

	}

}

class Circle extends Shape {
	@Override
	public void calculateArea() {

		System.out.println("ENter the radius");
		int radius = s.nextInt();
		double area = Math.PI * (radius * radius);
		System.out.println("The area of the circle is :" + area);
	}

}
