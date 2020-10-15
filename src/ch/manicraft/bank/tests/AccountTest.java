package ch.manicraft.bank.tests;

import ch.manicraft.bank.bank.objects.Account;
import ch.manicraft.bank.bank.objects.Customer;
import org.junit.Test;

public class AccountTest {

    @Test
    public void depositMoney() {
        final Account account = new Account();
        account.deposit(200);
        assert account.getBalance() == 200;
    }

    @Test
    public void interestAccount() {
        final Account account = new Account();
        account.deposit(200);
        account.interest(365);
        assert account.getBalance() > 200;
    }

    @Test
    public void getStartBalance() {
        final Account account = new Account();
        assert account.getBalance() == 0;
    }

    @Test(expected = java.lang.NullPointerException.class)
    public void getNullCustomer() {
        final Account account = new Account();
        final String customerFistName = account.getAccountOwner().getFirstName();
    }

    @Test
    public void getValidCustomer() {
        final Account account = new Account();
        account.setAccountOwner(new Customer("Thomas", "Kaufmann", "J284DH284D"));
        assert account.getAccountOwner().getFirstName().equals("Thomas");
    }
}
