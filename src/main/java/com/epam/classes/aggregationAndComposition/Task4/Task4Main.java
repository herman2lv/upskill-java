package com.epam.classes.aggregationAndComposition.Task4;

import java.util.List;

public class Task4Main {
    public static void main(String[] args) {
        CustomerSearcher customerSearcher = new CustomerSearcher(new CustomerDAO());
        String passportId = "3150986PB3";
        List<Account> accounts = customerSearcher.getCustomer(passportId).getAccounts();
        AccountService accountService = new AccountService();
        String accountNumber = "363636DS";
        Account account = accountService.getAccountByNumber(accounts, accountNumber);
        account.makeTransaction(10000);
        System.out.printf("\nList of customer's accounts: %s\n", accounts);
        accountService.sortAccountsByBalance(accounts);
        System.out.printf("\nList of customer's accounts sorted by balance: %s\n", accounts);
        System.out.printf("\nCustomer's balance is: %s\n", accountService.getAccountsBalance(accounts));
        System.out.printf("\nCustomer's balance (for positive accounts only) is: %s\n",
                accountService.getAccountsPositiveBalance(accounts));
        System.out.printf("\nCustomer's balance (for negative accounts only) is: %s\n",
                accountService.getAccountsNegativeBalance(accounts));
    }
}
