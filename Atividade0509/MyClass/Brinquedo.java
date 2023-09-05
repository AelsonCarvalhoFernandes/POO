package MyClass;

public abstract class Brinquedo {
    protected double velocidade;
    protected double aceleracao;

    abstract public void mover();

    abstract public void setVelocidade(int vel);

    abstract public void setVelocidade(double vel);

    abstract public void setVelocidade(double vel, double acel);
}
