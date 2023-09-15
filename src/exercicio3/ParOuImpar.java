package exercicio3;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero;

        Scanner input = new Scanner(System.in);

        System.out.println("\n Digite um número inteiro:");
        numero = Integer.parseInt(input.nextLine());

        String paridade = numero % 2 == 0 ? " é Par" : " é Ímpar";

        System.out.println("O número " + numero + paridade);

    }
}
