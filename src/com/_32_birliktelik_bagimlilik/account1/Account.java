package com._32_birliktelik_bagimlilik.account1;

import java.util.logging.Logger;

public class Account {
    private int id;
    private double balance;
    private Logger log;

    public void changeBalance(String action, double amount) {
        if (amount < 0)
            throw new IllegalArgumentException(String.valueOf(amount));

        if (action.equals("Deposit"))
            balance += amount;
        else if (action.equals("Withdraw")) {
            if (balance >= amount)
                balance -= amount;

        }
        log.info(action + " : " + amount + " for account id: " + id);
    }
}