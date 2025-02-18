package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosClassificacoes_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de Classificação de Altura\n");
        System.out.println("Digite a sua altura em metros:\n");

        double altura = sc.nextDouble();

        if (altura > 0 && altura <= 1.60){
            System.out.println("Altura Baixa");
        }else if (altura >= 1.60 && altura <= 1.80){
            System.out.println("Altura Media");
        }else if (altura > 1.80 && altura <= 1.90){
            System.out.println("Altura Alta");
        }else{
            System.out.println("Altura Invalida");
        }
    }
}
