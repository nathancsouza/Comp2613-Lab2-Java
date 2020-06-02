package a01164474.io;

import a01164474.data.Customer;

/**
 * Project: lab2
 * @author Nathan de Souza - A01164474
 */
public class CustomerReport {

	public CustomerReport() {}
	
	public void displayReport(Customer[] listOfCustomers) {
		//HEAD OF THE REPORT
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.format("%2s %-6s %-15s %-15s %-25s %-15s %-15s %-15s %-20s\n", "#.", "ID", "First Name", "Last Name", "Street", "City",
				"Postal Code", "Phone", "Email");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------");
		//DATA FROM CUSTOMERS
		int counter = 1;
		for (Customer i : listOfCustomers) {
			System.out.format("%-3s %-5s %-15s %-15s %-25s %-15s %-15s %-15s %-20s\n", counter++ + ".", i.getId(), i.getFirstName(), i.getLastName(),
					i.getStreetName(), i.getCity(), i.getPostalCode(), i.getPhoneNumber(), i.getEmail());
		}
	}
}
