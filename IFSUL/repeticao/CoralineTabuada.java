package IFSUL.repeticao;

import java.util.Scanner;

public class CoralineTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int x = 1; x < 11; x++){
            int mult = num * x;
            System.out.printf("%d x %d = %d\n", x, num, mult);
        }
    }
}
