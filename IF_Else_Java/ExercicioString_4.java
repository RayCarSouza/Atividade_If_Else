package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioString_4 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Digite uma palavra:");
                String palavra = sc.nextLine();

                //
                if (palavra.length() > 5) {
                    System.out.println("A palavra contém mais de 5 caracteres.");
                } else {
                    System.out.println("A palavra NÃO contém mais de 5 caracteres.");
                }

                sc.close();
            }
        }



