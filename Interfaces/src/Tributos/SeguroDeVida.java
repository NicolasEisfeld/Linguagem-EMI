
package Tributos;

public class SeguroDeVida implements Tributavel{
    private double imposto;
    
    public SeguroDeVida(double imposto) {
        this.imposto = imposto;
    }
    
    @Override
    public double calculaTributos() {
        return imposto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
}
