package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioOperacoesMat_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = sc.nextInt();
        System.out.println("Digite outro número");
        int num2 = sc.nextInt();



        if (num1 % num2 == 0 ){
            System.out.println("O "+num1+" é divisível por "+num2);
        } else {
            System.out.println("O "+num1+" não é divisível por "+num2);
        }
        sc.close();
    }
}
