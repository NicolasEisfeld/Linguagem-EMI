package ExercicioSistemaPessoa;

public class Sistema {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Henrique", "Rua Campos Salles, 14", "2512-4099"); // Cria o objeto p1

        System.out.println("Nome: " + p1.getNome()); // Exibe p1
        System.out.println("Endereço: " + p1.getEndereco());
        System.out.println("Telefone: " + p1.getTelefone());

        System.out.println(""); // Mutantes
        p1.setNome("Pedro");
        p1.setEndereco("Rua América, 178");
        p1.setTelefone("3712-2691");

        System.out.println("Nome: " + p1.getNome()); // Exibe novamente
        System.out.println("Endereço: " + p1.getEndereco());
        System.out.println("Telefone: " + p1.getTelefone() + "\n");

        // Questão 4
        Fornecedor f1 = new Fornecedor("Maria", "Rua Getúlio Vargas , 55", "3512-5544", 5000.00, 1500.00); // Cria o objeto f1

        System.out.println("Nome Fornecedor: " + f1.getNome()); // Exibe f1
        System.out.println("Endereço Fornecedor: " + f1.getEndereco());
        System.out.println("Telefone Fornecedor: " + f1.getTelefone());
        System.out.println("Valor do Crédito Fornecedor: " + f1.getValorCredito());
        System.out.println("Valor da Divida Fornecedor: " + f1.getValorDivida());

        System.out.println("Saldo Atual Fornecedor: " + f1.obterSaldo() + "\n");

        
        
        // Questão 6

        Empregado e1 = new Empregado("José", "Avenida Do Patrocínio, 799", "5231-7563", 23, 2500.00, 15); // Cria o objeto e1

        System.out.println("Nome Empregado: " + e1.getNome()); // Exibe e1
        System.out.println("Endereço Empregado: " + e1.getEndereco());
        System.out.println("Telefone Empregado: " + e1.getTelefone());
        System.out.println("Código Empregado: " + e1.getCodigoSetor());
        System.out.println("Salário Base Empregado: " + e1.getSalarioBase());
        System.out.println("Imposto Empregado: " + e1.getImposto() + "%");

        System.out.println("Salário Final Empregado: " + e1.calcularSalario()); // Exibe o salário final

    }
}
