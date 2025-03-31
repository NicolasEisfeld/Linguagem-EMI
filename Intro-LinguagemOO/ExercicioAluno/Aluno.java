package ExercicioAluno;

import java.util.Calendar;

public class Aluno {

    private String codigo;
    private String nome;
    private int ano_nascimento;
    private int mes_nascimento;
    private int dia_nascimento;
    private double nota_1;
    private double nota_2;

    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAno_nascimento() {
        return this.ano_nascimento;
    }

    public int getMes_nascimento() {
        return this.mes_nascimento;
    }

    public int getDia_nascimento() {
        return this.dia_nascimento;
    }

    public double getNota_1() {
        return this.nota_1;
    }

    public double getNota_2() {
        return this.nota_2;
    }

    public double calcularAnos() {
        Calendar dataAtual = Calendar.getInstance();

        int mesAtual = dataAtual.get(Calendar.MONTH) + 1; // O mês no sistema começa no 0, então adicionamos 1
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);

        int idade_ano;

        // Verifica se o mês de nascimento ainda não foi ou se é o mês atual mas o dia ainda não
        if (mes_nascimento > mesAtual || (mes_nascimento == mesAtual && dia_nascimento > diaAtual)) {
            idade_ano = dataAtual.get(Calendar.YEAR) - ano_nascimento - 1; // Se o mês de nascimento ainda não foi este ano

        } else {
            idade_ano = dataAtual.get(Calendar.YEAR) - ano_nascimento; // Se o mês de nascimento já foi ou é o mês atual

        }

        return idade_ano;
    }

    public int calcularMeses() {
        Calendar dataAtual = Calendar.getInstance();

        int anosDiferenca = dataAtual.get(Calendar.YEAR) - ano_nascimento;
        int mesesDiferenca = (dataAtual.get(Calendar.MONTH) + 1) - mes_nascimento;

        int idade_meses = anosDiferenca * 12 + mesesDiferenca;

        if (dataAtual.get(Calendar.DAY_OF_MONTH) < dia_nascimento) {

            idade_meses--; // Se o dia de nascimento é maior que o dia atual, subtrai um mês

        }

        return idade_meses;
    }

    public double calcularMedia(double nota_1, double nota_2) {
        double media = (nota_1 + nota_2) / 2;
        return media;
    }

    public void Exibir() {
        System.out.println("Codigo\t\tNome\t\t\tAno de Nascimento\tMês do Nascimento\tDia de Nascimento\tNota 1\tNota 2\tAnos e Meses de Vida\t\t\tMédia do Aluno\n"
                + codigo + "\t\t" + nome + "\t" + ano_nascimento + "\t\t\t" + mes_nascimento + "\t\t\t" + dia_nascimento + "\t\t\t" + nota_1 + "\t" + nota_2
                + "\t" + calcularAnos() + " anos ou " + calcularMeses() + " meses de vida\t\t" + calcularMedia(nota_1, nota_2));
    }

    public Aluno(String codigo, String nome, int ano_nascimento, int mes_nascimento, int dia_nascimento, double nota_1, double nota_2) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.mes_nascimento = mes_nascimento;
        this.dia_nascimento = dia_nascimento;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }

}
