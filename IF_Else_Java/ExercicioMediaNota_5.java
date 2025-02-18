package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioMediaNota_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.println("\nDigite sua " + i++ + "ªnota de matematica");
        double notamat = sc.nextDouble();

        System.out.println("\nDigite sua " + i++ + "ªnota de portugues");
        double notaport = sc.nextDouble();

        double media = 15;


        if(notamat < media && notaport < media){
            System.out.println("Você não passou nas duas matérias");
        } else if (notaport < media && notamat >= media) {
            System.out.println("Você não passou em português mas passou em matematica");
        } else if (notamat < media && notaport > media){
            System.out.println("Você nâo passou em matemática mas passou em portugues");
        } else {
            System.out.println("Parabéns! Você passou nas duas disciplias");
        }
    }
    }

