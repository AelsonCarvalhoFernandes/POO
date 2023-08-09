package questaoE;

public class ProgramaFuncionario {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.cadastrar("Pedro", "22/05/1994", "8488549944-7", "8849959945-98", "Rua logo ali", "Brasil", 8000, "Designer", "Ensino medio");
        funcionario2.cadastrar("joao", "24/07/2002", "488859944-2", "884889494-00", "Rua de baixo", "brasileiro", 1400, "zelador", "Ensino superior completo em engenharia");

        funcionario1.ImprimirDadosFuncionarios();
        funcionario2.ImprimirDadosFuncionarios();
    }
}
