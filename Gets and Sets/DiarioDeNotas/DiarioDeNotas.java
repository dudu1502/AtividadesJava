import java.util.Scanner;

public class DiarioDeNotas {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

        
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        usuario u1 =  new usuario();
        

        System.out.println( "Digite 'Aluno' se você for um aluno e 'Professor' se você um professor ou 'Sair' para finalizar o programa");
        String usuario = sc.nextLine();

        u1.getUsuario();
        System.out.println("get: " + u1.getUsuario());
  
        if (usuario.equalsIgnoreCase("Aluno")) {
           a1.identificarAluno(usuario);
        } else if (usuario.equalsIgnoreCase("Professor")) {
           p1.identificarProfessor(usuario);
        } else if (usuario.equalsIgnoreCase("Sair")) {
           System.out.println("Saiu do programa");
        } else {
           System.out.println("Opção invalida");
        }
  
        sc.close();
  
     }

    
}