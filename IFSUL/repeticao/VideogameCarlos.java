package IFSUL.repeticao;

import java.util.Scanner;

public class VideogameCarlos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, i = 0;
        double media = 0;

        for(int x = 0; x < 8; x++){
            int valor = sc.nextInt();
            soma += valor;
            if(valor > 20){
                media += valor;
                i++;
            }
        }
        System.out.printf("%d\n", soma);
        if(i>0) {
            media = media / i;
            System.out.printf("%.2f\n", media);
        } else{
            System.out.println(0);
        }

    }
}