package com.epam.classes.simplestClasses.task8;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private final CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void sortByName() {
        customerDAO.getCustomers().sort(new Customer.NameComparator());
    }

    /**
     * Check if customers credit card numbers is in the given range.
     *
     * @param leftLimit - min value of credit card number
     * @param rightLimit - max value of credit card number
     *
     * @throws IllegalArgumentException if max range is less than the min range
     *
     * @return list of customers with credit card numbers in the given range
     */
    public List<Customer> getCustomersByCreditCardNumber(long leftLimit, long rightLimit) {
        if (rightLimit < leftLimit) {
            throw new IllegalArgumentException("Right limit should be greater than or equal to the left limit");
        }
        List<Customer> selectedCustomers = new ArrayList<>();
        for (Customer customer: customerDAO.getCustomers()) {
            if (customer.getCreditCardNumber() >= leftLimit && customer.getCreditCardNumber() <= rightLimit) {
                selectedCustomers.add(customer);
            }
        }
        return selectedCustomers;
    }

    public void print() {
        System.out.println(customerDAO.getCustomers());
    }
}
