public class TestaEmpresa {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        // Funcionário 1
        Funcionario f1 = new Funcionario();
        f1.setNome("Rafael");
        f1.setDepartamento("INFORMATICA");
        f1.setSalario(2000);
        f1.aumentaSalario(10);

        // Funcionário 2
        Funcionario f2 = new Funcionario();
        f2.setNome("Maria");
        f2.setDepartamento("BIBLIOTECA");
        f2.setSalario(3000);
        f2.aumentaSalario(5);

        // adicionando na empresa
        empresa.adiciona(f1);
        empresa.adiciona(f2);

        // mostrar funcionários
        empresa.mostraEmpregados();

        // testar se contém
        System.out.println("Existe? " + empresa.contem(f1));
    }
}