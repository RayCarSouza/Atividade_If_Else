package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioOperacoesMat_4 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o primeiro lado (a): ");
                double a = scanner.nextDouble();
                System.out.print("Digite o segundo lado (b): ");
                double b = scanner.nextDouble();
                System.out.print("Digite o terceiro lado (c): ");
                double c = scanner.nextDouble();


                if (a + b > c && a + c > b && b + c > a) {
                    System.out.println("Os números podem formar um triângulo.");
                } else {
                    System.out.println("Os números NÃO podem formar um triângulo.");
                }


                scanner.close();
            }
        }



