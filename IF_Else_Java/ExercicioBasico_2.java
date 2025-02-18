package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioBasico_2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Ese número é par");
        }else {
            System.out.println("Esse número é impar");
        }
    }
}
