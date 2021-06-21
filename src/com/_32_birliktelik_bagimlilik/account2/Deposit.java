package com._32_birliktelik_bagimlilik.account2;

public class Deposit implements AccountAction {

    @Override
    public double act(double balance, double amount) {
        balance -= amount;
        return balance;
    }
}
