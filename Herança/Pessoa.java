import java.util.Scanner;

public class Pessoa {

    String nome;
    int idade;
    Scanner sc = new Scanner(System.in);


    public void Pessoa(){

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Bem vindo " + nome + "você tem " + idade + " anos");


        sc.close();

    }

}