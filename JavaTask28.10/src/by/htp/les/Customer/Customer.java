package by.htp.les.Customer;

public class Customer {

	private int Id;
	private String LastName;
	private String Name;
	private String MiddleName;
	private String Adress;
	private int NumCard;
	private int NumBank;
	
	public Customer(int id, String lastName, String name, String middleName, String adress, int numCard, int numBank) {
		Id = id;
		LastName = lastName;
		Name = name;
		MiddleName = middleName;
		Adress = adress;
		NumCard = numCard;
		NumBank = numBank;
	}
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getMiddleName() {
		return MiddleName;
	}
	
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	
	public String getAdress() {
		return Adress;
	}
	
	public void setAdress(String adress) {
		Adress = adress;
	}
	
	public int getNumCard() {
		return NumCard;
	}
	
	public void setNumCard(int numCard) {
		NumCard = numCard;
	}

	public int getNumBank() {
		return NumBank;
	}

	public void setNumBank(int numBank) {
		NumBank = numBank;
	}
	
	public String toString() {
		return Id + " " + LastName + " " + Name + " " + MiddleName + " " + Adress + " " + NumCard +	" " + NumBank;
	}

}
