package Depois.Isobrescrita;

public class Pessoa {
    private String nome;
    private int idade;
    
//mod object
    public String toString(){
        return "NOME: " + this.nome + "IDADE: " + this.idade;
    }

//args
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
}
