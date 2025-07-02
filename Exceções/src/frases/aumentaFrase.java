package frases;

public class aumentaFrase {

    String frase = null;
    String novaFrase = null;

    public void converterParaMaiusculas() {
        try {
            novaFrase = frase.toUpperCase();
            System.out.println("Frase Antiga: " + frase);
            System.out.println("Frase Nova: " + novaFrase);
        } catch (NullPointerException e) {
            System.out.println("O frase inicial está nula, para solucionar o problema, foi lhe atribuito um valor default.");

        }
    }
    public void converterParaMaiusculas2() throws NullPointerException{
            novaFrase = frase.toUpperCase();
            System.out.println("Frase Antiga: " + frase);
            System.out.println("Frase Nova: " + novaFrase);
    }
}
