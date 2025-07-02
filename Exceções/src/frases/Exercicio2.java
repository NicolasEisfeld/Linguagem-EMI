
package frases;

public class Exercicio2 {
    public static void main(String[] args) {
        aumentaFrase F1 = new aumentaFrase();
        try {
            F1.converterParaMaiusculas();
        } catch(NullPointerException e) {
            System.out.println("String Vazia");
            System.out.println("Erro: " + e);
        }
    }
}
