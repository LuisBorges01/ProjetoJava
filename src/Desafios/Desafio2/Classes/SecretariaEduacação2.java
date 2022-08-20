package Desafios.Desafio2.Classes;

import java.util.Scanner;

public class SecretariaEduacação2 {
    public int cont = 1;
    public double distanciaCentro;
    public int numeroAlunos;
    public int numeroAlunosTotal = 0;
    public String estradasAsfaltadas = "";
    public int quantidadeEscolas = 0;
    public double carneA;
    public double carneB;
    public double carneC;
    public double carneD;
    public double carneE;
    public int  execC = 0;


    Scanner iScanner = new Scanner(System.in);

    public void metWhile(){
    do{
        System.out.println("Nome da escola: ");
        System.out.println("Qual é a distância do centro? ");
        distanciaCentro = iScanner.nextInt();
        quantidadeEscolas = quantidadeEscolas + 1;//QUANTIDADE DE ESCOLAS 

        System.out.println("Qual é o número de alunos? ");
        numeroAlunos = iScanner.nextInt();
        numeroAlunosTotal = numeroAlunosTotal + numeroAlunos;
        escolaCarne();
        System.out.println("Tem asfalto? ");
        estradasAsfaltadas = iScanner.next();
        String estradas = " ";
        estradas = estradas + estradasAsfaltadas;
        if(estradas == "Não" && distanciaCentro > 15){           
            execC = execC + 1;
        }

        cont++;
    }while(cont <= 5);
    imprime();
    }

    public void imprime(){
        System.out.println("---RELATÓRIO----");
        double quantidadeCarne;
        double carneAluno = 0.5;
                carneA = (carneAluno * carneA);
                System.out.println("Para a escola 1 deve-se levar " + carneA + " KG por semana.");
                carneB = (carneAluno * carneB);
                System.out.println("Para a escola 2 deve-se levar " + carneB + " KG por semana.");
                carneC = (carneAluno * carneC);
                System.out.println("Para a escola 3 deve-se levar " + carneC + " KG por semana.");
                carneD = (carneAluno * carneD);
                System.out.println("Para a escola 4 deve-se levar " + carneD + " KG por semana.");
                carneE = (carneAluno * carneE);
                System.out.println("Para a escola 5 deve-se levar " + carneE + " KG por semana.");

                System.out.println("------------------------------------------------------------");
                System.out.println("A quantidade de escolas que tem mais que 15 km de distância do centro e que não possuem acesso por estrada asfaltada: " + execC);

                System.out.println("------------------------------------------------------------");
                System.out.println("A quantidade de alunos em escolas rurais é de: " + numeroAlunosTotal);
                
                
    }

    public void escolaCarne(){
            if(cont == 1){
                carneA = carneA + numeroAlunos;
            }else if(cont == 2){
                carneB = carneB + numeroAlunos;
            }else if(cont == 3){
                carneC = carneC + numeroAlunos;
            }else if(cont == 4){
                carneD = carneD + numeroAlunos;
            }else if(cont == 5){
                carneE = carneE + numeroAlunos;
            }
    }

    public void C(){
        System.out.println("Dentro do C. ");
        if(distanciaCentro > 15){
            System.out.println("Essa escola fica a mais de 15km de distância");
            execC = execC + 1;
        }
    }


}


/*
 *System.out.println("");
carneA = (carneAluno * carneA)
System.out.println("Para a escola 1 deve-se levar " + carneA " KG por semana.");
 */