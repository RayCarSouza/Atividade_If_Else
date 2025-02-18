package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosCotidianos_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigoCorreto = 1234; // Código definido

        System.out.print("Digite o código de acesso: ");
        int codigoDigitado = sc.nextInt();

        if (codigoDigitado == codigoCorreto) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Código incorreto! Acesso negado.");
        }

        sc.close();


    }
}
