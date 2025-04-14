package teste1;

// Código realizado por Nicolas E. Ferreira EMI - Info
import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: "); // Entrada do Sistema
        int numero = dado.nextInt(); 
        int vetor[] = new int[10];
        
        Tabuada T1 = new Tabuada(numero, vetor); // Instancia a classe (cria um objeto)
        
        
        System.out.println(T1.analisarTabuada()); // Saída do Sistema
        T1.calcularTabuada();
        T1.exibirTabuada();
    }

}
