package Services;

public class Data {

    int range = 0;
    public Professores[] professores = new Professores[20];

    public void cadastrar(Professores professor){
        try{
            try{
                for (Professores prof : professores) {
                    if(professor.getCpf() == prof.getCpf()){
                        throw new Exception("O professor com o cpf: " + prof.getCpf() + " ja esta cadastrado no sistema");
                    }else if(professor.getRg() == prof.getRg()){
                        throw new Exception("O professor com o RG: " + prof.getRg() + " ja esta cadastrado no sistema");
                    }else{
                        professores[range] = professor;
                    }
                }
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("O banco está no seu limite: " + ex.getMessage());
            }

        }catch(Exception ex){
            System.out.println("Error ao cadastrar o professor: "+ ex.getMessage());
        }
    }

    public void excluir(String rg){
        try{
            for(int i = 0; i < professores.length; i++){
                Professores prof = professores[i];

                if(prof.getRg() == rg){
                    professores[i] = null;
                }
            }
        }catch(Exception ex){
            System.out.println("Error ao excluir o professor: "+ ex.getMessage());
        }
    }

    public void listAll(){
        for (Professores prof : professores) {
            if(prof.getDependentes() != null){
                System.out.println("Nome: " + prof.getNome() + "\n" + "Idade: " + prof.getIdade() + "\n" + "Sexo: " + prof.getSexo() + "\n" + "RG: " + prof.getRg() + "CPF: " + prof.getCpf() + "\n" + "Endereço: " + prof.getEndereco() + "\n");
            }else{
                System.out.println("Nome: " + prof.getNome() + "\n" + "Idade: " + prof.getIdade() + "\n" + "Sexo: " + prof.getSexo() + "\n" + "RG: " + prof.getRg() + "CPF: " + prof.getCpf() + "\n" + "Endereço: " + prof.getEndereco() + "\n");
            }
        }
    }
}
