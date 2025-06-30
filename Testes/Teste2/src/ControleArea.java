// 2º Teste de Linguagem de Programação I
// Nicolas Eisfeld Ferreira 

// Questão 3
public class ControleArea {

    private double totalDaArea;

    public ControleArea() { // Inicializa com a variável zerada
        this.totalDaArea = 0;
    }

    public void registra(Retangulo R) {
        this.totalDaArea += R.calcularArea();
    }

    public double getTotalDaArea() {
        return totalDaArea;
    }

    public void setTotalDaArea(double totalDaArea) {
        this.totalDaArea = totalDaArea;
    }

}
