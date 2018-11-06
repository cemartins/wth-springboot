package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long customerId;
    private String name;
    private String email;
    private String number;
    private String address;

    @OneToMany(mappedBy = "customer")
    private Set<Account> accounts = new HashSet<>();
}
