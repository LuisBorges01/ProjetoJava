package Desafios2.Desafio4.Classes;

import java.util.Scanner;

public class Impressao {
    public static void main(String[] args) {
        int numero;
        String string;

        Scanner in = new Scanner(System.in);

        System.out.println("Solicite uma string: ");
        string = in.nextLine();
        System.out.println("Solicite um número: \n===OBS: O número deve ser menor que 0.===");
        numero = in.nextInt();
        if(numero > string.length()){
            System.out.println("Número inválido.");
        }
        System.out.println("A letra correspondente é: " + string.charAt(numero));

    }
    
}
