package Desafios.Desafio1.Classes;

import java.util.Scanner;

public class Estudante5 {
    public int serie;
    public int livrosLidos;
    public int media; 
    public int porcentagemNãoLidos;
    public int serie1 = 0;
    public int serie2 = 0;
    public int serie3 = 0;
    public int aluno1;
    public int aluno2;
    public int aluno3;
    public int livros2 = 0;
    public int livros3 = 0;
    public int alunos = 0;

    Scanner iScanner = new Scanner(System.in);


    public void print(){
        do{
        System.out.println("Declare a série: ");
        serie = iScanner.nextInt();
                if(serie ==1){
                    aluno1 = aluno1 + 1;
                }else if(serie == 2){
                    aluno2 = aluno2 + 1;
                    System.out.println("Dentro");
                    System.out.println("Quantos livros você leu? ");
                    livrosLidos = iScanner.nextInt();
                    livros2 = livros2 + livrosLidos;
                    continue;
                }else if(serie == 3){
                    aluno3 = aluno3 +1;

                }else if(serie == 0){
                    System.out.println("Não existe série '0'. ");
                    verificação();
                    terceiro();
                    return;
                }
        System.out.println("Quantos livros você leu? ");
        livrosLidos = iScanner.nextInt();
        if(livrosLidos == 0){ terceiro(); }
       }while(serie != 0);
    }

    public void verificação(){
        System.out.println("---PRIMEIRO ANO---");
        System.out.println("A quantidade de alunos no primeiro ano é: " + aluno1);

        System.out.println("---SEGUNDO ANO---");
        media = livros2 / aluno2;
        System.out.println("A média foi: " + media);
    }
    public void terceiro(){
        System.out.println("---TERCEIRO ANO---");
        if(aluno3 == 3){
            porcentagemNãoLidos = (livrosLidos*100) / aluno3;
            System.out.println(porcentagemNãoLidos);
            System.out.println("Leia mais livros;");
        }
        System.out.println("O terceirão está voando.");
    }
}
