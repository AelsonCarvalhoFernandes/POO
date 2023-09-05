package MyClass;

public class Controle {

    Brinquedo brinquedo;

    public Controle(Brinquedo brinquedo){
        this.brinquedo = brinquedo;
    }

    public void mover(double val){
        this.brinquedo.setVelocidade(val);
    }
}
