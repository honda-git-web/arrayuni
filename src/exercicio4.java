import java.util.Scanner;

public class exercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double [] temperatura = new double[12];
        String [] mes = {"janeiro","fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
       double media = 0;

        for (int i = 0; i < temperatura.length; i++){
            System.out.println("Temperatura média de " + mes[i] + ": ");
            temperatura[i] = sc.nextDouble();
            media = media + temperatura[i];
        }
        media = media / temperatura.length;
        System.out.println("Média anual " + String.format("%.2f", media));
        for (int i = 0; i < temperatura.length; i ++){
            if (temperatura[i] > media){
                System.out.println(mes[i] + "  ");
                System.out.println(String.format("%.2f", temperatura[i]));
            }
        }
    }
}
