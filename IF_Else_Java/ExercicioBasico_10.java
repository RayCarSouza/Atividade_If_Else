package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioBasico_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 200){
            System.out.println("\nEsse número está dentro do intervalo");
        } else {
            System.out.println("\nEsse número está fora do intervalo");
        }
    }
}
