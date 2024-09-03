package main;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro parâmentro: ");
        int parameterOne = scan.nextInt();

        System.out.print("Informe o segundo parâmentro: ");
        int parameterTwo = scan.nextInt();

        try {

            count(parameterOne, parameterTwo);

        } catch(ParameterInvalidException e) {
            System.out.println("OPS! O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void count(int parameterOne, int parameterTwo) throws ParameterInvalidException {

        if (parameterOne > parameterTwo) {
            throw new ParameterInvalidException();
        }

        int counting = parameterTwo - parameterOne;

        for (int i = 1; i <= counting; i++) {
            System.out.println("Imprimindo o número " + i );
        }
    }
}
