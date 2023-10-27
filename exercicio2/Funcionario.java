package exercicio2;
class Funcionario extends Pessoa {
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean estaNaEmpresa;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String rg) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.estaNaEmpresa = true;
    }

    public void bonificar(double aumento) {
        salario += aumento;
    }

    public void demitir() {
        estaNaEmpresa = false;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de entrada: " + dataEntrada);
        System.out.println("RG: " + rg);
        System.out.println("Está na empresa: " + (estaNaEmpresa ? "Sim" : "Não"));
    }
}
