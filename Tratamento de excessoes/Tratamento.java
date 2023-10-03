import java.util.List;

public class Tratamento {
    public static boolean validate(Aluno aluno, List<Aluno> alunos) throws Exception{
        
        for (Aluno a : alunos) {
            if(a.getMatricula() == aluno.getMatricula()){
                Exception ex = new Exception("O aluno ja se encontra na base de dados");
                throw ex;
            }
        }

        return true;
    }
}
