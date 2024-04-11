import java.util.Scanner;

public class DiarioDeNotas {
   public static void main(String[] args) {

      Aluno a1 = new Aluno();
      Professor p1 = new Professor();

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você um professor ou 'Sair' para finalizar o programa");
      String usuario = sc.nextLine();

      if (usuario.equalsIgnoreCase("Aluno")) {
         a1.identificarAluno();
      } else if (usuario.equalsIgnoreCase("Professor")) {
         p1.identificarProfessor();
      } else if (usuario.equalsIgnoreCase("Sair")) {
         System.out.println("Saiu do programa");
      } else {
         System.out.println("Opção invalida");
      }

      sc.close();

   }
}