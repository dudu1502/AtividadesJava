public class EstruturaDeSelecaoIf {
    public static void main(String[] args) {
        int nota = 90;

        if(nota >= 70){
            System.out.println("Aprovado conceito C");
        }
         else if(nota >= 80){
            System.out.println("Aprovado conceito B");
        }
         else if(nota >= 90){
            System.out.println("Aprovado conceito A");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}