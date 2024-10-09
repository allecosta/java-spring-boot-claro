package digitalbank.main;

public class AccountPoupanca extends Account implements IAccount {
    public AccountPoupanca(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.printInfo();
    }
}
