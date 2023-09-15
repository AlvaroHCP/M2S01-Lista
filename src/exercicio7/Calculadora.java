package exercicio7;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double numero1, numero2, resultado;
        String operacao;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        numero1 = Double.parseDouble(input.nextLine().replace(',', '.'));
        System.out.println("Digite o segundo número: ");
        numero2 = Double.parseDouble(input.nextLine().replace(',', '.'));;
        System.out.println("Digite a operação entre os números: ");
        operacao = input.nextLine();

        resultado = switch (operacao) {
            case "multiplicação" -> numero1 * numero2;
            case "divisão"-> numero1 / numero2;
            case "soma" -> numero1 + numero2;
            case "subtração" -> numero1 - numero2;
            default -> -1;
        };

        System.out.printf("A %s entre %.2f e %.2f é %.2f.", operacao, numero1, numero2, resultado);
    }
}
