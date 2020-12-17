package com.epam.classes.simplest.task8;

import java.util.List;

public class Task8Main {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();
        CustomerService customerRegister = new CustomerService(customerDAO);
        System.out.print("\nThe initial list of customers:");
        customerRegister.print();
        customerRegister.sortByName();
        System.out.print("\nThe list of customers sorted by name:");
        customerRegister.print();
        long leftLimitForSearch = 5555_0000_0000_0000L;
        long rightLimitForSearch = 5555_0000_0000_7777L;
        List<Customer> customersWhitCertainCards =
                customerRegister.getCustomersByCreditCardNumber(leftLimitForSearch, rightLimitForSearch);
        System.out.printf("%nCustomers with given card numbers: %s", customersWhitCertainCards);
    }
}
