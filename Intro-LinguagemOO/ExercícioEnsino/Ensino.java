package ExercícioEnsino;

import java.util.Scanner;

public class Ensino {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        String nome_disciplinas[] = new String[3];
        System.out.print("Digite o nome do Aluno: ");
        String nome_aluno = dado.nextLine();
        System.out.print("Digite a Matrícula do Aluno: ");
        String matricula = dado.nextLine();
        System.out.print("Digite o nome do Curso do Aluno: ");
        String nome_curso = dado.nextLine();
        for (int i = 0; i <= 2; i++) {
            int indice_nome = i + 1;
            System.out.print("Digite o nome da " + indice_nome + "ª disciplina do Aluno: ");
            nome_disciplinas[i] = dado.nextLine();

        }

        double notas1[] = new double[4];
        double notas2[] = new double[4];
        double notas3[] = new double[4];
        double notas4[] = new double[4];
        
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                int indice_nota = j + 1;
                System.out.print("Digite a " + indice_nota + "ª nota da disciplina " + nome_disciplinas[i] + ": ");
                double nota = dado.nextDouble();
                switch (j) {
                    case 0:
                        notas1[j] = nota;
                        break;

                    case 1:
                        notas2[j] = nota;
                        break;

                    case 3:
                        notas3[j] = nota;
                        break;

                    case 4:
                        notas4[j] = nota;
                        break;
                }
            }

        }

        Aluno A1 = new Aluno(nome_aluno, matricula, nome_curso, nome_disciplinas, notas1, notas2, notas3, notas4);

        A1.calcularMedia(0);
        A1.calcularMedia(1);
        A1.calcularMedia(2);
        A1.calcularMedia(3);

        if (A1.analisarMedia(0) == true) {
            System.out.println("Aprovado na disciplina");
        } else {
            System.out.println("Reprovado na disciplina");
        }
        if (A1.analisarMedia(1) == true) {
            System.out.println("Aprovado na disciplina");
        } else {
            System.out.println("Reprovado na disciplina");
        }
        if (A1.analisarMedia(2) == true) {
            System.out.println("Aprovado na disciplina");
        } else {
            System.out.println("Reprovado na disciplina");
        }
        if (A1.analisarMedia(3) == true) {
            System.out.println("Aprovado na disciplina");
        } else {
            System.out.println("Reprovado na disciplina");
        }

    }
}
