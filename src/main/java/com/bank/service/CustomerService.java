package com.bank.service;

import com.bank.entity.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
	Customer loginCustomer(String email, String password);
}
