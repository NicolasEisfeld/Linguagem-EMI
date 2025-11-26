package correcaoprova;

public class CorrecaoProva {

    public static void main(String[] args) {
        /*
            Passo a passo de como implementar o tratamento de eventos para um botão:
            1 - Criar uma classe listener que implementa ActionListener com o método actionPerformed()
            2 - No construtor do frame, instanciar o listener criado
            3 - Adicionar o listener a cada componente gráfico que possa ter interação do usuário
         */

        int x = 10;
        int y = 0;

        Calculadora calc = new Calculadora();

        try {
            System.out.println("Resultado: " + calc.dividir(x, y));
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por 0. Erro: " + e);
        }
        
        Produtor p1 = new  Produtor("A");
        Produtor p2 = new Produtor("B");
        
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        
        t1.start();
        t2.start();
        /*
        Checked: o programa nao compila
        Unchecked: o programa compila
        */
    }
}
