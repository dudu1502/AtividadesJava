import java.util.Scanner;

public class Aluno extends Pessoa {
    
    int ra;
    Scanner sc = new Scanner(System.in);

    public Aluno(){
        super(nome, idade);
        this.ra;

        System.out.println("Digite seu ra: ");
        ra = sc.nextInt();
        sc.nextLine();

        sc.close();

    }

}
