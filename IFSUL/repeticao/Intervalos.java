package IFSUL.repeticao;

import java.util.Scanner;

public class Intervalos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intervalo = 0;
        for (int x = 0; x < 10; x++){
            int num = sc.nextInt();
            if(num >= 10 && num <= 30){
                intervalo++;
            }
        }
        int foraIntervalo = 10 - intervalo;
        System.out.println(intervalo + "\n" + foraIntervalo);
    }
}
