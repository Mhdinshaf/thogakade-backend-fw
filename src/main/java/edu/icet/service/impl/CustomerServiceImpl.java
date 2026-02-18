package edu.icet.service.impl;

import edu.icet.model.dto.Customer;
import edu.icet.repository.CustomerRepo;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl  implements CustomerService {

    final private CustomerRepo customerRepo;

    @Override
    public Boolean addCustomer(Customer customer) {
        return customerRepo.addCustomer(customer);
    }

    @Override
    public Boolean updateCustomer(Customer customer) {
        return customerRepo.updateCustomer(customer);
    }

    @Override
    public Boolean deleteCustomer(Integer id) {
        return customerRepo.deleteCustomer(id);
    }

    @Override
    public Customer searchById(Integer id) {
        return customerRepo.searchById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepo.getAll();
    }
}
