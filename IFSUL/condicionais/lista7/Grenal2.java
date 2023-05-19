package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class Grenal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gremio = sc.nextInt();
        int inter = sc.nextInt();

        if (gremio > inter){
            System.out.println("Grêmio");
            System.out.println(gremio - inter);
        } else if (inter > gremio) {
            System.out.println("Internacional");
            System.out.println(inter - gremio);
        } else {
            System.out.printf("%d x %d\n", gremio, inter);
        }
    }
}