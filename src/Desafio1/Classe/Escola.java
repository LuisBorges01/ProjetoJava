package Desafio1.Classe;

import java.util.Scanner;

public class Escola {
    public int serie;
    public int serieRelatada;
    public int media;
    public int porcentagem;
    public int livrosLidos;
    public int verificação;
    public int total;
    public int total2;
    public int total3;
    public int totalLivros;
    public int totalLivros2;
    public int totalLivros3;
    public int exec1;
    public int exec2;
    public int exec3;

    Scanner inScanner = new Scanner(System.in);

    public void metWhile(){    
        System.out.println("...");
        do{
            System.out.println("Em qual série está? ");
                this.serie = inScanner.nextInt();
                if(this.serie  == 3){
                    total3 = total3 + 1;
                   }else if(this.serie  == 2){
                       total2 = total2 + 1; 
                   }else if(this.serie  == 1){                
                       total = total + 1;    
                   }else if(this.serie == 0){
                    System.out.println("Não existe série '0'. ");
                    System.out.println("SEGUE RELATÓRIO: ");
                    verificação();
                   }
            System.out.println("Quantos livros você leu? ");
            livrosLidos = inScanner.nextInt();
                    if(this.serie == 3 && this.livrosLidos == 0){
                        exec3 = total3%this.livrosLidos;
                     continue;
                    }
            
        }while(this.serie != 0);
    }

    public void verificação(){
        System.out.println("---terceirão---");
            System.out.println("PORCENTAGEM DE ALUNOS QUE NÃO LERAM LIVROS: " + exec3);
        System.out.println("---segundão---");
            this.exec2 = total2 / livrosLidos;
            System.out.println("MÉDIA DE LIVROS LIDOS NO SEGUNDO ANO: " + exec2);
        System.out.println("---primeiro---");
            int exec1 = total;
            System.out.println("No primeiro ano há: "+ exec1 + " alunos.");
    }
 }
    
