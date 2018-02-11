package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAllCustomers() {
        Map<String, Object> params = new HashMap<>();
        List<Customer> result = jdbcTemplate.query("SELECT * FROM CUSTOMERS", params, new CustomerMapper());

        return result;
    }

    @Override
    public void addNewCustomer(Customer newCustomer) {
        String SQL = "INSERT INTO CUSTOMERS VALUES (:id, :name, :address, :noofordersmade)";
        Map<String, Object> params = new HashMap<>();
        params.put("id", newCustomer.getCustomerId());
        params.put("name", newCustomer.getName());
        params.put("address", newCustomer.getAddress());
        params.put("noofordersmade", true);
        jdbcTemplate.update(SQL, params);
    }

    private static final class CustomerMapper implements RowMapper<Customer> {
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customer customer = new Customer();
            customer.setCustomerId(rs.getString("ID"));
            customer.setName(rs.getString("NAME"));
            customer.setAddress(rs.getString("ADDRESS"));
            customer.setNoOfOrdersMade(rs.getBoolean("NOOFORDERSMADE"));
            return customer;
        }
    }


}
