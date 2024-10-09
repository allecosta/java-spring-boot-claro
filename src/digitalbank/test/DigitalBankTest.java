package digitalbank.test;

import digitalbank.main.AccountCurrent;
import digitalbank.main.AccountPoupanca;
import digitalbank.main.Client;

public class DigitalBankTest {
    public static void main(String[] args) {
        Client client = new Client();
        
        client.setName("José Maria");

        AccountCurrent accountCurrent = new AccountCurrent(client);
        AccountPoupanca accountPoupanca = new AccountPoupanca(client);

        accountCurrent.deposit(500);
        accountCurrent.transfer(250, accountPoupanca);

        accountCurrent.printStatement();
        accountPoupanca.printStatement(); 
       
        /* 
        client.setName("Rosalina");
        accountCurrent.deposit(805.59);
        accountPoupanca.transfer(100.59, accountPoupanca);

        accountCurrent.printStatement();
        accountPoupanca.printStatement();*/

        client.listClients();
    }
}
