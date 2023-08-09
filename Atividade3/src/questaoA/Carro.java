package questaoA;

public class Carro{
    int codigo;
    int marca;
    String cor;
    String modelo;
    int anoFabricacao;
    int numeroPortas;
    String tipoCombustivel;
    String qualidadeDisponivel;
    double preco;
    boolean basico;

    public void cadastrar(int codigo, int marca, String cor, String modelo, int anoFabricacao, int numeroPortas, String tipoCombustivel, String qualidadeDisponivel, double preco, boolean basico){
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.qualidadeDisponivel = qualidadeDisponivel;
        this.preco = preco;
        this.basico = basico;
    }

    public void atualizar(int codigo, int marca, String cor, String modelo, int anoFabricacao, int numeroPortas, String tipoCombustivel, String qualidadeDisponivel, double preco, boolean basico){
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.qualidadeDisponivel = qualidadeDisponivel;
        this.preco = preco;
        this.basico = basico;
    }

    public void listar(){
        System.out.println("Veiculo:\n"
        +"Codigo: "+this.codigo+"\n"+"Marca: "+this.marca+"\n"+"Cor: "+this.cor+"\n"+"Modelo: "+this.modelo+"\n"+"Ano de fabricação:"+this.anoFabricacao+"\n"+"Numero de portas"+this.numeroPortas+"\n"+"Tipo de combustivel"+this.tipoCombustivel+"\n"+"Qualidade: "+this.qualidadeDisponivel+"\n"+"Preço: "+this.preco+"\n"+"Tipo: "+this.basico
        );
    }
}
