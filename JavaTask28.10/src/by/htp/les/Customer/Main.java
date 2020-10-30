package by.htp.les.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer cust = new Customer(245, "Иванов", "Иван", "Иванович","Красная 1", 1234, 12345678);
		
		CustomerAgregator agr = new CustomerAgregator();
		
		agr.add(cust);
		
		CustomersView view = new CustomersView();
		
		view.print(cust);
		
		agr.getCustomers();
	}

}
