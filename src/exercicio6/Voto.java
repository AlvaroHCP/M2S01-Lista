package exercicio6;

import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        int idade;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a seu ano de nascimento: ");
        idade = 2023 - Integer.parseInt(input.nextLine());

        String votoProibido = "Você não pode votar.";
        String votoOpcional = "Seu voto é opcional.";
        String votoObrigatorio = "Seu voto é obrigatório.";

        if(idade < 16){
            System.out.println(votoProibido);
        } else if (idade == 16 || idade == 17 || idade > 59){
            System.out.println(votoOpcional);
        } else {
            System.out.println(votoObrigatorio);
        }
    }
}
