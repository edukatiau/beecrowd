package IFSUL.vetores;

import java.util.Scanner;

public class Troca_em_Vetor_I_1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];
        //int[] antvetor = new int[20];

        for(int x = 19; x >= 0; x--){
            int num = sc.nextInt();
            vetor[x] = num;
        }
        for(int x = 0; x < 20; x++){
            System.out.printf("N[%d] = %d\n", x, vetor[x]);
        }
    }
}
