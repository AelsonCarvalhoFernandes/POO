package MyClass;

public class Caminhao extends Brinquedo{

    @Override
    public void mover() {
        System.out.println("O Caminhão está se movendo");
        
    }

    @Override
    public void setVelocidade(int vel) {
        this.velocidade = (double) vel;
        System.out.printf("Velocidade: "+ this.velocidade);
        this.mover();
    }

    @Override
    public void setVelocidade(double vel) {
        this.velocidade = vel;
        System.out.printf("Velocidade: "+ this.velocidade);
        this.mover();
        
    }

    @Override
    public void setVelocidade(double vel, double acel) {
        this.velocidade = vel;
        this.aceleracao = acel;
        System.out.printf("Velocidade: "+ this.velocidade+"\n"+"Aceleração: "+this.aceleracao);
        this.mover();
        
    }
    
}
