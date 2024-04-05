import java.util.Scanner;

public class DiarioDeNotas {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você um professor");
      String usuario = sc.nextLine();
      if (usuario.equalsIgnoreCase("Professor")) {
         System.out.println("Digite o seu nome");
         String nome = sc.nextLine();
         System.out.println("Olá Professor " + nome + " seja bem vindo");

         System.out.println("Digite o nome do aluno desejado: ");
         String nomeAluno = sc.nextLine();
         System.out.println(
               "Esta é a ficha do aluno " + nomeAluno + " Digite '1' para atribuir notas e '2' para ver as notas");
         int num = sc.nextInt();
         if (num == 1) {
            System.out.println("Digite a primeira nota de " + nomeAluno);
            int nota1 = sc.nextInt();
            System.out.println("Digite a segunda nota de " + nomeAluno);
            int nota2 = sc.nextInt();
            System.out.println("Digite a terceira nota de " + nomeAluno);
            int nota3 = sc.nextInt();
            System.out.println("A média final de " + nomeAluno + " é " + (nota1 + nota2 + nota3) / 3);
         } else if (num == 2) {
            System.out.println("Opção não criada");
         } else {
            System.out.println("Opção invalida");
         }

      } else if (usuario.equalsIgnoreCase("Aluno")) {
         System.out.println("Digite o seu nome");
         String nome = sc.nextLine();
         System.out.println("Olá Aluno " + nome + " seja bem vindo ");

      } else {
         System.out.println("Opção invalida ");
      }
      sc.close();
   }

}