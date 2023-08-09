package questaoA;

public class ProgramaCarro {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.cadastrar(1, "Fiat", "Azul", "uno", 2020, 4, "adtivado", "10", 50000, true);
        carro1.listar();

        carro2.cadastrar(1, "forf", "branco", "SUV", 2022, 4, "adtivado", "8", 90000, false);
        carro2.listar();
    }
}
