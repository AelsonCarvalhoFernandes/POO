package questaoB;

public class ProgramaContaPoupanca {
    public static void main(String[] args){
        ContaPoupanca conta1 = new ContaPoupanca();
        ContaPoupanca conta2 = new ContaPoupanca();

        conta1.cadastrar("Joao", 12345, 7171, "939940030399", "3288934994-1", 10000);
        conta2.cadastrar("Pedro", 34423, 8833, "939943993-12", "348998493-00", 15000);

        conta1.imprimirSaldo();
        conta1.imprimirSaldo();
    }
}
