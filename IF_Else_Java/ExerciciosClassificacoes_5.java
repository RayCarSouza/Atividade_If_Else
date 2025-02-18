package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosClassificacoes_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite a temperatura em celsius: \n");
        double Temperatura = sc.nextDouble();

        String NivelTemperatura = "";

        if (Temperatura <= 10){
            NivelTemperatura = " Frio";
        } else if (Temperatura > 10 && Temperatura < 30) {
            NivelTemperatura = " Agradável";
        } else if (Temperatura > 30) {
            NivelTemperatura = " Quente";
        }

        System.out.println("Nvel de Temperatura:" + NivelTemperatura);

    }
}
