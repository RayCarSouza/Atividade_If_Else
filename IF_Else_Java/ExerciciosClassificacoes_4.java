package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosClassificacoes_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a pressão sistólica (mmHg): ");
        int sistolica = sc.nextInt();

        System.out.print("Digite a pressão diastólica (mmHg): ");
        int diastolica = sc.nextInt();

        String nivelRisco;

        if (sistolica < 120 && diastolica < 80) {
            nivelRisco = "Normal";
        } else if ((sistolica >= 120 && sistolica < 140) || (diastolica >= 80 && diastolica < 90)) {
            nivelRisco = "Moderado";
        } else {
            nivelRisco = "Alto";
        }

        System.out.println("Nível de risco: " + nivelRisco);
        sc.nextInt();


    }
}

