package org.example.adapters;

import org.example.abstractt.ICustomerCheckService;
import org.example.entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublicSoapClient client =new KPSPublicSoapClient();
        return client.TCKimlikNoDogrula(Convert.ToInt64(customer.NationalityId), customer.FirstName.ToUpper(),
                customer.LastName.ToUpper(), customer.DateOfBirth.Year);
    }
}
