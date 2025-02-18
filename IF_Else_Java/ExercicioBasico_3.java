//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ExercicioIFeELSE;

import java.util.Scanner;

public class ExercicioBasico_3 {
    public ExercicioBasico_3() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adicione um número");
        int num1 = sc.nextInt();
        System.out.println("Adicione outro número");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("O múmero " + num1 + " é maior");
        } else {
            System.out.println("O númemro " + num2 + " é´maior");
        }

    }
}
