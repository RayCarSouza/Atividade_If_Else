package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioBasico_7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite um número para saber se este é múltiplo de 5");
        int numeros = sc.nextInt();

        if (numeros % 5 == 0){
            System.out.println("Esse número é múltiplo de 5");
        } else{
            System.out.println("Esse número não é mútiplo de 5");
        }
    }
}
