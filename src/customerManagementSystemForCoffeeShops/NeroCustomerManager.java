package customerManagementSystemForCoffeeShops;

import entities.Customer;
import interfaces.BaseCostumerManager;
import interfaces.CustomerCheckService;

public class NeroCustomerManager extends BaseCostumerManager{

	CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Nero Manager : Validation successfull! A valid person.");
			super.save(customer);
		}
		else 
			System.out.println("Nero Manager : Validation Error! Not a valid person.");
		
		
	}
	
}
