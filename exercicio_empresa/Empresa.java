public class Empresa {

    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    private int posicaoLivre;

    // construtor
    public Empresa() {
        this.empregados = new Funcionario[5]; // tamanho inicial
        this.posicaoLivre = 0;
    }

    // método para adicionar funcionário
    public void adiciona(Funcionario f) {
        this.empregados[this.posicaoLivre] = f;
        this.posicaoLivre++;
    }

    // método para mostrar funcionários
    public void mostraEmpregados() {
        for (Funcionario f : empregados) {
            if (f != null) {
                System.out.println("Nome: " + f.getNome());
                System.out.println("Departamento: " + f.getDepartamento());
                System.out.println("Salário: " + f.getSalario());
                System.out.println("------------------------");
            }
        }
    }

    // verifica se funcionário existe
    public boolean contem(Funcionario f) {
        for (Funcionario emp : empregados) {
            if (emp == f) {
                return true;
            }
        }
        return false;
    }

    // aumenta o tamanho do array
    public void aumentaArray() {
        Funcionario[] novoArray = new Funcionario[this.empregados.length + 1];

        for (int i = 0; i < this.empregados.length; i++) {
            novoArray[i] = this.empregados[i];
        }

        this.empregados = novoArray;
    }
}