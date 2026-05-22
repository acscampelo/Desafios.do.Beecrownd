package esfera;
import java.util.Scanner;
public class calculoEsfera {
    public void resolucao() {
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double volume = (4.0/3) * pi * (raio*raio*raio);
        System.out.printf("VOLUME = %.3f\n", volume);

    }
}
