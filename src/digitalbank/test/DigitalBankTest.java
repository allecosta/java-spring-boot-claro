package digitalbank.test;

import digitalbank.main.AccountCurrent;
import digitalbank.main.AccountPoupanca;
import digitalbank.main.Client;

public class DigitalBankTest {
    public static void main(String[] args) {
        Client client01 = new Client(); 
        client01.setName("José Maria");
        AccountCurrent accountCurrentClient01 = new AccountCurrent(client01);
        AccountPoupanca accountPoupancaClient01 = new AccountPoupanca(client01);
        accountCurrentClient01.deposit(500);
        accountCurrentClient01.transfer(250, accountPoupancaClient01);
        accountCurrentClient01.printStatement();
        accountPoupancaClient01.printStatement(); 

        System.out.println("- - - - - - - - - - -");
       
        Client client02 = new Client();
        client02.setName("Rosa Maria");
        AccountCurrent accountCurrentClient02 = new AccountCurrent(client02);
        AccountPoupanca accountPoupancaClient02 = new AccountPoupanca(client02);
        accountCurrentClient02.deposit(805.59);
        accountPoupancaClient02.transfer(100.59, accountPoupancaClient02);
        accountCurrentClient02.printStatement();
        accountPoupancaClient02.printStatement();
        

        /*Client clients = new Client();
        clients.listClients();*/
    }
}
