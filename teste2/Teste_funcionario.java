package dioTeste.teste2;

public class Teste_funcionario {
    Funcionario novo_funcionario = new Funcionario();
    novo_funcionario.setNome("Ana");
    novo_funcionario.setRg("4444.444.222.90");

    int aumento_anual = (int) (novo_funcionario.salario_inicial * (1.5));
    int salario_atual = aumento_anual;
}
