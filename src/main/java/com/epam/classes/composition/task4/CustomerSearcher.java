package com.epam.classes.composition.task4;

public class CustomerSearcher {
    private final CustomerDAO customerDAO;

    public CustomerSearcher(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
    public Customer getCustomer(String passportID) {
        for (Customer customer: customerDAO.getCustomers()) {
            if (customer.getPassportId().equalsIgnoreCase(passportID)) {
                return customer;
            }
        }
        return null;
    }
}
