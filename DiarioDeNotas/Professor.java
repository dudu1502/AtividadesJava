import java.util.Scanner;

public class Professor {

    String nome;
    int idade;
    String email;

    public void identificarProfessor() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite seu email: ");
        email = sc.nextLine();
        System.out.println("Seja bem vindo " + nome);

        sc.close();
    }
}
