package ass1;

public class Main1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Ben");
		p.setAddress("navalur");
		p.setAge(20);
		System.out.println("Name: " + p.getName() + " " + p.getAge() + " " + p.getAddress());

			Person p1 = new Person("Sanjay", 20, "CPT");
			Person p2 = new Person("Hari", 20, "Mahabalipuram");
			Person p3 = new Person("Priya", 20, "Ambatur");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		Employee em = new Employee();
		System.out.println(em.employeeId);
		System.out.println(em.getAddress());
		Person.count();
	}

}
