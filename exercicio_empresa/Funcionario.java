public class Funcionario {

    private String nome;
    private String departamento;
    private double salario;

    public void aumentaSalario(double porcentagem) {
        this.salario += this.salario * (porcentagem / 100);
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}