package dioTeste.teste1;

public class Quadrado implements AreaCalculavel {

    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado(){
        return lado;
    }
    public void setLado(){
        this.lado = lado;
    }
    @Override
    public float getArea() {
        return (lado*lado);
    }
}


