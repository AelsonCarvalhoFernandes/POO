import java.util.Scanner;

import MyClass.Brinquedo;
import MyClass.Caminhao;
import MyClass.Controle;
import MyClass.Helicoptero;
import MyClass.Navio;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o tipo de brinquedo:\n[1] Caminhão\n[2] Navio\n[3] Helicoptero");

        String escolha = scan.nextLine();
        
        if(escolha.equals("1")){
            Brinquedo caminhao = new Caminhao();
            Controle controle = new Controle(caminhao);

            System.out.println("Qual a velocidade do caminhão: ");

            double vel = scan.nextDouble();
            controle.mover(vel);

        }else if(escolha.equals("2")){
            Brinquedo navio = new Navio();
            Controle controle = new Controle(navio);

            System.out.println("Qual a velocidade do navio: ");

            double vel = scan.nextDouble();
            controle.mover(vel);

        }else if(escolha.equals("3")){
            Brinquedo helicoptero = new Helicoptero();
            Controle controle = new Controle(helicoptero);

            System.out.println("Qual a velocidade do helicoptero: ");

            double vel = scan.nextDouble();

            controle.mover(vel);
        }else{
            System.out.println("Não existe esse brinquedo!!!!!!!");
        }

    }
}
