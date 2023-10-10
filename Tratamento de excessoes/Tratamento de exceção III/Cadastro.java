import java.util.Scanner;

import Services.Data;
import Services.Professores;

public class Cadastro {
    public static void main(String[] args){

        boolean ligado = true;

        Scanner scan = new Scanner(System.in);

        Data data = new Data();

        while(ligado){
            System.out.print("Oque deseja fazer:\n[1] Cadastrar\n[2] Pesquisar\n[3] Excluir\n:");

            try{
                int escolha = scan.nextInt();

                if(escolha == 1){

                    System.out.print("Digite o nome\n");
                    String nome = scan.nextLine();

                    System.out.print("Digite da idade\n");
                    int idade = scan.nextInt();

                    System.out.println("Digite o sexo");
                    String sexo = scan.nextLine();

                    System.out.println("Digite o cpf:");
                    String cpf = scan.nextLine();

                    System.out.println("Digite o rg");
                    String rg = scan.nextLine();

                    System.out.println("Digite o endereço: ");
                    String endereco = scan.nextLine();

                    Professores professor = new Professores(nome, idade, sexo, cpf, rg, endereco);

                    System.out.println("Possui dependente:\n[1] Sim\n[2] Não");
                    escolha = scan.nextInt();

                    if(escolha == 1){
                        
                    }


                }
            }catch(Exception ex){
                System.out.println("Error ao cadastrar: " + ex.getMessage());
            }

        }
        

    }
}
