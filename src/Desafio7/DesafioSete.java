package Desafio7;

import java.util.Scanner;

public class DesafioSete {
    public static void main(String[] args){
        String stringConcatenadas;
        int numCaracter;
        int porcentagemVogais;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        stringConcatenadas = in.nextLine();
        while(!stringConcatenadas.equals("sair")){
            stringConcatenadas += stringConcatenadas;
            System.out.println("Digite uma palavra: ");
            stringConcatenadas = in.nextLine();
        }
        

    }
}
