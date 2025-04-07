package ExercicioBanco;

public class Conta {

    private int numero;
    private String dono;
    private double saldo;
    private double limite;

    public Conta(int numero, String dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;

    }

    public int getNumero() {
        return numero;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public int setNumero() { // Mutantes sem valores para alterar
        return numero;
    }

    public String setDono() {
        return dono;
    }

    public double setSaldo() {
        return saldo;
    }

    public double setLimite() {
        return limite;
    }

    public void Sacar(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
        } else {
            System.out.println("Limite indisponível");
        }

    }

    public void Depositar(double valor) {
        saldo += valor;
    }

    public void exibirSaldo() {
        System.out.println("(" + this.dono + ")" + " Saldo: " + this.saldo);
    }
}
