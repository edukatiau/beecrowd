package IFSUL.vetores;

import java.util.Scanner;

public class Preenchimento_de_Vetor_I_1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int num = sc.nextInt();
        for(int x = 0; x < 10; x++){
            vetor[x] = num;
            System.out.printf("N[%d] = %d\n", x, vetor[x]);
            num = num * 2;
        }
    }
}
