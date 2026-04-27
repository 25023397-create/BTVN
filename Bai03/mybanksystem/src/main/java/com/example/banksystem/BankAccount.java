package com.example.banksystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
    
    private final String accountId;
    private double balance;

    public BankAccount(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        logger.info("Yêu cầu rút {} từ tài khoản {}", amount, accountId);

        if (amount > balance) {
            logger.error("Giao dịch thất bại: Số dư không đủ.");
            throw new IllegalArgumentException("Số dư không đủ");
        }

        balance -= amount;
        logger.info("Rút thành công. Số dư hiện tại: {}", balance);
    }

    public double getBalance() {
        return balance;
    }
}