package digitalbank.main;

public abstract class Account {
    private static final int AGENCY_DEFAULT = 1;
    private static int SEQUENCY = 1;

    protected int agency;
    protected int numberAccount;
    protected double balance;
    protected Client client;

    public Account(Client client){
        agency = AGENCY_DEFAULT;
        numberAccount = SEQUENCY++;
        this.client = client;
    }

    public void sacar(double value) {
        balance -= value;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void transfer(double value, Account accountDestination) {
        sacar(value);
        accountDestination.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    protected void printInfo() {
        System.out.println(String.format("Titular: %s", client.getName()));
        System.out.println(String.format("Agência: %d", agency));
        System.out.println(String.format("Número: %d", numberAccount));
        System.out.println(String.format("Saldo: %.2f", balance));
    }
}
