package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosFinanceiros_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double Compra = sc.nextDouble();
        double soma;
        double desconto;

        if (Compra > 500){
           soma =  Compra * 0.10;
           desconto = Compra - soma;
            System.out.println(" Valor do desconto = " + soma);
            System.out.println(" Valor total a pagar = " + desconto);
        }else {
            System.out.println(" Sem desconto");
            System.out.println(" Valor Total a pagar: " + Compra);

        }

    }
}
