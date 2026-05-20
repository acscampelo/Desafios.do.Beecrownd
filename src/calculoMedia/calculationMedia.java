package calculoMedia;
import java.util.Scanner;

public class calculationMedia {
    public void resolcao(){
        Scanner input = new Scanner(System.in);

        double notaA= input.nextDouble();
        double notaB = input.nextDouble();
        double resultant = ((notaA * 3.5 ) + ( notaB * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n",resultant);





    }


}
