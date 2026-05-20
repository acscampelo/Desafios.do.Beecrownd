
package salario;
import java.util.Scanner;

public class calculoDeSalario {
    public void resolucao(){
        Scanner sc = new Scanner(System.in);
        int numberf = sc.nextInt();
        double horas = sc.nextDouble();
        double valorhoras = sc.nextDouble();

        double salario = horas*valorhoras;

        System.out.println("NUMBER = "+numberf);
        System.out.printf("SALARY = U$ %.2f\n",salario);

    }
}
