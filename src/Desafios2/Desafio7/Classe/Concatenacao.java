package Desafios2.Desafio7.Classe;

import java.util.Scanner;

public class Concatenacao {
    public static void main(String[] args) {
        String conctenadas = "";
        String Armazconctenadas = "";
        int porcentagem;
        int numVogais;
        int numCaracter = 0;
        int totalVogais = 0;


        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        conctenadas = in.nextLine();
        while(!conctenadas.contains("sair")){
            Armazconctenadas += conctenadas;
            System.out.println("Digite uma palavra:");
            conctenadas = in.nextLine();
        }
        System.out.println("O número de caracteres digitados é: " + Armazconctenadas.replace(" ", "").length());




        for (int i = 0; i < Armazconctenadas.length(); i++){    
            Armazconctenadas = Armazconctenadas.toLowerCase();
            if (Armazconctenadas.charAt(i) == 'a' || Armazconctenadas.charAt(i) == 'e' || Armazconctenadas.charAt(i) == 'i'|| Armazconctenadas.charAt(i) == 'o'|| Armazconctenadas.charAt(i) == 'u'){
                totalVogais++;
                continue;
            }
        }
        System.out.println("A porcentagem de vogais é: " + (totalVogais*100)/Armazconctenadas.replace(" ", "").length() + "%");
    }
    
}
/* */