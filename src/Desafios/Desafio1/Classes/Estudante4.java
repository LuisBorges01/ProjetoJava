package Desafios.Desafio1.Classes;

import java.util.Scanner;

public class Estudante4 {
    public int serie = 1;
    public int livrosLidos;
    public int media; 
    public int alunosPrimeiro;
    public int porcentagemNãoLidos;
    public int alunosPorSerie;
    public int serie1;
    public int serie2;
    public int serie3;
    public int relatorio;

    Scanner iScanner = new Scanner(System.in);

    public void print(){
        do{
        System.out.println("Declare sua série: ");
        this.serie = iScanner.nextInt();
        this.alunosPorSerie = this.serie;

        if(this.serie == 0){
            break;
        }
    
        System.out.println("Quantos livros você leu?");
        livrosLidos = iScanner.nextInt(); 
        if(this.relatorio == 2 || this.alunosPorSerie == 2){
            int mediaSegundo;
            mediaSegundo = livrosLidos/this.relatorio;
            System.out.println("Na segunda série a média de livros lidos foi: " + mediaSegundo + " por aluno.");
            }else if(this.relatorio==3 && livrosLidos <=0){
            double porcentagem;
            porcentagem = this.relatorio % 100;
            System.out.println("Porcentagem: " + porcentagem);
        }
        //"""""""""""""""""""""""""""""""""""""""""""
     } while(this.serie != 0);
     System.out.println("...");
    } 
}
/*
 *         if(serie==3 && livrosLidos <=0){
            double porcentagem;
            porcentagem = alunosPorSerie % 100;
            System.out.println("porcentagem: " + porcentagem);
        }else if(serie == 1){
            System.out.println("No primeiro ano há: " + serie + " alunos.");
        }else if(serie == 2){
            int mediaSegundo;
            mediaSegundo = livrosLidos/serie;
            System.out.println("Na segunda série a média de livros lidos foi: " + mediaSegundo + " por aluno.");
        }
 */