package exercicio1;

import java.util.Scanner;

public class NomeDoUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Digite seu Sobrenome: ");
        String sobrenome = input.nextLine().trim();
//        System.out.println(sobrenome.trim());

        System.out.println("\n Digite seu Nome: ");
        String nome = input.nextLine().trim();
//        System.out.println(nome);

        System.out.println("\n\n Nome completo cadastrado: \n\t" + nome + " " + sobrenome);
    }
}
