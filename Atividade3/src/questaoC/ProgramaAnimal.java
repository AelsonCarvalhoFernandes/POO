package questaoC;

public class ProgramaAnimal {
    public static void main(String[] args){
        Animal animal1 = new Animal();

        animal1.cadastrar("Mamifero", 2013, "Coala", 123, "Bahia/Porto Seguro");

        Animal animal2 = new Animal();
        animal2.cadastrar("Ave", 2019, "Galinha", 00, "Bahia/Eunapolis");

        animal1.listarCaracteristicas();
        animal2.listarCaracteristicas();
    }
}
