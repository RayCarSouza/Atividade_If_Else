package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioString_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite uma senha com números");
            String resposta = sc.nextLine();

            if (resposta.equals("1234")) {
                System.out.println("Senha correta");
            } else{
                System.out.println("Resposta incorreta");
            }
        }
    }

