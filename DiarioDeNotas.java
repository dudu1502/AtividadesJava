import java.util.Scanner;

public class DiarioDeNotas {
    public static void main(String[] args) {

        String aluno = "1";
        String professor = "2";
        String sair = "3"; 

        Scanner scanner = new Scanner(System.in);  
        System.out.println("Digite 1 para professor e 2 para aluno e 3 para sair");
        String TipoDeUsuario = scanner.nextLine();
        if (aluno == "1") {
            System.out.println("Você é professor");
        }
        else if (professor == "2") {
            System.out.println("Você é um aluno");
        }
        else if (sair == "3") {
            System.out.println("Saiu do programa");
        }
}
}