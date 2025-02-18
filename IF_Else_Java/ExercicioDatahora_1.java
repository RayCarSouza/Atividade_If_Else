package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioDatahora_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora");
        int Hora = sc.nextInt();
        System.out.println(" Digite os minutos: ");
        int minutos = sc.nextInt();

        if (Hora < 24 && minutos < 59){
            System.out.println(" Horario dentro do Padrao!");
        }else {
            System.out.println(" Horário Inválido! ");
        }

    }
}
