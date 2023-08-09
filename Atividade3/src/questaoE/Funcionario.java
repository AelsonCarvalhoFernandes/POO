package questaoE;

public class Funcionario {
    String nome;
    String dataDeNascimento;
    String rg;
    String cpf;
    String endereco;
    String naturalidade;
    double salario;
    String profissao;
    String grauDeInstrucao;

    public void cadastrar(String nome,
            String dataDeNascimento,
            String cpf,
            String rg,
            String endereco,
            String naturalidade,
            double salario,
            String profissao,
            String grauDeInstrucao
    ){

        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauDeInstrucao = grauDeInstrucao;


    }

    public void atualizar(String nome,
            String dataDeNascimento,
            String cpf,
            String rg,
            String endereco,
            String naturalidade,
            double salario,
            String profissao,
            String grauDeInstrucao
    ){

        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauDeInstrucao = grauDeInstrucao;


    }

    public void ImprimirDadosFuncionarios(){
        System.out.println(
            "Nome: " + this.nome + "\n"+
            "Data De Nascimento: " + this.dataDeNascimento + "\n"+
            "CPF: " + this.cpf + "\n"+
            "RG: " + this.rg + "\n"+
            "Endereço: " + this.endereco + "\n"+
            "Naturalidade: " + this.naturalidade + "\n"+
            "Salario: " + this.salario + "\n"+
            "Profissão: " + this.profissao + "\n"+
            "Grau de Instrução: " + this.grauDeInstrucao + "\n"
        );
    }
}
