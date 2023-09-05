package Questao3.MyClass;

public class Loja {
    // nome,ramo ,ano de fundação, vendedor

    private String nome;
    private String ramo;
    private String anoDeFundacao;
    private Vendedor vendedor;

    public Loja(String nome, String ramo, String anoDeFundacao){
        this.nome = nome;
        this.ramo = ramo;
        this.anoDeFundacao = anoDeFundacao;
    }

    // admitirVendedor e demitirVendedor

    public void admitirVendedor(Vendedor vendedor){
        this.vendedor = vendedor;
        this.vendedor.vender();
    }

    public void demitirVendedor(){
        System.out.print("O vendedor "+this.vendedor.getNome() +" foi demitido");
        this.vendedor = null;
    }

    public void dadosVendedor(){
        System.out.println("Nome: "+ this.vendedor.getNome()+"\nIdade: "+ this.vendedor.getIdade());
    }
}
