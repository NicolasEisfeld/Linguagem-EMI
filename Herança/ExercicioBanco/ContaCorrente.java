package ExercicioBanco;

public class ContaCorrente extends Conta {

    private double limite;

    
    
    public ContaCorrente(int numero, String dono, double saldo) {

        super(numero, dono, saldo);

        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void Sacar(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;

        }
    }

}
