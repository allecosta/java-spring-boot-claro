package exercises;

import java.util.Scanner;

/**
 * CALCULANDO O CONSUMO DE DADOS MÓVEIS
 */
public class Exer2 {

    // Função para calcular o consumo total de dados móveis
    public static int calcularConsumoTotal(String[] consumoSemanal) {
        int total = 0;
       
        // TODO: Calcule o consumo total de dados móveis
        for (int i = 0; i < consumoSemanal.length; i++) {
            total += Integer.parseInt(consumoSemanal[i].trim());
        }
          
        return total;
    }

    // Função para calcular a média semanal de consumo de dados móveis
    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        // Calcule a média semanal de consumo de dados móveis
        return totalConsumo / numeroDeSemanas;
    }   

    // Função para identificar a semana de maior consumo
    public static int identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int semanaDeMaiorConsumo = 1;
        int maiorConsumo =  Integer.parseInt(consumoSemanal[0].trim());
        
        // Função para identificar a semana de maior consumo
        for (int i = 0; i < consumoSemanal.length; i++) {
          int consumo = Integer.parseInt(consumoSemanal[i].trim());

	        // TODO: Faça o cálculo para identificar a semana de maior consumo
            if (consumo > maiorConsumo) {
                maiorConsumo = consumo;
                semanaDeMaiorConsumo = i + 1;
            }
        }

        return semanaDeMaiorConsumo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de consumos semanais em MB
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.split(",");

        // Calculando o consumo total de dados móveis no mês
        int totalConsumo = calcularConsumoTotal(consumoSemanal);

        // Calculando a média semanal de consumo de dados móveis
        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        // Identificando a semana de maior consumo
        int semanaDeMaiorConsumo = identificarSemanaDeMaiorConsumo(consumoSemanal);

        // Exibindo o consumo total de dados móveis no mês
        System.out.println("Total mensal: " + totalConsumo + " MB");

        // Exibindo a média semanal de consumo
        System.out.println("Media semanal: " + mediaSemanal + " MB");

        // Exibindo a semana de maior consumo
        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);

        scanner.close();
    }
}