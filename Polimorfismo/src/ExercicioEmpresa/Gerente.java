package ExercicioEmpresa;

public class Gerente extends Funcionario {

    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public Gerente(int senha, int numeroDeFuncionariosGerenciados) {
        this.senha = senha;
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    


    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }

    public boolean autenticar(int senha) {
        if (this.getSenha() == senha) {
            return true;
        } else {
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

}
