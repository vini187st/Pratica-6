package exercicio2;
class Empresa {
    String nome;
    String cnpj;
    int qtdeDeFuncionario;
    Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionario = 0;
        this.funcionarios = new Funcionario[100];
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (qtdeDeFuncionario < 100) {
            funcionarios[qtdeDeFuncionario] = funcionario;
            qtdeDeFuncionario++;
        }
    }
}