package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosDesafios_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int temp;

        if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; }
        if (num2 > num3) { temp = num2; num2 = num3; num3 = temp; }
        if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; }

        System.out.println("Números em ordem crescente: " + num1 + ", " + num2 + ", " + num3);

        sc.close();

    }
}
