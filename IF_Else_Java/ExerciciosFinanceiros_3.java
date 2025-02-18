package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosFinanceiros_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Financiamento do imével");
        System.out.println(" Digite o seu Salário: ");
        double salario = sc.nextDouble();

        if (salario >= 3000){
            System.out.println(" Financiamento Aceito!");
        }else {
            System.out.println(" Financiamento Negado!");
        }

    }
}
