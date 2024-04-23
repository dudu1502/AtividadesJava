import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();

        System.out.println("Testando herança: ");
        
        aluno.Aluno();
        pessoa.Pessoa();

        sc.close();
    }

}