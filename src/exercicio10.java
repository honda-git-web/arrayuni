import java.util.Random;

public class exercicio10 {
    static void main() {
        Random random = new Random();

        int [] x = new int[10];
        int aux;

        System.out.print("Antes da ordenação");
        for (int i = 0; i < x.length; i++){
            x[i] = random.nextInt(5,123);
            System.out.println(x[i] + "\t");
        }

        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length - i; i++){
                if (x[i] > x[i + 1]){
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }
        System.out.print("\nDepois da ordenação");
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i] + "\t");
        }



    }
}
