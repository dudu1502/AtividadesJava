import java.util.Scanner;

public class usuario {

    private String usuario;

    Scanner sc = new Scanner(System.in);

    public String getUsuario(){
        return usuario;
       }
    
       
       public void setUsuario(String usuario){
        this.usuario = usuario;
    
        System.out.println("Digite o seu usuario: ");
        setUsuario(sc.nextLine());

        sc.close();
       }


}
