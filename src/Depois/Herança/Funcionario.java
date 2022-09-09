package Depois.Herança;

import Depois.Herança.Herança.Pessoa;

public class Funcionario extends Pessoa {
    private double salario;

    // bloco de inic
    static {
        System.out.println("Bloco de inicialização funcionario estático.");
    }

    {
        System.out.println("Bloco de inicialização funcionario 1.");
    }

    {
        System.out.println("Bloco de inicialização funcionario 2.");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário.");
    }

    public void print() {
        super.print();
        System.out.println(salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println(
                "Eu " + super.nome + " recebi o recibo de pagamento, referente ao valor de: R$ " + this.salario);
    }

    public void setSalario(double wage) {
        this.salario = wage;
    }

    public double getSalario() {
        return this.salario;
    }
}
