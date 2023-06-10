package IFSUL.repeticao;

import java.util.Scanner;

public class PoderGuerreiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        while (true){
            int nivel = sc.nextInt();

            if(nivel == 0){
                break;
            } else {
                if(nivel >= 100 && nivel <= 200){
                    x++;
                }
            }
        }
        System.out.println(x);
    }
}
