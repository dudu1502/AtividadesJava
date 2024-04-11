import java.util.Scanner;

public class Professor {

    String nome;
    String mail;
    int idade;
    

    public void identificarProfessor() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            System.out.println("Digite seu email: ");
            mail = sc.next();
            System.out.println("Seja bem vindo " + nome);

            sc.close();

    }
}
