
import java.util.Scanner;

public class ExClasses {

    public static void main(String[] arg) {

        Scanner aluno = new Scanner(System.in);

        String[][] Matriz = new String[5][5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno [" + (i + 1) + "]");
            for (int j = 0; j < 4; j++) {
                System.out.println("Aluno [" + (i + 1) + "] Dado [" + (j + 1) + "]");
                Matriz[i][j] = aluno.nextLine();

            }

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno [" + (i + 1) + "]");
            for (int j = 0; j < 1; j++) {
                System.out.println("Matricula do Aluno: " + Matriz[i][j]);
                System.out.println("Nome do Aluno: " + Matriz[i][j + 1]);
                System.out.println("Nota 1: " + Matriz[i][j + 2]);
                System.out.println("Nota 2: " + Matriz[i][j + 3]);

                float n1 = Float.valueOf(Matriz[i][j + 2]).floatValue();
                float n2 = Float.valueOf(Matriz[i][j + 3]).floatValue();

                if ((n1 + n2) / 2 >= 6) {
                    System.out.println("Nota final: " + ((n1 + n2) / 2) + " Aluno Aprovado");

                } else {
                    System.out.println("Nota final: " + ((n1 + n2) / 2) + " Aluno reprovado");

                }

            }

        }

    }
}