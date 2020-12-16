package com.epam.classes.simplestClasses.task8;

import java.util.Comparator;

public class Customer {
    private final static long INITIAL_ID_COUNTER = 1;
    private static long idCounter = INITIAL_ID_COUNTER;
    private final long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private long creditCardNumber;
    private String bankAccountNumber;

    public Customer(String firstName, String lastName, long creditCardNumber) {
        id = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCardNumber = creditCardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "\nCustomer{" +
                "id=" + id +
                ", name='" + firstName + ' ' +
                lastName + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                '}';
    }

    public String toStringFull() {
        return "\nCustomer{" +
                "id=" + id +
                ", name='" + firstName + ' ' +
                lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }

    public static class NameComparator implements Comparator<Customer> {

        @Override
        public int compare(Customer o1, Customer o2) {
            int result = o1.getLastName().compareToIgnoreCase(o2.getLastName());
            if (result == 0) {
                return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            }
            return result;
        }
    }
}
