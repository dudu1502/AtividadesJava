import java.util.Scanner;

public class Professor {

    String nome;
    String email;
    int idade;
    

    public void identificarProfessor() {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();

            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite seu email: ");
            email = sc.nextLine();

            System.out.println("Seja bem vindo(a) professor " + nome);

            sc.close();

    }
}
