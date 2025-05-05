package ExercicioEmpresa;

public class Empresa {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Jose Antonio", "111111111", 1000.00);
        f1.setNome("Jose Antonio");
        f1.setCpf("111111111");
        f1.setSalario(1000);

        System.out.println("Funcionario");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Cpf: " + f1.getCpf());
        System.out.println("Salário: " + f1.getSalario());
        System.out.println("Bonificação: " + f1.getBonificacao() + "\n"); // Método que possui Polimorfismo

        
        Gerente f2 = new Gerente();
        f2.setNome("Pedro Henrique");
        f2.setCpf("222222222");
        f2.setSenha(4321);
        f2.setSalario(5000);

        if (f2.autenticar(4321)) {
            System.out.println("ACESSO LIBERADO \n");
            System.out.println("Gerente");
            System.out.println("Nome: " + f2.getNome());
            System.out.println("Cpf: " + f2.getCpf());
            System.out.println("Salário: " + f2.getSalario());
            System.out.println("Bonificação: " + f2.getBonificacao()); // Método que possui Polimorfismo
        } else {
            System.out.println("ACESSO NEGADO");
            System.out.println("A senha está incorreta");
        }

        ControleBonificacoes controle = new ControleBonificacoes();
        controle.registrar(f1);
        controle.registrar(f2);
        System.out.println("O total de bonificações é: " + controle.getTotalDeBonificacoes());
    }
}
