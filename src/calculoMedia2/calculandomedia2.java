package calculoMedia2;
import java.util.Scanner;

public class calculandomedia2 {
    public void resolucao(){
        Scanner notas = new Scanner(System.in);
        double notaA= notas.nextDouble();
        double notaB= notas.nextDouble();
        double notaC= notas.nextDouble();
        double resultado= ((notaA*2)+(notaB*3)+(notaC*5))/10;
        System.out.printf("MEDIA = %.1f\n",resultado);
    }
}
