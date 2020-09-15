package dioTeste.teste1;

public class Retangulo implements AreaCalculavel{

    private int lado;
    private int altura;
    public int getLado(){
        return lado;
    }
    public void setLado(){
        this.lado = lado;
    }
    public int getAltura(){
        return altura;
    }
    public void setAltura(){
        this.lado = altura;
    }
    @Override
    public float getArea() {
        int area = 0;
        int altura = 0;
        area = lado * altura;
        return area;
    }
}
