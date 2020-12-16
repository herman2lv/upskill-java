package com.epam.classes.simplestClasses.task8;

import java.util.Arrays;
import java.util.List;

public class CustomerDAO {
    private final List<Customer> customers;

    public CustomerDAO() {
        Customer customer1 = new Customer("Nikita", "Mikhalkov", 5555_0000_0000_0000L);
        Customer customer2 = new Customer("Andrew", "Balkonskyi", 5555_0000_0000_9999L);
        Customer customer3 = new Customer("Pavel", "Durov", 5555_0000_0000_5555L);
        this.customers = Arrays.asList(customer1, customer2, customer3);
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
