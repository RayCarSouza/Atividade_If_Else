package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosDesafios_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSorteado = 7;

        System.out.print("Tente adivinhar o número sorteado (entre 1 e 10): ");
        int tentativa = sc.nextInt();

        if (tentativa == numeroSorteado) {
            System.out.println("Parabéns! Você acertou.");
        } else {
            System.out.println("Você errou. O número sorteado era " + numeroSorteado);
        }

        sc.close();

    }

}
