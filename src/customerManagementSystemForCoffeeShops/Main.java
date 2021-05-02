package customerManagementSystemForCoffeeShops;

import java.util.Date;

import adapters.MernisServiceAdapter;
import entities.Customer;
import interfaces.BaseCostumerManager;

public class Main {

	public static void main(String[] args) {
		
		Customer customerReal = new Customer(1 , "Zeynep" , "SELBER" , "25928471862" , new Date(1993,07,01) );
		Customer customerFake = new Customer(1 , "Zeynep" , "SELBER" , "25928471862" , new Date(1992,07,01) );
		
		BaseCostumerManager neroCustomerManager = new NeroCustomerManager( new MernisServiceAdapter() );
		
		BaseCostumerManager starbucksCustomerManager = new StarbucksCustomerManager( new MernisServiceAdapter());
		
		starbucksCustomerManager.save(customerReal);
		starbucksCustomerManager.save(customerFake);
		
		neroCustomerManager.save(customerReal);
		neroCustomerManager.save(customerFake);
	}

}
