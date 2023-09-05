## Questão 2

Considere os métodos abaixo. Indique se está sendo utilizada sobrecarga de método
ou sobrescrita. Explique e diga com que outro método esta sendo realizada a sobrecarga
ou sobrescrita (se for o caso).

public class A {
...
    public A() { ... }
    public A( int x ) { ... }
    public void m1() { ... }
    public void m1( int h ) { ... }
}

public class B extends A {
...
    public B() { ... }
    public void m1() { ... }
    public void m1( double x, double y ) { ... }
    public void m2() { ... }
}

2.1 Quais métodos realizam sobrescrita? Por quê?

    Na classe B que esta extendendo a classe A, O metodo m1 esta sendo sobrescrito para atender as necessidades da classe B.

2.2 Quais métodos realizam sobrecarga? Por quê?

    Na classe A o metodo construtor esta sofrendo sobrecarga onde um não recebe paramentros enquanto o outro recebe um parametro do tipo inteiro.

    Na classe A o metodo m1 esta sofrendo sobrecarga onde um não recebe parametro enquanto o outro recebe um parametro do tipo inteiro.

    Na classe B o metodo m1 esta sofrendo sobrecarga onde um não recebe parametro e o outro  recebe dois parametros do tipo double,