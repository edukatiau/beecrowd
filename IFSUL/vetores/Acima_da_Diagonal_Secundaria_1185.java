package IFSUL.vetores;
import java.util.Scanner;
public class Acima_da_Diagonal_Secundaria_1185 {

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

                    if(i+j <= 10) {
                        soma += arr[j][i];
                    }
                }
            }
            System.out.printf("%.1f\n", soma);
        } else {
            double media = 0.0, count = 0.0;
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr.length; j++) {


                    if(i+j <= 10) {
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
