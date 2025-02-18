package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosCotidianos_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Converter para (F)ahrenheit ou (K)elvin? ");
        char escolha = sc.next().toUpperCase().charAt(0);

        if (escolha == 'F') {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } else if (escolha == 'K') {
            double kelvin = celsius + 273.15;
            System.out.println("Temperatura em Kelvin: " + kelvin);
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();

    }
}
