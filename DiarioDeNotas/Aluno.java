import java.util.Scanner;

public class Aluno {

    int idade;
    int ra;
    String nome;
    String mail;
    int telefone;

    public void identificarAluno(){

        Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println("Digite seu RA: ");
            ra = sc.nextInt();
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            System.out.println("Digite seu email: ");
            mail = sc.next();
            System.out.println("Digite seu telefone: ");
            telefone = sc.nextInt();
            System.out.println("Seja bem vindo " + nome);

            sc.close();
        

    }

    public int Ra() {
        return ra;
    }

    public int Idade() {
        return idade;
    }

    public String Nome() {
        return nome;
    }

    public String Email() {
        return email;
    }

    public int Telefone() {
        return telefone;
    }

    
}
