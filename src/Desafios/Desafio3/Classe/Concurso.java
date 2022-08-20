package Desafios.Desafio3.Classe;

import java.util.Scanner;

public class Concurso {
    public int CdC = 0; //o código do curso
    public int NpV; //o número de vagas
    public int NdC; // número de candidatos.
    public int paraCadaCurso; //Curso
    public int loop = 1;
    public int[] candadatoPorVaga;
    public int totalCandidatos = 0;
    public int maiorNumeroCandidatos;

    Scanner in = new Scanner(System.in);

        public void print(){
            do{

                System.out.println("Código do curso: ");
                CdC = in.nextInt();
                loop = CdC;
                System.out.println(loop);
                System.out.println("O número de vagas do curso: ");
                NpV = in.nextInt();
                totalCandidatos = totalCandidatos + NpV;
        
                System.out.println("Número de candidatos no curso: ");
                NdC = in.nextInt();
                this.paraCadaCurso = NpV/NdC;
            }while(loop != 0);
            System.out.println("...");
            PorVaga();
            System.out.println("Candidatos no concurso.");
        }   

        public void PorVaga(){
            for(int i = 1;i != 0; i++){
            this.candadatoPorVaga[i] = this.paraCadaCurso;
            }
            System.out.println(this.candadatoPorVaga);
        }

    
}

/*
 * algoritmo "semnome"
var
nvagas, cm, cf, tc: inteiro
pcf, cpv, mncv: real
cadastrar: literal
curso, cod_c: caracter
inicio
cadastrar<- "s"
mncv<- 0
tc<- 0
enquanto cadastrar = "s" faca
escreva("O código do curso: ")
leia(cod_c)
escreva("O nº de vagas do curso: ")
leia(nvagas)
escreva("O nº de candidatos masculino: ")
cpv<- (cm + cf) / nvagas
pcf<- cf / (cm + cf) * 100
se(mncv<cpv) entao
mncv<- cpv
curso<- cod_c
fimse
escreval("------------------- x xx---------------------")
escreval("O numero de cadidatos por vaga é: ",cpv)
escreval("O curso ",cod_c," teve ",pcf," % de candidatas mulheres")
escreva("Cadastrar outro curso(s/n)? ")
leia(cadastrar)
fimenquanto
escreval("---------------------------------- x xx ------------------------------------")
escreval("O curso ",curso," teve o maior numero de cadidatos por vaga que é: ",mncv)
escreval("O total de candidatos é: ",tc)
fimalgoritmo
 */

/*for(int i=1;i!=0;i++){ 
    System.out.println("Código do curso" + i);
    CdC = in.nextInt();
}
totalCandidatos = totalCandidatos + CdC;*/
