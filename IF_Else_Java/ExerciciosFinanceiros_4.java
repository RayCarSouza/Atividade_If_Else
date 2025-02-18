package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosFinanceiros_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();
        System.out.println("Digite o valor da parcela: ");
        int parcela = sc.nextInt();

        if ( parcela <= 0.10* salario){
            System.out.println(" Parcelado com sucesso!");
        }else {
            System.out.println(" Parcela Negada!");
        }

    }
}
