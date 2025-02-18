package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioString_5 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite a primeira palavra:");
                String palavra1 = sc.nextLine();

                System.out.println("Digite a segunda palavra:");
                String palavra2 = sc.nextLine();

                // Comparando as palavras ignorando maiúsculas e minúsculas
                if (palavra1.equalsIgnoreCase(palavra2)) {
                    System.out.println("As palavras são iguais.");
                } else {
                    System.out.println("As palavras são diferentes.");
                }

                sc.close();
            }
        }


