// 2º Teste de Linguagem de Programação I
// Nicolas Eisfeld Ferreira 

// Questão 1
public class Retangulo extends Figura {

    private double lado;
    private double altura;

    @Override // Sobreescreve o método calcularArea e calcularPerimetro
    public double calcularArea() {
        return lado * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado + altura);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
