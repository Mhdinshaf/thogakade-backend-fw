package edu.icet.repository;

import edu.icet.model.dto.Customer;

import java.util.List;

public interface CustomerRepo {
    Boolean addCustomer(Customer customer);
    Boolean updateCustomer(Customer customer);
    Boolean deleteCustomer(Integer id);
    Customer searchById(Integer id);
    List<Customer> getAll();
}
