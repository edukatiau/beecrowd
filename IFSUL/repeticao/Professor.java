package IFSUL.repeticao;

import java.util.Scanner;

public class Professor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        while(true){
            String texto = sc.next();

            if (texto.equals("0")){
                break;
            } else if (texto.equals("Professor") || texto.equals("professor") || texto.equals("PROFESSOR")) {
                cont++;
            }
        }

        System.out.println(cont);
    }
}
