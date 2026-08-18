import java.util.Random;

public class exercicio7 {
    static void main() {
        Random random = new Random();
        int [] x = new int[10];

        for (int i = 0; i < x.length; i++){
            x[i] = random.nextInt(1,10);
            System.out.print(x[i] + "\t");
        }
    }
}
