package exercicio4;

import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        int numeroPC = (int) (Math.round(Math.random() * 4 + 1));
        int numeroUsuario;

        Scanner input = new Scanner(System.in);
        System.out.println("Em um intervalo de números inteiros de 1 a 5, em qual número estou pensando? " +
                "\nDigite o seu palpite:");
        numeroUsuario = Integer.parseInt(input.nextLine());

        String resultado = numeroPC == numeroUsuario ? "Eu pensei exatamente nele.\nVocê acertou!" :
                "Eu pensei no número " + numeroPC + "\nVocê errou!";
        System.out.println("Você digitou o número " + numeroUsuario + "\n" + resultado);
    }
}
