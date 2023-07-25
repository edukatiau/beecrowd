package IFSUL.vetores;

import java.util.Scanner;

public class Substituicao_em_Vetor_I_1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for(int x = 0; x < 10; x++) {
            int num = sc.nextInt();

            if (num > 0) {
                vetor[x] = num;
            } else {
                vetor[x] = 1;
            }
            System.out.printf("X[%d] = %d\n", x, vetor[x]);
        }
    }
}