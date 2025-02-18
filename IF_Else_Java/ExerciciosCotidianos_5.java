package ExercicioIFeELSE;

import java.util.Scanner;

public class ExerciciosCotidianos_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorreto = "@user";
        String senhaCorreta = "12345";

        System.out.print("Digite o usuário: ");
        String usuario = sc.next();

        System.out.print("Digite a senha: ");
        String senha = sc.next();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido! Acesso permitido.");
        } else {
            System.out.println("Usuário ou senha incorretos. Acesso negado.");
        }

        sc.close();


    }
}
