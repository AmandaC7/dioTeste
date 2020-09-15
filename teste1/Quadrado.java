package dioTeste.teste1;

public class Quadrado implements AreaCalculavel {

    private int lado;

    public int getLado(){
        return lado;
    }
    public void setLado(){
        this.lado = lado;
    }
    @Override
    public float getArea() {
        int area = 0;
        area = lado * lado;
        return area;
    }
}


