import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Excessoes{
    public static void main(String[] args){
        List<Aluno> alunos = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Oque deseja fazer:\n[1] Cadastrar aluno\n[2] Ver aluno");
        int escolha = scan.nextInt();

        if(escolha == 1){
            try{
            
                System.out.println("Digite a matricula do aluno:");
                String matricula = scan.nextLine();
    
                System.out.println("Digite o nome do aluno:");
                String nome  = scan.nextLine();
    
                System.out.println("Digite o endereço do aluno:");
                String endereco = scan.nextLine();
    
                Aluno aluno = new Aluno(nome, matricula, endereco);
    
                boolean tratamento = Tratamento.validate(aluno, alunos);
    
                if(tratamento){
                    alunos.add(aluno);
                }
    
    
            }catch(Exception ex){
                System.out.printf("Houve um erro ao pegar valores do teclado" + ex.getMessage());
            }
        }else if(escolha == 2){

            for (Aluno aluno : alunos) {
                System.out.printf("Nome: " + aluno.getNome() + " Matricula:" + aluno.getMatricula() + " endereço: " + aluno.getEndereco() );
            }
        }

        


    }
}