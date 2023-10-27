package exercicio2;
public class Main {
    public static void main(String[] args) {
        // Criando 5 objetos da classe Funcionario
        Funcionario funcionario1 = new Funcionario("João", "joao@email.com", "123456789", "Vendas", 2500.0, "01/01/2022", "123456789");
        Funcionario funcionario2 = new Funcionario("Maria", "maria@email.com", "987654321", "RH", 3000.0, "01/02/2022", "987654321");
        Funcionario funcionario3 = new Funcionario("Pedro", "pedro@email.com", "456789123", "Financeiro", 3500.0, "01/03/2022", "456789123");
        Funcionario funcionario4 = new Funcionario("Ana", "ana@email.com", "321654987", "TI", 4000.0, "01/04/2022", "321654987");
        Funcionario funcionario5 = new Funcionario("Carlos", "carlos@email.com", "654987321", "Marketing", 4500.0, "01/05/2022", "654987321");

        // Criando um objeto Empresa
        Empresa empresa = new Empresa("Minha Empresa", "123456789");

        // Adicionando os funcionários à empresa
        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);
        empresa.adicionarFuncionario(funcionario3);
        empresa.adicionarFuncionario(funcionario4);
        empresa.adicionarFuncionario(funcionario5);

        // Imprimindo os atributos dos funcionários
        for (int i = 0; i < empresa.qtdeDeFuncionario; i++) {
            empresa.funcionarios[i].mostrarDados();
            System.out.println();
        }
    }
}
