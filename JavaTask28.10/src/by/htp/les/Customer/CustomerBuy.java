package by.htp.les.Customer;

import java.util.List;

public class CustomerBuy {
	public void print(CustomerAgregator s) {
		CustomersView v = new CustomersView();
		
		for( int i = 0; i < s.size() ; i++) {
			View(s.getCustomers(i));
		}
	}

}
