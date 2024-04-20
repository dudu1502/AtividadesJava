import java.util.Scanner;

public class Aluno {

    int idade;
    int ra;
    String nome;
    String email;
    String telefone;

    public void identificarAluno(String usuario) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite seu RA: ");
        ra = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu email: ");
        email = sc.nextLine();

        System.out.println("Digite seu telefone: ");
        telefone = sc.nextLine();

        System.out.println("Seja bem vindo(a) " + usuario + " " + nome);

        sc.close();

    }

}
