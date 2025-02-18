package ExercicioIFeELSE;


import java.util.Scanner;

public class ExerciciosCotidianos_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("Você está apto(a) para doar sangue.");
        } else {
            System.out.println("Você NÃO está apto(a) para doar sangue.");
        }

        sc.close();

    }
}
