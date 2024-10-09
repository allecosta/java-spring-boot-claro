package digitalbank.main;

public class AccountCurrent extends Account implements IAccount {
    public AccountCurrent(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.printInfo();
    }
}
