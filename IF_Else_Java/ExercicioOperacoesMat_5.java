package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioOperacoesMat_5 {
    public static void main(String[] args)
    {Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um número: ");
                int numero = scanner.nextInt();


                double raiz = Math.sqrt(numero);  // Calcula a raiz quadrada do número
                if (raiz == (int) raiz) {  // Verifica se a raiz quadrada é um número inteiro
                    System.out.println(numero + " é um quadrado perfeito.");
                } else {
                    System.out.println(numero + " não é um quadrado perfeito.");
                }


                scanner.close();
            }
        }



