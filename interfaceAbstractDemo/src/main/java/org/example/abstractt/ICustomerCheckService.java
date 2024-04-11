package org.example.abstractt;

import org.example.entities.Customer;

public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}

