package com.epam.classes.composition.task4;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static final long INITIAL_ID_COUNTER = 1;
    private static long idCounter = INITIAL_ID_COUNTER;
    private final long id;
    private final String passportId;
    private String firstName;
    private String lastName;
    private final List<Account> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName, String passportId) {
        id = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public String getPassportId() {
        return passportId;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
