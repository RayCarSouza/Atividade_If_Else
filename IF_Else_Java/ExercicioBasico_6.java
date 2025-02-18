package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioBasico_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos dias tem o ano em que você está?");
        int dias = sc.nextInt();

             if (dias == 365) {
            System.out.println("Esse ano não é bissexto.");
        }   if (dias < 365 || dias > 366) {
            System.out.println("Essa quantidade de dias não existem em um ano ");
        }   else if (dias == 366) {
            System.out.println("Esse ano é bissexto");
        }

    }
}
