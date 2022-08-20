package Desafios.Desafio1.Classes;

import java.util.Scanner;

public class Estudante3 {
    private int media;
    private int[] serie = new int[] {1, 2, 3};
    private int nSerie;
    private int livrosLidos;
    private int zeroLivrosLidos;
    private int alunosPrimeiro;


    Scanner inScanner = new Scanner(System.in);

    public void print(){
        System.out.println("Declare sua série: ");
        nSerie = inScanner.nextInt();
        System.out.println("Quantos livros você leu?");
        livrosLidos = inScanner.nextInt(); }
        if(this.livrosLidos == 0){
            this.livrosLidos = this.zeroLivrosLidos;
        }
        for(int i = 0; i < 0; i++){
            System.out.println("Não existe série '0'. ");
        }
        nsEstudante2

    

    if(nSerie == 1){
        serie[1] = nSerie;
        System.out.println("Há quantos alunos na sua sala?");
        alunosPrimeiro = inScanner.nextInt();
    }else if(nSerie == 2){
        serie[2] = nSerie;
    }else{
        serie[3] = nSerie;
    }
    
    //Exec 3
    if(this.zeroLivrosLidos = true){
        int porcentagemAlunos = serie[3] / zeroLivrosLidos;
        System.out.println(porcentagemAlunos);
    }
    //Exec 2
    if(serie[2]){
        int livrosAlunos;
        livrosAlunos = serie[2] / livrosLidos;
        System.out.println(livrosAlunos);
    }
    //Exec 1
    if(serie[1]){
        System.out.println(this.alunosPrimeiro);
    }
    

  } 

