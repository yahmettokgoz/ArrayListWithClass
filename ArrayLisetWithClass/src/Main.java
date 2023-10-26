import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"Ahmet" , "Tokgöz" ));
		customers.add(new Customer(2,"Bünyamin" , "Batur" ));
		customers.add(new Customer(3,"Barış" , "Kaya" ));
		
		
		
		for(Customer customer:customers) {
			System.out.println(customer.firstName);
		}
		
	}

}
