package org.example.concrete;

import org.example.abstractt.BaseCustomerManager;
import org.example.abstractt.ICustomerCheckService;
import org.example.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
    private ICustomerCheckService customerCheckService;

    public NeroCustomerManager(ICustomerCheckService customerCheckService)
    {
        customerCheckService = customerCheckService;
    }

    public Override void save(Customer customer);
    {
        if (customerCheckService.checkIfRealPerson(customer))
        {
            base.save(customer);
        }else
        {
            try {
                throw new Exception("Not a valid person");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}

