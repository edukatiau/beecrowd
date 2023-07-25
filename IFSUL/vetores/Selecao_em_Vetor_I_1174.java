package IFSUL.vetores;

import java.util.Scanner;

public class Selecao_em_Vetor_I_1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[100];

        for(int x = 0; x < 100; x++){
            double num = sc.nextDouble();
            vetor[x] = num;
            if(num <= 10){
                System.out.printf("A[%d] = %.1f\n", x, vetor[x]);
            }
        }

    }
}
