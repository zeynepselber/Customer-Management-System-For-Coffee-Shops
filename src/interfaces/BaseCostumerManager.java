package interfaces;

import entities.Customer;

public abstract class BaseCostumerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db. " + customer.getFirstName());
		
	}

}
