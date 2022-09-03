package Desafios2.Desafio8;

import java.util.Scanner;

public class Texto {
    public static void main(String[] args) {
        String texto;
        String procurarTexto = "";

        Scanner in = new Scanner(System.in);

        System.out.println("DIGITE UM TEXTO COM *ATÉ* 500 CARACTERES \n\nDigite seu texto: ");
        texto = in.nextLine();
        if(texto.length() > 500){
            System.out.println("Texto grande, reescreva um texto menor;");
        }else{
            System.out.println("Qual palavra deseja encontrar em seu texto? ");
            procurarTexto = in.nextLine();
            while(!procurarTexto.contains("parar")){
                if((texto.toLowerCase().contains(procurarTexto.toLowerCase())) == true){
                    System.out.println("Palavra Encontrada");
                }else{
                    System.out.println("Palavra Inexistente");
                    System.out.println("\n Qual palavra deseja encontrar em seu texto? ");
                    procurarTexto = in.nextLine();
                }
            }
            System.out.println("===ENCERRADO===");
        }
       
    }
    
}
