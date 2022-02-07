package section02.exercise08;

import section02.exercise08.bank.Bank;
import section02.exercise08.bank.BankManager;

public class Customer {
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void accessBankVault(Bank bank) {
//        bank.accessVault(bank);
    }

    public void accessBankVault(Bank bank, BankManager manager) {
        manager.accessVault(bank); // If you uncomment this method (remove // from beginning of this line), you'll have an error because bank.accessVault() is package protected & customer is not in the bank package
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Felix","Stein");
        Bank bank = new Bank();
        BankManager manager = new BankManager();

        customer.accessBankVault(bank); // This way won't work. cmd/ctrl-click on .accessBankVault to see why
        customer.accessBankVault(bank, manager); // This way DOES work because manager IS allowed to access Bank.accessVault()
    }
}
