package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioMediaNota_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.println("\nDigite sua "+ i++ + "ªnota");
        double nota1 = sc.nextDouble();

        System.out.println("\nDigite sua "+ i++ +"ªnota");
        double nota2 = sc.nextDouble();

        System.out.println("\nDigite sua "+ i++ +"ªnota");
        double nota3 = sc.nextDouble();


        if (nota1 > nota2 && nota1 > nota3){
            System.out.println("\nParabéns! a sua maior nota foi: "+ nota1);
        } else if (nota2 > nota3) {
            System.out.println("Sua maior nota foi: "+ nota2);
        } else{
            System.out.println("Sua maior nota foi: "+ nota3);
        }
        if (nota1 < nota2 && nota1 < nota3){
            System.out.println("\nParabéns! a sua menor nota foi: "+ nota1);
        } else if (nota2 < nota3) {
            System.out.println("Sua menor nota foi: "+ nota2);
        } else{
            System.out.println("Sua menor nota foi: "+ nota3);
        }
    }
}
