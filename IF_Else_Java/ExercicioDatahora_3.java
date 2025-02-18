package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioDatahora_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o mês (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        boolean valido = false;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia >= 1 && dia <= 31) {
                valido = true;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 1 && dia <= 30) {
                valido = true;
            }
        } else if (mes == 2) {
            if (dia >= 1 && dia <= 28) { // Não considera anos bissextos
                valido = true;
            }
        }

        if (valido) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }

        sc.close();

    }
}
