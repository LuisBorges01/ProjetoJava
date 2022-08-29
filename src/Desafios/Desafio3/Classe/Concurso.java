package Desafios.Desafio3.Classe;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Concurso {
    public int[] ArrayCodigoDoCurso ;
    public int condigoDoCurso;
    public int posicaoCodigo;
    public int loop;
    public int numeroDeVagas;
    public int numeroDeCandidatos;
    public int maiorNumerodeCadidatos;
    public int maior = 0;
    public int candidatosPorVaga;
    public int[] cont;
    public int totalCursos = 0;
    public int totalCandidatos;
    public int  media;
    public int condigoDoCursoMaior;


    Scanner in = new Scanner(System.in);
    
    public void print(){
       System.out.println("Código do curso: ");
       condigoDoCurso = in.nextInt();
       while(condigoDoCurso!=0){
        System.out.println("Número de vagas: ");
        numeroDeVagas = in.nextInt();
        System.out.println("Número de candidatos: ");
        numeroDeCandidatos =  in.nextInt();
        candidatosPorVaga =numeroDeCandidatos/numeroDeVagas;
        System.out.println("Candidatos por vaga: " + candidatosPorVaga);
        totalCandidatos = totalCandidatos + numeroDeCandidatos;
        if(numeroDeCandidatos > maior){
            maior = condigoDoCurso;
        }
        System.out.println("Código do curso: ");
        condigoDoCurso = in.nextInt();

    }
    System.out.println("===RELATÓRIO VESTIBULAR===");
    System.out.println("Curso com maior número de candidados por vagas: " + maior);
    System.out.println("Total de candidatos no vestibular: " + totalCandidatos);
 }
}
/*
double candivaga,maior=0;
int codigo, vagas,candidatos,total;

codigo = leiaInt("Codigo do curso:");
while(codigo!=0)
{
vagas= leiaInt("numero de vagas");
candidatos= leiaInt("quantidade de candidatos:");
candivaga=(double)candidatos/vagas;
imprima ("Candidatos por vaga:"+candivaga);
total=total+candidatos;
if(candidatos>maior)
{
maior=codigo;
}
codigo = leiaInt("Codigo do curso:");
}
imprima ("O curso que teve mais candidatos por vaga foi:"+maior);
imprima ("O total de candidatos pro vestibular foi:"+total);
}
*/
