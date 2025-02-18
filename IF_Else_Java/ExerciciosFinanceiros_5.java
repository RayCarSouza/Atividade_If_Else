package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosFinanceiros_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de compra: ");
        double compra = sc.nextDouble();

        if (compra > 150){
            System.out.println(" Você ganhou um brinde!");
        }else {
            System.out.println(" Voce nao tem direito a um brinde!");
        }
    }
}
