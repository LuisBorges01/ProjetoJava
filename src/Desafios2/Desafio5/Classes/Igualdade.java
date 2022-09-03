package Desafios2.Desafio5.Classes;

import java.util.Scanner;

public class Igualdade {
    public static void main(String[] args) {
        String string1;
        String string2;

        Scanner in = new Scanner(System.in);

        System.out.println("String 1: ");
        string1 = in.nextLine();
        System.out.println("String 2: ");
        string2 = in.nextLine();
        if(string1.equalsIgnoreCase(string2)){
            System.out.println("As Strings são iguais, diferencia-as entre maiúsculos e minúsculos.");
        }else{
            System.out.println("As Strings são diferentes.");
        }
    }    
}
