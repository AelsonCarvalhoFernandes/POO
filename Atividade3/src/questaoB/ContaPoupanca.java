package questaoB;

public class ContaPoupanca {

	String nome;
    int numero;
    int agencia;
    String rg;
    String cpf;
    double saldo;
    
    public void cadastrar(String nome, int numero, int agencia, String rg, String cpf, double saldo) {
    	this.nome = nome;
    	this.numero = numero;
    	this.agencia = agencia;
    	this.rg = rg;
    	this.cpf = cpf;
    	this.saldo = saldo;
    }
    
    public void atualizar(String nome, int numero, int agencia, String rg, String cpf) {
    	this.nome = nome;
    	this.numero = numero;
    	this.agencia = agencia;
    	this.rg = rg;
    	this.cpf = cpf;
    	this.saldo = saldo;
    }
    
    public void imprimirSaldo() {
    	System.out.println(this.saldo);
    }
    
    
    
}
