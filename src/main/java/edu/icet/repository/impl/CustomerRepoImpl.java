package edu.icet.repository.impl;

import edu.icet.model.dto.Customer;
import edu.icet.repository.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomerRepoImpl implements CustomerRepo {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public Boolean addCustomer(Customer customer) {
        String sql = "INSERT INTO Customer VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int result = jdbcTemplate.update(sql,
                customer.getCustID(),
                customer.getCustTitle(),
                customer.getCustName(),
                customer.getDOB(),
                customer.getSalary(),
                customer.getCustAddress(),
                customer.getCity(),
                customer.getProvince(),
                customer.getPostalCode());
        return result > 0;
    }

    @Override
    public Boolean updateCustomer(Customer customer) {
        return null;
    }

    @Override
    public Boolean deleteCustomer(Integer id) {
        return null;
    }

    @Override
    public Customer searchById(Integer id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        String  sql = "SELECT * FROM Customer";
        List<Customer> customerList= jdbcTemplate.query(sql, (rs, rowNum) -> {
            Customer customer = new Customer();
            customer.setCustID(rs.getString(1));
            customer.setCustTitle(rs.getString(2));
            customer.setCustName(rs.getString(3));
            customer.setDOB(rs.getDate(4));
            customer.setSalary(rs.getDouble(5));
            customer.setCustAddress(rs.getString(6));
            customer.setCity(rs.getString(7));
            customer.setProvince(rs.getString(8));
            customer.setPostalCode(rs.getString(9));
            return customer;
        });
        return customerList;
    }
}
