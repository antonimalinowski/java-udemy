package section02.exercise08.bank;

public class Bank {
    private String name;

    /* Notice this method does not have public or private keywords (protected would also work). Without those, it is 'package protected'. */
    void accessVault(Bank bank) {
        System.out.println("You are currently in the vault");
    }
}
