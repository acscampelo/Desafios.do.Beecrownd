package salarioComBonus;
import java.util.Scanner;


public class calculoDeSalarioComBonus {
    public void resolucao(){
        Scanner sc = new Scanner(System.in);
        String nomeF = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double vendasMes = sc.nextDouble();
        double salarioComBonus = (vendasMes*0.15);
        double salarioFinal = salarioComBonus + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);



    }




}
