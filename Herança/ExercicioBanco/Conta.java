package ExercicioBanco;

public class Conta {

    protected int numero;
    protected String dono;
    protected double saldo;

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;

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


    public int setNumero() { // Mutantes sem valores para alterar
        return numero;
    }

    public String setDono() {
        return dono;
    }

    public double setSaldo() {
        return saldo;
    }


    public void Sacar(double valor) {
        if (valor <= (saldo)) {
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
