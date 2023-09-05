package Questao3;

import Questao3.MyClass.Loja;
import Questao3.MyClass.Vendedor;

public class AppLoja {
    public static void main(String[] args){
        Loja loja = new Loja("Supermercado", "Alimentos", "2023");

        Vendedor joao = new Vendedor(22, "João");

        loja.admitirVendedor(joao);

        loja.demitirVendedor();
    }
}

