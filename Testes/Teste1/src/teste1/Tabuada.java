
package teste1;

// Código realizado por Nicolas E. Ferreira EMI - Info


public class Tabuada {
    private int numero;
    private int valores[];

    public Tabuada(int numero, int[] valores) {
        this.numero = numero;
        this.valores = valores;
    }
    
    public String analisarTabuada() {
        String texto = "Tabuada de números ";
        
        if(numero < 4) {
            texto += "pequenos"; // Concadena a String texto com a String desejada.
        } else{
            if(numero < 10) {
                texto += "médios";
            } else {
                texto += "grandes";
            }
        }
        return texto; // Retorna o texto para exibir
    }
    
    public void calcularTabuada() {
        for(int i = 0; i < 10; i++) { 
             valores[i] = numero * (i+1);  // calcula o valor de acordo com a sua posição (i).          
        }
    }
    
    public void exibirTabuada() {
        System.out.println("TABELA DO NÚMERO " + numero +": ");
        for(int i = 0; i < 10; i++) { 
            System.out.println(i+1 + " x " + numero + " = " + valores[i]);
        }
    }
    
    
}
