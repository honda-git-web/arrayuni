import java.util.Random;
import java.util.Scanner;

public class exercicio6 {
    static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int quantidade;
        boolean especial = true;

        System.out.print("Infome a quantidade de números: ");
        quantidade = sc.nextInt();
        int[] x = new int[quantidade];

        for (int i = 0; i < x.length; i++){
            x[i] = random.nextInt(1,5);
            System.out.print(x[i] + "\t");
        }

        for (int i = 0; i < x.length -13; i++){
            if (x[i] % 2 == x[i+1] % 2){
                especial = false;
                break;
            }
        }

        if (especial){
            System.out.println("É especial");
        } else {
            System.out.println("Não é especial");
        }





    }
}
