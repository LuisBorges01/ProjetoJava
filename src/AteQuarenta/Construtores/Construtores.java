package Construtores;

import javax.sql.rowset.serial.SQLInputImpl;

public class Construtores {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public void init(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }

    public void print(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }
    
    /*public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf(String nome){
        this.cpf = cpf;
    }
    public String getCpf(){
         return this.cpf;
    }
    public void setSalario(double salario){
        this.salario = salario;
        }*/
    
}
