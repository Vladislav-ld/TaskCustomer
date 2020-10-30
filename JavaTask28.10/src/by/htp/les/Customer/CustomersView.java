package by.htp.les.Customer;

public class CustomersView {
	
	public void print(Customer s) {
		
			System.out.println("Id : " + s.getId());
			
			System.out.println("LastName : " + s.getLastName());
			
			System.out.println("Name : " + s.getName());
			
			System.out.println("MiddleNAme : " + s.getMiddleName());
			
			System.out.println("Adress : " + s.getAdress());
			
			System.out.println("NumBank : " + s.getNumBank());
			
			System.out.println("NumCard : " + s.getNumCard());
	
	}
}
