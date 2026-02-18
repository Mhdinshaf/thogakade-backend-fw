package edu.icet.controller;

import edu.icet.model.dto.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Customer")
public class CustomerController  {

    final private CustomerService customerService;

    @PostMapping("/addcustomer")
    public Boolean addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }


    public Boolean updateCustomer(Customer customer) {
        return customerService.updateCustomer(customer);

    }


    public Boolean deleteCustomer(Integer id) {
        return  customerService.deleteCustomer(id);

    }


    public Customer searchById(Integer id) {
        return customerService.searchById(id);
    }

    @GetMapping("/getall")
    public List<Customer> getAll() {
        return customerService.getAll();
    }
}
