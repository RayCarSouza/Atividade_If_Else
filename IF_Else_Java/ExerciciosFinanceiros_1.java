package ExercicioIFeELSE;

import java.awt.*;
import java.util.Scanner;

public class ExerciciosFinanceiros_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 3000;
        System.out.println("Digite o valor de que deseja sacar:");
        double saque = sc.nextDouble();

        if (saque > saldo){
            System.out.println("Saque Negado! Verifique o saldo");
        }else if (saque > 0 && saque < saldo){
            System.out.println("Saque Realizado com Sucesso!");
        }else {
            System.out.println("Inválido!");
        }
    }
}
