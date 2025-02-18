package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioBasico_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adicione um número");
        int entrada =sc.nextInt();

        if (entrada >= 0) {
            System.out.println("Essse número é positivo");}
           else {
                System.out.println("Esse número é negativo");
            }


    }
}
