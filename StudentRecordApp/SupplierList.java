package lab3;

import java.util.ArrayList;

/**
 * This class contains a list of all the suppliers of the shop.
 * @author Desiree Leal
 * @version 1.0
 * @since February 11, 2020
 */
public class SupplierList {
	
	/**
	 * A list of the suppliers of the shop.
	 */
	private ArrayList <Supplier> theSuppliers;
	
	/**
	 * Constructs an empty list of suppliers.
	 */
	public SupplierList() {
		
	}
	
	/**
	 * Constructs and initializes a list of suppliers.
	 * @param newSupList the new list of suppliers to be set.
	 */
	public SupplierList(ArrayList<Supplier> newSupList) {
		theSuppliers = newSupList;
	}
	
	/**
	 * Prints all the suppliers in the shop.
	 */
	public void listAllSuppliers() {
		
		for(Supplier i : theSuppliers) {
			
			System.out.println(i.getSupName());
		}
	}
}

