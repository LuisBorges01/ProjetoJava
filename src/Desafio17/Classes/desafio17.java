package Desafio17.Classes;

import java.util.Arrays;
import java.util.Scanner;

public class desafio17{
    public static void main(String[] args) {
        String[] numeroTelefoneVetor = new String[30];
        String[] nomeVetor = new String[30];
        String[] enderecoVetor = new String[30];
        int aux = 0;
        String nomePesquisa;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("aux" + aux);
            System.out.println("Nome do contato");
            nomeVetor[aux] = in.next();

            System.out.println("Endereço");
            enderecoVetor[aux] = in.next();
            
            System.out.println("Número de telefone");
            numeroTelefoneVetor[aux] = in.next();
            
            aux++;
        }while(aux < 30);
        
        System.out.println("\nDigite o nome para pesquisa ");
        nomePesquisa = in.next();
        for(int i = 0; i < nomeVetor.length; i++){
            if(nomeVetor[i].equals(nomePesquisa)){
                System.out.println("Foi achado!");
                break;
            }
        }
        
        System.out.println("\n===RELATÓRIO====\n");
        for(int i=0;i<nomeVetor.length;i++){
        System.out.println(nomeVetor[i] + "|" + numeroTelefoneVetor[i] + "|" + enderecoVetor[i]);
        }


    }   
}
