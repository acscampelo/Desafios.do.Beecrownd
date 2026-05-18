package areacirculo;
import java.util.Scanner;

public class areaDoCirculo1002 {
    public void resolcao(){
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();
            double pi =  3.14159;

            double resultado = pi * (num * num);

            System.out.printf("A=%.4f\n" , resultado);

    }
}
