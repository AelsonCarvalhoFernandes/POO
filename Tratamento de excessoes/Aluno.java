public class Aluno {
    private String nome;
    private String matricula;
    private String Endereco;


    public Aluno(String nome, String matricula, String endereco) {
        this.nome = nome;
        this.matricula = matricula;
        Endereco = endereco;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getEndereco() {
        return Endereco;
    }


    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

}
