package IFSUL.repeticao;

import java.util.Scanner;

public class DesafioPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int x = 0; x < n; x++){
            if (x < n-1) {
                System.out.print(n + " ");
            } else {
                System.out.print(n);
            }
        }
    }
}