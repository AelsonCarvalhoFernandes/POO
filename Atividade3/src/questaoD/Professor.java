package questaoD;

public class Professor {

	String nome;
	String titulacao;
	String formacao;
	int cargaHoraria;
	double salario;
	String descricaoDaDisciplina;
	
	public void cadastrar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDaDisciplina){
		this.nome = nome;
		this.titulacao = titulacao;
		this.formacao = formacao;
		this.cargaHoraria = cargaHoraria;
		this.salario = salario;
		this.descricaoDaDisciplina = descricaoDaDisciplina;
	}

	public void update(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDaDisciplina){
		this.nome = nome;
		this.titulacao = titulacao;
		this.formacao = formacao;
		this.cargaHoraria = cargaHoraria;
		this.salario = salario;
		this.descricaoDaDisciplina = descricaoDaDisciplina;
	}

	public void alterarDescricaoDisciplina(String newDescription){
		this.descricaoDaDisciplina = newDescription;
	}

	public void ImprimirDadosProfessor(){
		System.out.println(
			"Nome: " + this.nome +"\n"+
			"titulação: " + this.titulacao +"\n"+
			"Formação: " + this.formacao +"\n"+
			"Carga horaria: " + this.cargaHoraria +"\n"+
			"Salario: " + this.salario +"\n"+
			"Descrição da disciplina: " + this.descricaoDaDisciplina +"\n"
		);
	}
}
