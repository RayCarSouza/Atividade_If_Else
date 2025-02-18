package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioDatahora_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();
        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        // período (exemplo: de 01/06/2023 a 30/09/2023)
        int inicioDia = 1, inicioMes = 6, inicioAno = 2023;
        int fimDia = 30, fimMes = 9, fimAno = 2023;

        if ((ano > inicioAno && ano < fimAno) ||
                (ano == inicioAno && (mes > inicioMes || (mes == inicioMes && dia >= inicioDia))) ||
                (ano == fimAno && (mes < fimMes || (mes == fimMes && dia <= fimDia)))) {
            System.out.println("A data está dentro do período especificado.");
        } else {
            System.out.println("A data está fora do período especificado.");
        }

        sc.close();

    }
}
