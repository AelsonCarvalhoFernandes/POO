package questaoC;

public class Animal {

	String especie;
	int datadeNascimento;
	String nome;
	int numeroDeRegistro;
	String LocalDeNascimento;
	
	public void cadastrar(String especie, int dataDeNascimento, String nome, int numeroDeRegistro, String LocalDeNascimento) {
		this.especie = especie;
		this.datadeNascimento = dataDeNascimento;
		this.nome = nome;
		this.numeroDeRegistro = numeroDeRegistro;
		this.LocalDeNascimento = LocalDeNascimento;
		
	}
	
	public void atualizar(String especie, int dataDeNascimento, String nome, int numeroDeRegistro, String LocalDeNascimento) {
		this.especie = especie;
		this.datadeNascimento = dataDeNascimento;
		this.nome = nome;
		this.numeroDeRegistro = numeroDeRegistro;
		this.LocalDeNascimento = LocalDeNascimento;
		
	}
	
	public void listarCaracteristicas() {
		System.out.println(
				"Especie: " + this.especie + "\n"+
				"Data de Nascimento: " + this.datadeNascimento + "\n"+
				"Nome: " + this.nome + "\n"+
				"Numero de registro: " + this.numeroDeRegistro + "\n"+
				"Local de nascimento" + this.LocalDeNascimento + "\n"
				);
	}
}
