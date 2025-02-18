package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioBasico_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma letra para conferir se é vogal ou não: ");
        char vogal = sc.next().toUpperCase().charAt(0);

        if (vogal == 'A' || vogal == 'E' || vogal == 'I' || vogal == 'O' || vogal == 'U'){
          System.out.println("\nEssa letra é vogal");
        } else {
            System.out.println("\nEssa letra não é vogal");
        }

        sc.close();
    }
}
