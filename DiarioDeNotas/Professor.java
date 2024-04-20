import java.util.Scanner;

public class Professor {

    String nome;
    String email;
    int idade;

    String nomeAluno;
    int nota1;
    int nota2;
    int nota3;
    int soma;

    public void identificarProfessor(String usuario) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu email: ");
        email = sc.nextLine();

        System.out.println("Seja bem vindo(a) " + usuario + " " + nome);

        System.out.println("Agora digite '1' para cadastrar a notas e '2' para ver notas");
        usuario = sc.nextLine();

        if (usuario.equalsIgnoreCase("1")) {
            System.out.println("Digite o nome do aluno desejado: ");
            nomeAluno = sc.nextLine();

            System.out.println("Agora digite a nota 1: ");
            nota1 = sc.nextInt();
            sc.nextLine();

            System.out.println("Agora digite a nota 2: ");
            nota2 = sc.nextInt();
            sc.nextLine();

            System.out.println("Agora digite a nota 3: ");
            nota3 = sc.nextInt();
            sc.nextLine();

            soma = (nota1 + nota2 + nota3);

            System.out.println("A nota final do aluno " + nomeAluno + " é: " + soma);
        } else if (usuario.equalsIgnoreCase("2")) {
            System.out.println("Opção não criada");
        } else{
            System.out.println("Opção invalida");
        }

        sc.close();
    }

}
