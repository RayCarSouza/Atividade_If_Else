package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosDesafios_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7; // Número definido

        System.out.print("Tente adivinhar o número secreto (entre 1 e 10): ");
        int tentativa = sc.nextInt();

        if (tentativa == numeroSecreto) {
            System.out.println("Parabéns! Você acertou.");
        } else {
            System.out.println("Você errou. O número secreto era " + numeroSecreto);
        }

        sc.close();

    }
}
