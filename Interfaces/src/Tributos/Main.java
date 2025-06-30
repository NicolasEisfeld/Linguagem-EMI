package Tributos;

public class Main {

    public static void main(String[] args) {

        Pessoa P1 = new Pessoa(4500.00);
        System.out.println("Salário da Pessoa: " + P1.getSalario());
        SeguroDeVida S1 = new SeguroDeVida(36.00);
        System.out.println("Imposto do Seguro de Vida: " + S1.getImposto());
        ContaCorrente CC1 = new ContaCorrente(500.00);
        System.out.println("Saldo da Conta Corrente: " + CC1.getSaldo());

        GerenciadorDeImpostoRenda GI = new GerenciadorDeImpostoRenda();

        GI.adicionarTributos(P1);
        GI.adicionarTributos(S1);
        GI.adicionarTributos(CC1);
        
        System.out.println("Total de Impostos: " + GI.getTributo());
    }

}
