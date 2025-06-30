package exceções;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceções {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Início do Main");

        /*
        try {
            System.out.print("Digite um Número: ");
            int num = input.nextInt();
        } catch(java.util.InputMismatchException e) {
            System.out.println("Você tem que digitar um número!");
        }
         */
        
        // Exemplos de Tratamento de Exceção
        metodo1();
        metodo2();
        testedivisão();
        try {
            metodo3();
        } catch(FileNotFoundException e) {
            System.out.println("Não é possivel abrir o arquivo");
        }
        System.out.println("Fim do Main");
    }
    

    public static void metodo1() {
        System.out.println("Início do Método 1");
        System.out.println("Fim do Método 1");
    }

    public static void metodo2() {
        System.out.println("Início do Método 2");
        int[] array = new int[10];

        for (int i = 0; i <= 15; i++) {
            try {
                array[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("deu ruim no código ai meu");
                System.out.println("Olha o erro ai: " + e);
            }

            System.out.println(i);

            System.out.println("Fim do Método 2");
        }
    }
    public static void testedivisão() {
        
        int i = 5571;
        try {
            i /= 0; 
        }
        catch(java.lang.ArithmeticException e) {
            System.out.println("Deu erro ai meu");
            System.out.println("Não é possivel dividir por zero");
        }

    }
    public static void metodo3() throws FileNotFoundException {
        System.out.println("Início do Método 3");
        new java.io.FileInputStream("arquivo.txt");
        System.out.println("Fim do Método 3");
    }
 

}
