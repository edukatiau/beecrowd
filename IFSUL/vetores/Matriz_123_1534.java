package IFSUL.vetores;

import java.io.IOException;
import java.util.Scanner;

public class Matriz_123_1534 {
    public static void main(String[] args) throws IOException {
        {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                int tamanho = sc.nextInt();
                int[][] arr = new int[tamanho][tamanho];

                for (int i = 0; i < tamanho; i++) {
                    for (int j = 0; j < tamanho; j++) {
                        if (i + j == tamanho - 1) {
                            arr[i][j] = 2;
                        } else if (i == j) {
                            arr[i][j] = 1;
                        } else {
                            arr[i][j] = 3;
                        }
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
