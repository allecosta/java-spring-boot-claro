package accountbank.main;

import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numberAccount = scan.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String numberAgency = scan.next();

        scan.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nameClient = scan.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double balance = scan.nextDouble();

        System.out.println(
                "\nOlá " + nameClient + ", obrigado por criar uma conta em nosso banco, sua agência é, " + numberAgency
                        + ", conta " + numberAccount + " e seu saldo " + balance + " já está disponivel para saque.");

        scan.close();
    }
}
