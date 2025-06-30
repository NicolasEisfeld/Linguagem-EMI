
package Tributos;

public class Pessoa implements Tributavel{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Pessoa(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculaTributos() {
        return salario * 0.11;
    }
    
    
    
}
