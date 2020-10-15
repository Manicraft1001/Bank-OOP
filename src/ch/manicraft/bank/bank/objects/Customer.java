package ch.manicraft.bank.bank.objects;

public class Customer {

    private final String firstName;
    private final String lastName;
    private final String customerNumber;

    public Customer(String firstName, String lastName, String customerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                '}';
    }
}
