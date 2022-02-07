package section02.exercise08.bank;

public class BankManager {
    private String firstName;
    private String lastName;

    public void accessVault(Bank bank) {
        bank.accessVault(bank); // Perfectly fine here because Manager & Bank are in the same package and Bank.accessVault is package protected
    }
}
