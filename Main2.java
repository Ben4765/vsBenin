package ass1;

public class Main2 {

	public static void main(String[] args) {
		BankAccount ba= new BankAccount();
		ba.setCustomerName("Sanjay");
		ba.setAccountNumber(826354927);
		ba.setBalance(8434.45);
		//setter is used here to store the data to the private variables
		
		
		System.out.println("Name: "+ba.getCustomerName() + "Account Number: " + ba.getAccountNumber() + "Balance: " + ba.getBalance());
        //getter is used here to return the data set using the setter method		
	}

}
