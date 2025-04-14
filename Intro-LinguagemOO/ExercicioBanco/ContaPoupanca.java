package ExercicioBanco;

public class ContaPoupanca extends Conta {

    private double taxa;

    public ContaPoupanca(int numero, String dono, double saldo) {

        super(numero, dono, saldo);

        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa() {
        this.taxa = taxa;
    }

    public void Sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;

        }
    }

}
