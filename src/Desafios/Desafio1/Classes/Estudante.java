package Desafios.Desafio1.Classes;

import java.util.Scanner;

public class Estudante {
Scanner scnaner = new Scanner(System.in);

    private String nome;

    private int[] serie = new int[3];
    private int[] numeroLivros;
    private int numeroAlunos;

    //construtor
    public Estudante(){
        System.out.println("Declare sua série:");
        serie.next;

    }
        

    public void calculandoAlunos(){
        this.numeroAlunos = serie[1];
           System.out.println("Na primeira série tem: " + this.numeroAlunos);   
    }

    //- A média da quantidade de livros lidos por um aluno que estão na segunda série;
    public void mediaLidos(){
        int result;
       result = this.numeroLivros[] / serie[2];
       System.out.println("A média de livros lidos na segunda série é: " + result);
    }

    //- A porcentagem de alunos que estão na terceira série e não leram livros no ano.
    public void porcentNaoLidos(){
        int porcentagem;
        if(this.numeroLivros[0]){
         porcentagem = serie[3] % numeroLivros[0];
         System.out.println("A porcentagem de alunos que não leram foi: " + porcentagem);
        }

    }



//Get and Set
    public void setSerie(int[] serie){
        this.serie = serie;
    }
    public int[] getSerie(){
        return this.serie;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNumeroLivros(int[] nLivros){
        this.numeroLivros = nLivros;
    }
    public int[] getNumeroLivros(){
        return this.numeroLivros;
    }
    public void setNumeroAlunos(int numeroAlunos){
        this.numeroAlunos = numeroAlunos;
    }
    public int getnumeroAlunos(){
        return this.numeroAlunos;
    }


    
}
