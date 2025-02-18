package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioString_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        if (nome.startsWith("A") || nome.startsWith("a")) {
            System.out.println("O nome começa com A.");
        } else {
            System.out.println("O nome não começa com A.");
        }
    }
}
