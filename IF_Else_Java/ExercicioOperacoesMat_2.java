package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioOperacoesMat_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("EScreva o "+ i++ +"ªnúmero:");
        int num1 = sc.nextInt();
        System.out.println("EScreva o "+ i++ +"ªnúmero:");
        int num2 = sc.nextInt();

        int diferenca = num1 - num2;

        if(diferenca < 0){
            System.out.println("A diferença é negativa.");
        }else {
            System.out.println("A diferença não é negativa.");
        }
    }
}
