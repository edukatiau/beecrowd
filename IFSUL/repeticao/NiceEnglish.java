package IFSUL.repeticao;

import java.util.Scanner;

public class NiceEnglish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mediaTurma = 0, notaFinal = 0, mediaB2 = 0, aprovados = 0;

        for(int x = 1; x < 4; x++){
            notaFinal = 0;
            for (int y = 0; y < 10; y++){
                double nota = sc.nextDouble();
                notaFinal += nota;
                if (nota >= 7){
                    aprovados++;
                }
            }
            mediaTurma = notaFinal / 10.0;
            mediaB2 += mediaTurma;
            System.out.printf("Média da Turma %d: %.1f\n", x, mediaTurma);
        }
        System.out.printf("Alunos aprovados: %.0f\n", aprovados);
        mediaB2 = mediaB2 / 3.0;
        System.out.printf("Média do nível B2: %.1f\n", mediaB2);
    }
}
