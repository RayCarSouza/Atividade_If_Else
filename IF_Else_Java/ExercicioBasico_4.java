//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioBasico_4 {
    public ExercicioBasico_4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá,adicione sua idade para conferirmos se você pode votar");
        int idade = sc.nextInt();
        if (idade >= 16) {
            System.out.println("Você pode votar. Tire seu título eleitoral.");
        } else {
            System.out.println("Você ainda não pode votar ");
        }

    }
}
