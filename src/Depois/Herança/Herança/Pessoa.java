package Depois.Herança.Herança;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereço endereço;

    
    //const
    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Dentro do construtor de pessoa.");
    }
    
    //bloco inic
    static{
        System.out.println("Bloco de inicialização pessoa estático.");    
    }
    {
        System.out.println("Bloco de inicialização 1 pessoa.");    
    }
    {
        System.out.println("Bloco de inicialização 2 pessoa.");
    }



    // print
    public void print(){
        System.out.println(getNome());
        System.out.println(getCpf());
        System.out.println(endereço.getRua());
        System.out.println(endereço.getBairro());
    }
    // args

    public void setNome(String name){
        this.nome = name;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf; 
    }
    public void setEndereço(Endereço address){
        this.endereço = address;
    }
    public Endereço getEndereço(){
        return endereço;
    }
    
}
