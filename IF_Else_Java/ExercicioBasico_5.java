//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioBasico_5 {
    public ExercicioBasico_5() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adicione um número");
        int num1 = sc.nextInt();
        System.out.println("Adicione um outro número");
        int num2 = sc.nextInt();
        System.out.println("Adicione mais um número");
        int num3 = sc.nextInt();
        if (num1 <= num2 && num1 <= num3) {
            if (num2 > num3) {
                System.out.println("O número " + num2 + " é maior");
            } else {
                System.out.println("O número " + num3 + " é maior");
            }
        } else {
            System.out.println("O número " + num1 + "è maior");
        }

    }
}
