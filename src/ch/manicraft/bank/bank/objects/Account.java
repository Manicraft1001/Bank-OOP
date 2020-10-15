package ch.manicraft.bank.bank.objects;

import java.text.DecimalFormat;

public class Account {

    private double saldo;
    private double interest_rate = 0.01;
    private Customer accountOwner;

    public Account(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public Account() {
    }

    public void deposit(double depositValue) {
        saldo += depositValue;
    }

    public void interest(int days) {
        if (getBalance() >= 500000) {
            return;
        }
        final double multiplier = getBalance() >= 50000 ? 0.5 : 1;
        final double interest = multiplier * (getBalance() * interest_rate * days / 365);
        deposit(interest);
    }

    public double getBalance() {
        return saldo;
    }

    private double roundCurrency(double value) {
        final DecimalFormat twoPlaces = new DecimalFormat("#.##");
        return Double.parseDouble(twoPlaces.format(saldo));
    }

    public void setAccountOwner(Customer accountOwner) {
        this.accountOwner = accountOwner;
    }

    public Customer getAccountOwner() {
        return accountOwner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "saldo=" + roundCurrency(saldo) +
                ", interest_rate=" + interest_rate +
                '}';
    }
}
