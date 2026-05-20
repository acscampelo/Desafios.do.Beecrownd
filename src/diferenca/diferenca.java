package diferenca;
import java.util.Scanner;
public class diferenca {
    public void resolucao(){
        Scanner diferenca = new Scanner(System.in);

        int valor1 = diferenca.nextInt();
        int valor2  = diferenca.nextInt();
        int valor3  = diferenca.nextInt();
        int valor4  = diferenca.nextInt();


        int resulado = (valor1*valor2)  - (valor3 * valor4);
        System.out.println("DIFERENCA = "+resulado);






    }
}
