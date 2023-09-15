package exercicio5;

import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        double nota1, nota2, nota3, mediaFinal;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        nota1 = Double.parseDouble(input.nextLine().replace(",", "."));
        System.out.println("Digite a nota 2: ");
        nota2 = Double.parseDouble(input.nextLine().replace(",", "."));
        System.out.println("Digite a nota 3: ");
        nota3 = Double.parseDouble(input.nextLine().replace(",", "."));

        mediaFinal = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média final é: %.2f.", mediaFinal);
    }
}
