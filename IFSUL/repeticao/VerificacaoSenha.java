package IFSUL.repeticao;

import java.util.Scanner;
//wrong error no beecrowd
public class VerificacaoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = 0;
        while(true){
            int pass = sc.nextInt();

            if(pass == 2014){
                times++;
                System.out.println("ACCESS GRANTED.");
                break;
            } else {
                times++;
                System.out.println("ACCESS DENIED");
            }
        }
        System.out.printf("The password was typed %d times.\n", times);
    }
}
