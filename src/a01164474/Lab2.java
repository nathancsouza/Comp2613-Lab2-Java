package a01164474;

import a01164474.data.Customer;
import a01164474.io.CustomerReader;
import a01164474.io.CustomerReport;

/**
 * Project: lab2
 * @author Nathan de Souza - A01164474
 */
public class Lab2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No parameters was setted.");
			System.exit(-1);
		} else {
			new Lab2().run(args[0]);
		}	
	} 
	
	private void run(String args) {
		CustomerReader readArguments = new CustomerReader();
		Customer[] array = readArguments.readArray(args);
		CustomerReport display = new CustomerReport();
		display.displayReport(array);
	}
}
