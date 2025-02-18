package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioString_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tudo Bem? Responda com \"sim\"  ou  \"não\"" );
        String resposta = sc.nextLine().trim();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Que bom!");
        } else if (resposta.equalsIgnoreCase("não")){
            System.out.println("Que pena. Melhoras ");
        } else{
            System.out.println("Resposta inválida");
        }
    }
}