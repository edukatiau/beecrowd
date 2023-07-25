package IFSUL.vetores;
import java.util.Scanner;
public class Abaixo_da_Diagonal_Principal_1184 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] arr = new double[12][12];

        String funcao = sc.next();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                double  num = sc.nextDouble();
                arr[i][j] = num;
            }
        }

        if(funcao.equals("S")) {
            double soma = 0.0;
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr.length; j++) {

                    if(i > j) {
                        soma += arr[i][j];
                    }

                }
            }
            System.out.printf("%.1f\n", soma);
        } else {
            double media = 0.0, count = 0.0;
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr.length; j++) {

                    if(i > j) {
                        media += arr[i][j];
                        count++;
                    }
                }
            }
            media /= count;
            System.out.printf("%.1f\n", media);
        }
    }
}
