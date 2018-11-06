package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(final Customer inputCustomer) {
        customerRepository.save(inputCustomer);
        return inputCustomer;
    }

    public Optional<Customer> getCustomer(final Long customerId) {
        return customerRepository.findById(customerId);
    }

    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(final long customerId) {
        customerRepository.deleteById(customerId);
    }

    public Optional<Customer> updateCustomer(final Customer inputCustomer) {
        Optional<Customer> customer = customerRepository.findById(inputCustomer.getCustomerId());
        if (customer.isPresent()) {
            customer.get().setName(inputCustomer.getName());
            customer.get().setEmail(inputCustomer.getEmail());
            customer.get().setNumber(inputCustomer.getNumber());
            customer.get().setAddress(inputCustomer.getAddress());
            customerRepository.save(customer.get());
        }
        return customer;
    }
}
