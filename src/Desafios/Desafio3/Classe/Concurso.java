package Desafios.Desafio3.Classe;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Concurso {
    public int codigoDoCurso;
    public int tamanho = 1;
    public int[] ArrayPosiçãoCódigoDoCurso = new int[tamanho];
    public int numeroCanditados;
    public int totalCandidatosVestibular;
    public int numeroDeVagas;
    public int candidatosPorVaga;
    public int comparador;

    Scanner in = new Scanner(System.in);
    
    public void print(){
        do{
            System.out.println("CÓDIGO DO CURSO: ");
                codigoDoCurso = in.nextInt();
                this.tamanho = codigoDoCurso;
            //"-------------------------------"
            System.out.println("VAGAS PARA O CURSO: ");
                this.numeroDeVagas = in.nextInt();
            //"-------------------------------"
            System.out.println("NÚMERO DE CANDIDATOS: ");
            this.numeroCanditados = in.nextInt();
            comparador = numeroCanditados;
            this.totalCandidatosVestibular = totalCandidatosVestibular + numeroCanditados;

        }while(this.codigoDoCurso != 0);    
        verificação();
    }

    public void verificação(){
        System.out.println("CANDIDADOS TOTAIS: " + totalCandidatosVestibular);
        //"-----------------------------------------------------------------"
        this.candidatosPorVaga = (numeroDeVagas / numeroCanditados);
        if(this.numeroCanditados > comparador){
            int maior;
            maior = numeroCanditados;
        }

    }

}


/*
- Para cada curso, o número de candidatos por vaga;
- O total de candidatos do vestibular;
- O código do curso que teve o maior número de candidatos.
*/
