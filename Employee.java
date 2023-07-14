package ass1;

public class Employee extends Person{
	String employeeId;
	double salary;
	@Override
	public String getName() {
		
		return super.getName();
	}
	@Override
	public int getAge() {
		
		return super.getAge();
	}
	@Override
	public String getAddress() {
		
		return super.getAddress();
	}
	public Employee(){
		
	}
	public Employee( String employeeId, double salary) {
		this.employeeId = employeeId;
		this.salary = salary;
	} 
	
	
	
	
}
