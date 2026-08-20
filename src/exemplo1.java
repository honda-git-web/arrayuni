import java.util.Scanner;

public class exemplo1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

             int[] x = new int[7];

             for (int i = 0; i < x.length; i++){
                 System.out.println("Informe um valor: ");
                 x[i] = sc.nextInt();
             }

             for (int i = 0; i < x.length; i++){
                 System.out.println(x[i]);
             }


    }
}
