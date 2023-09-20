package exercicio9;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, aumento, reajuste, novoSalario;

        System.out.println("Digite o seu salário: ");
        salario = Double.parseDouble(input.nextLine().replace(',','.'));

//        System.out.printf("%.2f", salario);

       if(salario <= 1200){
           aumento = 0.20;
       } else if (salario <= 1700){
           aumento = 0.15;
       } else if(salario <= 2500){
           aumento = 0.10;
       } else {
           aumento = 0.05;
       }

       reajuste = salario * aumento;

       novoSalario = salario + reajuste;

        System.out.printf("Salário: %.2f, " +
                "%nPercentual: %.0f%%, " +
                "%nAumento R$%.2f, " +
                "%nSalário final: %.2f.", salario, 100 * aumento, reajuste, novoSalario);
    }
}
