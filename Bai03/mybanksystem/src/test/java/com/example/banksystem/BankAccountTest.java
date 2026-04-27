package com.example.banksystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class BankAccountTest {

    @Test
    public void testWithdrawSuccess() {
        BankAccount account = new BankAccount("ACC001", 100.0);
        account.withdraw(40.0);
        // Kiểm tra xem số dư có đúng là 60 không
        assertEquals(60.0, account.getBalance(), "Số dư phải là 60.0 sau khi rút 40.0");
    }

    @Test
    public void testWithdrawSucces1() {
        BankAccount account = new BankAccount("ACC001", 100.0);
        account.withdraw(40.0);
        // Cố tình viết sai
        assertEquals(90.0, account.getBalance(), "Số dư phải là 60.0 sau khi rút 40.0");
    }
}