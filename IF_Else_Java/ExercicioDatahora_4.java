package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioDatahora_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a hora (0-23): ");
        int hora = sc.nextInt();

        if (hora >= 0 && hora < 12) {
            System.out.println("Período da manhã.");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Período da tarde.");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Período da noite.");
        } else {
            System.out.println("Hora inválida.");
        }

        sc.close();

    }
}
