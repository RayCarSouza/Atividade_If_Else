
package ExercicioIFeELSE;
import java.util.Scanner;
public class ExerciciosClassificacoes_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de Classificação de Altura\n");
        System.out.println("Digite a sua altura em metros:\n");

        double Altura = sc.nextDouble();

        if (Altura > 0 && Altura <= 1.60) {
            System.out.print("Altura Baixa");
        } else if (Altura >= 1.60 && Altura <= 1.80) {
            System.out.print("Altura Media");
        } else if (Altura > 1.80 && Altura <= 1.90) {
            System.out.print("Altura Alta");
        } else {
            System.out.print("Altura Invalida");
        }
    }
}

