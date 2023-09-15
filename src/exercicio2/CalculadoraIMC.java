package exercicio2;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        double peso;
        double altura;

        Scanner input = new Scanner(System.in);

        System.out.println("\n Digite seu peso:");
        peso = Double.parseDouble(input.nextLine().replace(',', '.'));

        System.out.println("\n Digite sua altura:");
        altura = Double.parseDouble(input.nextLine().replace(',', '.'));

//        System.out.println(peso + " " + altura);
//        System.out.printf("%n Peso = %.1f Kg %n Altura = %.2f m %n", peso, altura);

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("%n O IMC calculado é: %.2f.", imc);

    }
}
