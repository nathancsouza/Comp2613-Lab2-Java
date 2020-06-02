package a01164474.io;

import a01164474.data.Customer;
import a01164474.data.util.Validator;

/**
 * Project: lab2
 * @author Nathan de Souza - A01164474
 */
public class CustomerReader {
	private Customer[] arrayOfCustomers;
	
	public CustomerReader() {
		arrayOfCustomers = new Customer[5];
	}

	private String [][] splitInput(String input) {
		String[] arrayUnformatted = input.split(":");
		String[][] formattedArray = new String[arrayUnformatted.length][9];		
		
		for(int i = 0; i < arrayUnformatted.length; i++) {
			String[] customer = arrayUnformatted[i].split("\\|");
			
			formattedArray[i][0] = customer[0]; //ID
			formattedArray[i][1] = customer[1]; //FIRSTNAME
			formattedArray[i][2] = customer[2]; //LASTNAME
			formattedArray[i][3] = customer[3]; //STREET
			formattedArray[i][4] = customer[4]; // CITY
			formattedArray[i][5] = Validator.PostalCode(customer[5]); //POSTAL CODE
			formattedArray[i][6] = Validator.PhoneNumber(customer[6]); //PHONE NUMBER	
			formattedArray[i][7] = Validator.Email(customer[7]); //EMAIL
			formattedArray[i][8] = customer[8]; //JOIN DATE
			
		}
		return formattedArray;
	}
	
	public Customer[] readArray(String input) {
		String[][] formattedArray = splitInput(input);
		Customer newCustomer;
		for (int i = 0; i < formattedArray.length; i++) {

			newCustomer = new Customer.Builder(formattedArray[i][0], formattedArray[i][6])
					.firstName(formattedArray[i][1]).lastName(formattedArray[i][2])
					.streetName(formattedArray[i][3]).city(formattedArray[i][4])
					.postalCode(formattedArray[i][5]).email(formattedArray[i][7]).joinDate(formattedArray[i][8]).build();

			arrayOfCustomers[i] = newCustomer;
		}
		return arrayOfCustomers;
	}
	
}
