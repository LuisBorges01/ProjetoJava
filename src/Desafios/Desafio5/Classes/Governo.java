package Desafios.Desafio5.Classes;

import java.util.Scanner;

public class Governo {
    public int numeroFamilias;
    public int SimouNão;
    public int quantidadeFilhos;
    public int idadeFilhos;
    public int idadeFilhosArray[];
    public int maisVelho;
    public int quantidadeFamiliasFilhos;
    public int maior = 0;
    public int contador = 1;
    public int segundomaior = 0;
    public int menor;

    Scanner in = new Scanner(System.in);

    public void print(){
        System.out.println("Possui filhos?");
        System.out.println("'1'-- SIM | '2'-- NÃO ");
        SimouNão = in.nextInt();
        while(SimouNão == 1){
            quantidadeFamiliasFilhos = quantidadeFamiliasFilhos + 1;
            System.out.println("Quantos filhos? ");
            quantidadeFilhos = in.nextInt();
        
            while (contador <= quantidadeFilhos) {
                System.out.println("Qual é a idade do seu filho? ");
                idadeFilhos = in.nextInt();
                contador ++;
                if (idadeFilhos > maisVelho){
                    segundomaior = maisVelho;       
                    maisVelho = idadeFilhos;
                } 
            }            
            System.out.println("A idade do filho mais velho: " + maisVelho);
            //========================
            System.out.println("Possui filhos?");
            System.out.println("'1'-- SIM | '2'-- NÃO ");
            SimouNão = in.nextInt();
        }

        System.out.println("==RELATÓRIO===");
        System.out.println("A quantidade de famílias com filhos: " + quantidadeFamiliasFilhos);
    }
    
}
/*
        System.out.println("==RELATÓRIO===");
        System.out.println("A quantidade de famílias com filhos: " + quantidadeFamiliasFilhos);

 * if (idades[i] > idadeMaisVelha) {
                idadeMaisVelha = idades[i];
                nomeDaPessoaMaisVelha = nomes[i];
            }

             while(count <= quantidadeFilhos){
            if(idadeFilhos > maisVelho){
                maisVelho = idadeFilhos;
            }
                count++;
            }
 */