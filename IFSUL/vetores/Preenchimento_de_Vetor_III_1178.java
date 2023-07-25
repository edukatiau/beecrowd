package IFSUL.vetores;

import java.util.Scanner;

public class Preenchimento_de_Vetor_III_1178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[100];

        double num = sc.nextDouble();

        for(int x = 0; x < 100; x++){
            vetor[x] = num;
            System.out.printf("N[%d] = %.4f\n", x, vetor[x]);
            num /= 2;
        }
    }
}
