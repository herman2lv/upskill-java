package com.epam.classes.composition.task4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDAO {
    private final List<Customer> customers = new ArrayList<>();

    public CustomerDAO() {
        Account account1 = new Account(AccountType.BASIC, "121212FD", BigDecimal.valueOf(12750));
        Account account2 = new Account(AccountType.BUSINESS, "656565FS", BigDecimal.valueOf(-180));
        Account account3 = new Account(AccountType.BUSINESS_PLUS, "363636DS");
        Customer customer1 = new Customer("Naum", "Ivanov", "3150986PB3");
        customer1.openAccount(account1);
        customer1.openAccount(account2);
        customer1.openAccount(account3);
        Account account4 = new Account(AccountType.BASIC, "085474SX");
        Account account5 = new Account(AccountType.STUDENT, "863457VC");
        Customer customer2 = new Customer("Ivan", "Naumov", "3200488MC2");
        customer2.openAccount(account4);
        customer2.openAccount(account5);
        customers.addAll(Arrays.asList(customer1, customer2));
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
