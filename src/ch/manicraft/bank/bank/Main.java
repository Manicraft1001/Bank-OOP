package ch.manicraft.bank.bank;

import ch.manicraft.bank.bank.objects.Account;
import ch.manicraft.bank.bank.objects.Customer;

import java.util.Currency;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        final Currency currency = Currency.getInstance(Locale.getDefault());
        System.out.println("Your currency is: " + currency.getCurrencyCode() + " (" + currency.getDisplayName() + ")");

        final Account account1 = new Account();
        account1.setAccountOwner(new Customer("Hans", "Mustermann", "ES72DL3"));
        System.out.println("Owner of account 1: " + account1.getAccountOwner().toString());

        final Account account2 = new Account();

        System.out.println(account1.toString());
        account1.deposit(500.75);
        System.out.println(account1.toString());
        account1.interest(365);
        System.out.println(account1.toString());
        System.out.println("Account Balance of " + account1.getAccountOwner().getFirstName() + ": " + account1.getBalance());

        System.out.println(account2.toString());
        for (int i = 0; i < 2; i++) {
            account2.deposit(720.50);
            System.out.println(account2.toString());
            account2.interest(720);
            System.out.println(account2.toString());
        }

        final String a = new String("hallo");
        final String b = new String("hallo");
        System.out.println( a == b);
        System.out.println(a.equals(b));
    }
}
