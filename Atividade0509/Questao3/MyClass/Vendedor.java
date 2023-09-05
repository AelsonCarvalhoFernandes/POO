package Questao3.MyClass;

public class Vendedor {
    //  idade,nome
    private int idade;
    private String nome;

    public Vendedor(int idade, String nome){
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void vender(){
        System.out.println("O Vendedor " + this.nome + " esta vendendo");
    }
}
