import java.util.Random;

public class exemplo2 {
    static void main() {
        Random random = new Random();
        int x;
        double y;

        x = random.nextInt(20);
        y = random.nextDouble();

        System.out.println(x);
    }
}
