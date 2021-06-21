package com._32_birliktelik_bagimlilik.account2;

import java.util.logging.Logger;

public class Account {
    private int id;
    private double balance;
    private Logger log;

    public void changeBalance(AccountAction action, double amount) {
        if (amount < 0)
            throw new IllegalArgumentException(String.valueOf(amount));

        balance = action.act(balance, amount);

        log.info(action + " : " + amount + " for account id: " + id);
    }
}