package com.example.demo.resource;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Value("${spring.jpa.database-platform}")
    private String value;

    private final CustomerService customerService;

    @Autowired
    public CustomerResource(final CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public Iterable<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "/{customerId}")
    public Optional<Customer> getCustomer(final @PathVariable Long customerId) {
        return customerService.getCustomer(customerId);
    }

    @DeleteMapping(path = "/{customerId}")
    public void removeCustomer(final @PathVariable Long customerId) {
        customerService.deleteCustomer(customerId);
    }

    @PostMapping()
    public Customer addCustomer(final @RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping()
    public Optional<Customer> editCustomer(final @RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @GetMapping("/value")
    public String getValue() {
        return value;
    }
}
