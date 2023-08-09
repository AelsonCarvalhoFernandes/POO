package questaoD;

public class ProgramaProfessor {
    public static void main(String[] args){
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        professor1.cadastrar("Cleber", "Analista de sistema", "Analise e desenvolvimento de sistema", 90, 100000, "Programação orientada a objetos");
        professor2.cadastrar("Joao", "Educador Fisico", "educação fisica", 60, 7000, "Aula de educação fisica para alunos do ensino medio");

        professor1.ImprimirDadosProfessor();
        professor2.ImprimirDadosProfessor();
    }
}
