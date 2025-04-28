import ExercicioBanco.Conta;
import ExercicioBanco.ContaCorrente;
import ExercicioBanco.ContaPoupanca;
import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.print("Quantos usuários deseja registrar? ");
        ArrayList<Conta> Usuarios = new ArrayList<>();

        int N = dado.nextInt();
        for (int i = 1; i <= N; i++) {
            String buffer = dado.nextLine();
            System.out.print("Digite o nome do Usuário " + i + ": ");
            String nome = dado.nextLine();

            System.out.print("Digite o saldo atual do Usuário " + nome + ": ");
            double saldo = dado.nextDouble();


            // Pergunta ao usuário qual tipo de conta deseja criar
            System.out.print("Digite o tipo de conta (1 - Corrente, 2 - Poupança): ");
            int tipoConta = dado.nextInt();

            Conta Usuario;
            if (tipoConta == 1) {
                // Conta Corrente
                Usuario = new ContaCorrente(i, nome, saldo);
                double limite = 0.05;
                Usuario.setLimite(limite); // Define o limite para a conta corrente
            } else {
                // Conta Poupança
                Usuario = new ContaPoupanca(i, nome, saldo);
                Usuario.setTaxa(0.05); // Definindo uma taxa de 5%
            }

            int decisao = 1;
            while (decisao != 0) {
                System.out.print("|------SISTEMA BANCÁRIO------|\nUsuário " + nome + "\n[1] Sacar\n[2] Depositar\n[0] Sair\nDigite um valor: ");
                decisao = dado.nextInt();
                if (decisao == 0) {
                    break;
                }
                if (decisao == 1) {
                    System.out.print("Digite o valor que deseja sacar: ");
                    double valor = dado.nextDouble();
                    Usuario.Sacar(valor);
                } else if (decisao == 2) {
                    System.out.print("Digite o valor que deseja depositar: ");
                    double valor = dado.nextDouble();
                    Usuario.Depositar(valor);
                } else {
                    System.out.println("Digite um valor válido.");
                }
            }
            Usuarios.add(Usuario);
        }

        for (int i = 0; i < Usuarios.size(); i++) {
            Conta Usuario = Usuarios.get(i);
            Usuario.exibirSaldo();
        }
    }
}
