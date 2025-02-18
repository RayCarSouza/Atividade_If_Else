package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosCotidianos_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o último número da placa do veículo: ");
        int ultimoDigito = sc.nextInt();

        if (ultimoDigito % 2 == 0) {
            System.out.println("O veículo pode passar no pedágio em dias pares.");
        } else {
            System.out.println("O veículo pode passar no pedágio em dias ímpares.");
        }

        sc.close();

    }
}
