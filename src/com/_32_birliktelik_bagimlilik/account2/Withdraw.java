package com._32_birliktelik_bagimlilik.account2;

public class Withdraw implements AccountAction {

    @Override
    public double act(double balance, double amount) {
        if (balance >= amount)
            balance -= amount;
        return balance;
    }

}
