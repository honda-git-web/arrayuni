import java.util.Scanner;

public class exercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int [] x = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < x.length; i++){
            System.out.println("Digite um valor:");
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < x.length; i++){
            if (x[i] > maior) {
                maior = x[i];
            }
                if (x[i] < menor){
                    menor =x[i];
                }

        }
        System.out.println("maior valor: " + maior);
        System.out.println("menor valor: " + menor);
    }
}
