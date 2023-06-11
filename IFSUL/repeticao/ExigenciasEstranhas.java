package IFSUL.repeticao;

import java.util.Scanner;

public class ExigenciasEstranhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, pares = 0 , impar = 0;
        for (int x = 0; x<10; x++){
            int num = sc.nextInt();
            soma += num;
            if(num%2 == 0){
                pares++;
            }
            if(num%2 != 0){
                impar++;
            }
        }
        System.out.println(soma);
        if (soma%2 == 0){
            System.out.println(pares);
        } else{
            System.out.println(impar);
        }
    }
}
