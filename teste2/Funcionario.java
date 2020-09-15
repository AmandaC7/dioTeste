package dioTeste.teste2;

public class Funcionario extends Pessoa {
    @Override
    public String getNome(){
        return super.getNome();
    }
    @Override
    public String getRg(){
        return super.getRg();
    }
    int salario_inicial = 0;
    int percentual = 0;
    int salario_total = 0;
}
