package customerManagementSystemForCoffeeShops;

import entities.Customer;
import interfaces.BaseCostumerManager;
import interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCostumerManager{

	private CustomerCheckService customercheckService ;
	
	public StarbucksCustomerManager(CustomerCheckService customercheckService) {
		this.customercheckService = customercheckService;
	}


	@Override
	public void save(Customer customer) {
		
		if( this.customercheckService.checkIfRealPerson(customer) ) {
			System.out.println("Starbucks Manager : Validation Successful! A valid person. ");
			super.save(customer) ;
		}
		else
			System.out.println("Starbucks Manager : Validation Error! Not a valid person. ");
		
		
	}
	
}
