package com.epam.classes.composition.task4;

import java.math.BigDecimal;
import java.util.List;

public class AccountService {

    public void sortAccountsByBalance(List<Account> accounts) {
        accounts.sort(new Account.BalanceComparator());
    }

    public Account getAccountByNumber(List<Account> accounts, String accountNumber) {
        for (Account account: accounts) {
            if (account.getNumber().equalsIgnoreCase(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public BigDecimal getAccountsBalance(List<Account> accounts) {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Account account: accounts) {
                sum = sum.add(account.getBalance());
            }
        return sum;
    }

    public BigDecimal getAccountsPositiveBalance(List<Account> accounts) {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Account account: accounts) {
            if (account.getBalance().compareTo(BigDecimal.valueOf(0)) > 0) {
                sum = sum.add(account.getBalance());
            }
        }
        return sum;
    }

    public BigDecimal getAccountsNegativeBalance(List<Account> accounts) {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Account account: accounts) {
            if (account.getBalance().compareTo(BigDecimal.valueOf(0)) < 0) {
                sum = sum.add(account.getBalance());
            }
        }
        return sum;
    }

}
