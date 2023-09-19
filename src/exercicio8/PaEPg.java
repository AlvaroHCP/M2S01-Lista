package exercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaEPg {
    public static void main(String[] args) {
        int numero, raiz;
        int[] resultado = new int[10];
        List contas = new ArrayList(10);
        String paOuPg = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite o número inicial:");
            numero = Integer.parseInt(input.nextLine());
            System.out.println("Digite a raiz da prograssão:");
            raiz = Integer.parseInt(input.nextLine());
            System.out.println("Digite o tipo de progressão que quer: (pa/pg):");
            paOuPg = input.nextLine();
        } while(!(paOuPg.equals("pa") || paOuPg.equals("pg")));

        resultado[0] = numero;
        contas.add(numero);

        for (int i = 1; i < 10; i++) {
            if (paOuPg.equals("pa")){
                resultado[i] = resultado[i-1] + raiz;
            } else if (paOuPg.equals("pg")){
                resultado[i] = resultado[i-1] * raiz;
            }
        }

        for (int i=0; i<10; i++) {
            System.out.println(resultado[i]);
        }
        }
    }

