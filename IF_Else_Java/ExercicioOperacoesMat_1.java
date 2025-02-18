package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioOperacoesMat_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;


        System.out.println("Digite seu "+ i++ +"ªnúmero");
        int num1 = sc.nextInt();
        System.out.println("Digite seu "+ i++ +"ªnúmero");
        int num2 = sc.nextInt();

        double soma = num1 + num2;

        if (soma == 100){
            System.out.println("A soma de "+ num1 +" e "+ num2 + " é igual a 100");
        } else {
            System.out.println("A soma de "+ num1 +" e " + num2 + " não é igual a 100");
        }
        sc.close();
    }

}
