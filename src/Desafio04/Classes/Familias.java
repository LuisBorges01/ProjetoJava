package Desafio04.Classes;

import java.util.Scanner;


public class Familias {
    public int familia;
    public int n = 0;
    public int qtdFilhos;
    public int idadeFilhos;
    public int maior = 0;
    public int totalFilhos;
    
    Scanner in = new Scanner(System.in);

    public void print(){
        System.out.println("Possui filhos?");
        System.out.println("1 - SIM ");
        System.out.println("2 - NÃO");
        familia = in.nextInt();
        while(familia == 1){
            totalFilhos = totalFilhos = familia;
            System.out.println("Quantos filhos? ");
            qtdFilhos = in.nextInt();
            System.out.println("Qual é a idade dos seus filhos? ");
            idadeFilhos = in.nextInt();
            if(idadeFilhos > maior){
                maior = idadeFilhos;
            }
            System.out.println("A IDADE DO FILHO MAIS VELHO: " + maior);
        }
        System.out.println("===RELATÓRIO===");
        System.out.println("A QUANTIDADE DE FAMILIAS QUE TEM FILHOS É: " + totalFilhos);
    }

}
