package com.epam.classes.aggregationAndComposition.Task4;

import java.math.BigDecimal;
import java.util.Comparator;

public class Account {
    private static final BigDecimal INITIAL_BALANCE = BigDecimal.valueOf(0);
    private final AccountType accountType;
    private final String number;
    private BigDecimal balance;
    private boolean isActive;

    public Account(AccountType accountType, String number) {
        this.accountType = accountType;
        this.number = number;
        this.balance = INITIAL_BALANCE;
        isActive = true;
    }

    public Account(AccountType accountType, String number, BigDecimal initialBalance) {
        this.accountType = accountType;
        this.number = number;
        this.balance = initialBalance;
        isActive = true;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public boolean makeTransaction(int sumOfTransfer) {
        if (isActive) {
            this.balance = this.balance.add(BigDecimal.valueOf(sumOfTransfer));
        }
        return isActive;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String getNumber() {
        return number;
    }

    public void activate() {
        isActive = true;
    }

    public void freeze() {
        isActive = false;
    }

    @Override
    public String toString() {
        return "\nAccount{" +
                "accountType=" + accountType +
                ", number='" + number + '\'' +
                ", balance=" + balance +
                ", isActive=" + isActive +
                '}';
    }

    public static class BalanceComparator implements Comparator<Account> {
        @Override
        public int compare(Account o1, Account o2) {
            return o1.getBalance().compareTo(o2.getBalance());
        }
    }
}
