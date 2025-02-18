package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioMediaNota_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.println("\nDigite sua "+ i++ + "ªnota");
        double nota1 = sc.nextDouble();

        System.out.println("\nDigite sua "+ i++ +"ªnota");
        double nota2 = sc.nextDouble();

        // calculando a média
        double media = nota1 + nota2 / 2;

        if (media >= 7){
            System.out.println("\nParabéns! Você passou.");
        }else {
            System.out.println("\nSinto muito! Você reprovou.");
        }
    }
}
