package IFSUL.vetores;

import java.util.Scanner;

public class Preenchimento_de_Vetor_II_1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[1000];

        int t = sc.nextInt();
        
        int cont = 0;
        for (int i = 0; i < 1000; i++){
            if(cont == t)
                cont = 0;
            vetor[i] = cont;
            cont++;
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }
}
