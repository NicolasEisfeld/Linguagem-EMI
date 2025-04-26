package ExercícioEnsino;

public class Aluno {

    private String nome_aluno;
    private String num_matricula;
    private String nome_curso;
    private String nome_disciplinas[];
    private double notas1[];
    private double notas2[];
    private double notas3[];
    private double notas4[];

    public Aluno(String nome_aluno, String num_matricula, String nome_curso, String[] nome_disciplinas, double[] notas1, double[] notas2, double[] notas3, double[] notas4) {
        this.nome_aluno = nome_aluno;
        this.num_matricula = num_matricula;
        this.nome_curso = nome_curso;
        this.nome_disciplinas = nome_disciplinas;
        this.notas1 = notas1;
        this.notas2 = notas2;
        this.notas3 = notas3;
        this.notas4 = notas4;
    }

    public double calcularMedia(int disciplina) {
        double soma = 0;
        double media = 0;
        switch (disciplina) {
            case 0:
                for (int i = 0; i <= 3; i++) {
                    soma += notas1[i];
                }
                media = soma / notas1.length;
                break;

            case 1:
                for (int i = 0; i <= 3; i++) {
                    soma += notas2[i];
                }
                media = soma / notas2.length;
                break;
            case 2:
                for (int i = 0; i <= 3; i++) {
                    soma += notas3[i];
                }
                media = soma / notas3.length;
                break;               
            case 3: 
                for (int i = 0; i <= 3; i++) {
                    soma += notas4[i];
                }
                media = soma / notas4.length;
                break;
                

        }

        return media;
    }

    public boolean analisarMedia(int disciplina) {
        if (calcularMedia(disciplina) >= 7) {
            return true;
        } else {
            return false;
        }
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getNum_matricula() {
        return num_matricula;
    }

    public void setNum_matricula(String num_matricula) {
        this.num_matricula = num_matricula;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String[] getNome_disciplinas() {
        return nome_disciplinas;
    }

    public void setNome_disciplinas(String[] nome_disciplinas) {
        this.nome_disciplinas = nome_disciplinas;
    }

    public double[] getNotas1() {
        return notas1;
    }

    public void setNotas1(double[] notas1) {
        this.notas1 = notas1;
    }

    public double[] getNotas2() {
        return notas2;
    }

    public void setNotas2(double[] notas2) {
        this.notas2 = notas2;
    }

    public double[] getNotas3() {
        return notas3;
    }

    public void setNotas3(double[] notas3) {
        this.notas3 = notas3;
    }

    public double[] getNotas4() {
        return notas4;
    }

    public void setNotas4(double[] notas4) {
        this.notas4 = notas4;
    }

}
