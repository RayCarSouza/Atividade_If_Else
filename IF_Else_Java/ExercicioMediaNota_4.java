package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioMediaNota_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.println("\nDigite sua " + i++ + "ªnota");
        double nota1 = sc.nextDouble();

        System.out.println("\nDigite sua " + i++ + "ªnota");
        double nota2 = sc.nextDouble();

        // calculando a média
        double media = nota1 + nota2 / 2;

        if (nota1 == 10 || nota2 == 10) {
            System.out.println("\nParabéns! Você foi aprovado e recebeu nota máxima em uma das matérias");
        } else if (media >= 7) {
            System.out.println("\nParabéns! Você foi aprovado.");
        } else{
            System.out.println("Sinto muito! Você foi reprovado");
        }
    }
}


