package ass1;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String address;
	public static int count;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		count++;
	}

	public Person() {

	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	public static void count() {
		System.out.println("The numberof Employees is: "+count);
	}

	

}
