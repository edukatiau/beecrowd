package IFSUL.repeticao;

import java.util.Scanner;

public class AjudeErza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media = 0, mediaTurma = 0, alunosMediaCinco = 0, notaFinal = 0;

        for(int x = 1; x < 11; x++){
            notaFinal = 0;
            for (int y = 0; y < 5; y++){
                double nota = sc.nextDouble();
                notaFinal += nota;
            }
            media = notaFinal / 5.0;
            if(media >= 5) {
                alunosMediaCinco++;
            }
            mediaTurma += media;
            System.out.printf("Média do aluno %d: %.1f\n", x, media);
        }
        mediaTurma = mediaTurma / 20.0;
        double porcMediaCinco = (alunosMediaCinco * 100.0) / 20.0;
        System.out.printf("Média da turma: %.1f\n", mediaTurma);
        System.out.printf("Alunos com média maior ou igual a 5: %.1f%%\n", porcMediaCinco);
    }
}
