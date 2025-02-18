package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosClassificacoes_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de Classificação por Idade.");

        System.out.println("Digite a Idade: ");

        int idade = sc.nextInt();

        if (idade > 0 && idade <= 13){
            System.out.println("Criança");
        }
        else if (idade > 13 && idade < 18){
            System.out.println("Adolescente");
        }
        else if (idade >= 18 && idade < 60 ){
            System.out.println("Adulto");
        }
        else if (idade >= 60){
            System.out.println("Idoso");
        }else{
            System.out.println("Idade Inválida");
        }

    }
}
