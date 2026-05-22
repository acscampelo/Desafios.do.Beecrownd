package calculoDeArea;
import java.util.Scanner;

public class calculoDaArea {
    public void resolucao(){
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double pi = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double triangulo = A*C/2;
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        double circulo = pi*(C*C);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        double trapezio = ((A+B)*C)/2;
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        double quadrado = B*B;
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        double rectangulo = A*B;
        System.out.printf("RETANGULO: %.3f\n" , rectangulo);

    }
}
