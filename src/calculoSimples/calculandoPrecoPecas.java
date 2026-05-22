package calculoSimples;
import java.util.Scanner;

public class calculandoPrecoPecas {
    public void resolucao() {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int quantpeca = sc.nextInt();
        double valor = sc.nextDouble();

        int code2 = sc.nextInt();
        int quantpeca2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double pagar = (quantpeca * valor) + (quantpeca2 * valor2);
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", pagar));


    }

}
