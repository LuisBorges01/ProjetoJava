package Desafio1.Classe;

import java.util.Scanner;

public class Escola2 {
    public int serie;
    public int alunos1 = 0;
    public int alunos2 = 0;
    public int alunos3 = 0;
    public int livrosLidos;
    public int livros3;
    public int livros2;
    public int livros1;
    public int livrosNãoLidos;
    Scanner iScanner = new Scanner(System.in);
 
    public void metWhile(){
        System.out.println("...");
        do{
        System.out.println("Está em qual série? ");
        serie = iScanner.nextInt();
            if(serie == 3){
                alunos3 = alunos3 + 1;
            }else if(serie == 2){
                alunos2 = alunos2 + 1;
            }else if(serie == 1){
                alunos1 = alunos1 + 1;
            }else if(serie == 0){
                System.out.println("Não há série '0'");
            }
        System.out.println("Quantos livros leu? ");
        livrosLidos = iScanner.nextInt();
            if(livrosLidos == 3){
                livros3 = livros3 +livrosLidos;
            }else if(livrosLidos == 2){
                livros2 = livros2 + livrosLidos;
            }else if(livros1 == 1){
                livros1 = livros1 + livrosLidos;
            }else if(livrosLidos == 0){
                livrosNãoLidos = 0;
                terceirão();
            }

        }while(serie != 0);  
    }    

    public void terceirão(){
        int terceirão;
        terceirão = alunos3/livrosNãoLidos;
        System.out.println(terceirão);
    }
}